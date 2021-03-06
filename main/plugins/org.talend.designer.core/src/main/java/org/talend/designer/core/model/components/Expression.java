// ============================================================================
//
// Copyright (C) 2006-2015 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.model.components;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.ArrayUtils;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.commons.utils.StringUtils;
import org.talend.commons.utils.system.EnvironmentUtils;
import org.talend.core.PluginChecker;
import org.talend.core.language.LanguageManager;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IElement;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;

/**
 * This class will test an expression in the element parameters. <br>
 * The expression can be for example: <br>
 * ((VAR1 == 'value1' and VAR2 == 'value2') or (VAR3 != 'value3')) or (VAR4 == 'value4') <br>
 * With VAR1, VAR2, VAR3 & VAR4 as the name of differents parameters and 'value1'.. the values to test. (values must be
 * between quotes)<br>
 * 
 * $Id$
 * 
 */
public final class Expression {

    private Expression leftExpression;

    private Expression rightExpression;

    private String condition; // and / or

    private String expressionString;

    private boolean valid;

    private static final String AND = "and"; //$NON-NLS-1$

    private static final String OR = "or"; //$NON-NLS-1$

    private static final String EQUALS = "=="; //$NON-NLS-1$

    private static final String NOT_EQUALS = "!="; //$NON-NLS-1$

    private static final String GREAT_THAN = ">"; //$NON-NLS-1$

    private static final String LESS_THAN = "<"; //$NON-NLS-1$

    private static final Pattern isShowFuncPattern = Pattern.compile("isShow\\[(\\w+)(\\.\\w+)*\\]"); //$NON-NLS-1$

    private Expression(String expressionString) {
        this.expressionString = expressionString;
    }

    private String getExpressionString() {
        return this.expressionString;
    }

    private void setExpressionString(String value) {
        this.expressionString = value;
    }

    private String getCondition() {
        return this.condition;
    }

    private void setCondition(String condition) {
        this.condition = condition;
    }

    private Expression getLeftExpression() {
        return this.leftExpression;
    }

    private void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }

    private Expression getRightExpression() {
        return this.rightExpression;
    }

    private void setRightExpression(Expression rightExpression) {
        this.rightExpression = rightExpression;
    }

    private boolean isValid() {
        return this.valid;
    }

    private void setValid(boolean value) {
        this.valid = value;
    }

    public static boolean evaluate(final String string, List<? extends IElementParameter> listParam) {
        return evaluate(string, listParam, null);
    }

    public static boolean evaluate(final String string, List<? extends IElementParameter> listParam, ElementParameter curParam) {
        if (Boolean.FALSE.toString().equals(string)) {
            return false;
        }
        if (Boolean.TRUE.toString().equals(string)) {
            return true;
        }

        if (string.contains("(") //$NON-NLS-1$
                && (isThereCondition(string, AND) || isThereCondition(string, OR))) {
            return evaluateExpression(new Expression(string), listParam, curParam).isValid();
        } else {
            String newValue; // remove brackets
            newValue = string.replace("(", ""); //$NON-NLS-1$ //$NON-NLS-2$
            newValue = newValue.replace(")", ""); //$NON-NLS-1$ //$NON-NLS-2$
            return evaluateSimpleExpression(newValue, listParam, curParam);
        }

    }

    public static boolean isThereCondition(String expression, String condition) {
        // example for the reg exp: (.*)[')][ ]*or[ ]*[\w(](.*)
        String refixReg = "(.*)[') ][ ]*"; //$NON-NLS-1$
        String suffixReg = "[ ]*[ (](.*)"; //$NON-NLS-1$
        if (expression.matches(refixReg + condition + suffixReg)) {
            return true;
        }
        if (expression.matches(refixReg + condition.toUpperCase() + suffixReg)) {
            return true;
        }
        return false;
    }

    /**
     * Only works for any check in the schema actually, and only for DB_TYPE. Syntax should be like:
     * 
     * SCHEMA.DB_TYPE IN ['BLOB','CLOB']
     * 
     * 
     * @param simpleExpression
     * @return
     */
    private static boolean evaluateInExpression(String simpleExpression, List<? extends IElementParameter> listParam) {
        String[] strings = null;
        if (simpleExpression.contains(" IN [")) { //$NON-NLS-1$
            strings = simpleExpression.split(" IN \\["); //$NON-NLS-1$
        } else {
            strings = simpleExpression.split(" IN\\["); //$NON-NLS-1$
        }
        String[] splittedString = strings[0].split("\\."); //$NON-NLS-1$
        String parameterName = splittedString[0]; // take parameter name (SCHEMA in example here)
        String variableToTest = splittedString[1]; // we take only the value DB_TYPE
        IElementParameter currentParam = null;
        for (IElementParameter param : listParam) {
            if (param.getName().equals(parameterName)) {
                currentParam = param;
                break;
            }
        }
        if (currentParam == null) {
            currentParam = listParam.get(0); // take the first one, in all case we only
        }
        // want to get the element linked

        String valuesToTest = strings[1].substring(0, strings[1].length() - 1); // string must be like:
                                                                                // 'BLOB','CLOB']
                                                                                // so remove the last ]
        String[] values = valuesToTest.split("'"); //$NON-NLS-1$
        if (values.length > 1) { // in this case we have something like: 'A','B','C' first, then values will be
            // like: <empty> / A / , / B / , / C / <empty>
            if ("SCHEMA".equals(parameterName) && variableToTest.contains("DB_TYPE")) { //$NON-NLS-1$ //$NON-NLS-2$
                IElement element = currentParam.getElement();
                if (element == null || (!(element instanceof INode))) {
                    throwUnsupportedExpression(simpleExpression, currentParam);
                    return false;
                }
                INode node = (INode) element;
                for (String value : values) {
                    if (value.isEmpty() || value.trim().equals(",")) { //$NON-NLS-1$
                        continue;
                    }
                    for (IMetadataTable table : node.getMetadataList()) {
                        for (IMetadataColumn column : table.getListColumns()) {
                            if (column.getType() != null && column.getType().equals(value)) {
                                return true;
                            }
                        }
                    }
                }
            } else if (currentParam.getFieldType() == EParameterFieldType.TABLE) {
                if (ArrayUtils.contains(currentParam.getListItemsDisplayCodeName(), variableToTest)) {
                    List<Map<String, Object>> allLines = (List<Map<String, Object>>) currentParam.getValue();
                    for (Map<String, Object> line : allLines) {
                        // for each line, check if the column we want have one of the value defined in the "IN".
                        Object o = line.get(variableToTest);
                        if (o != null && (o instanceof String)) {
                            String currentValue = (String) o;
                            for (String value : values) {
                                if (value.isEmpty() || value.trim().equals(",")) { //$NON-NLS-1$
                                    continue;
                                }
                                if (currentValue.equals(value)) {
                                    return true;
                                }
                            }

                        }
                    }
                }
            } else {
                throwUnsupportedExpression(simpleExpression, currentParam);
            }
        }
        return false;
    }

    private static void throwUnsupportedExpression(String simpleExpression, IElementParameter currentParam) {
        if (currentParam != null && currentParam.getElement() != null) {
            ExceptionHandler.process(new Exception("Element: '" + currentParam.getElement().getElementName() //$NON-NLS-1$
                    + "' does not support expression '" + simpleExpression + "'")); //$NON-NLS-1$ //$NON-NLS-2$
        } else {
            ExceptionHandler.process(new Exception("Expression '" + simpleExpression + "' not supported")); //$NON-NLS-1$//$NON-NLS-2$
        }
    }

    private static boolean evaluateSimpleExpression(String simpleExpression, List<? extends IElementParameter> listParam,
            ElementParameter currentParam) {
        boolean showParameter = false;
        String test = null;
        if (simpleExpression.contains(EQUALS)) {
            test = EQUALS;
        } else if (simpleExpression.contains(NOT_EQUALS)) {
            test = NOT_EQUALS;
        } else if (simpleExpression.contains(GREAT_THAN)) {
            test = GREAT_THAN;
        } else if (simpleExpression.contains(LESS_THAN)) {
            test = LESS_THAN;
        }
        if ((simpleExpression.contains(" IN [") || //$NON-NLS-1$ 
                simpleExpression.contains(" IN[")) && simpleExpression.endsWith("]")) { //$NON-NLS-1$ //$NON-NLS-2$
            return evaluateInExpression(simpleExpression, listParam);
        }

        List<String> paraNames = getParaNamesFromIsShowFunc(simpleExpression);
        if (paraNames.size() > 0) {
            // Here only be one isShow() function since it has been already split.
            String paraName = paraNames.get(0);
            try {
                checkIsShowLoop(paraName, simpleExpression, listParam, currentParam, null);
            } catch (Exception e) {
                ExceptionHandler.process(e);
                return false;
            }
            for (IElementParameter param : listParam) {
                if (paraName != null && paraName.equals(param.getName())) {
                    return param.isShow(param.getShowIf(), param.getNotShowIf(), listParam);
                }
            }
        }

        if (test == null) {
            throwUnsupportedExpression(simpleExpression, currentParam);
            return false;
        }

        String[] strings = simpleExpression.split(test);

        String variableName = null, variableValue = null;

        for (String string2 : strings) {
            String string = string2.trim();
            if (string.contains("'")) { // value //$NON-NLS-1$
                variableValue = string;
                variableValue = variableValue.substring(1, string.lastIndexOf("'")); //$NON-NLS-1$
            } else {
                variableName = string;
            }
        }
        /*
         * this is only for Current OS condition.
         */
        if (variableName != null && EParameterName.CURRENT_OS.getName().equals(variableName)) {
            if (variableValue != null) {
                if (checkCurrentOS(variableValue) && EQUALS.endsWith(test)) {
                    return true;
                } else if (NOT_EQUALS.equals(test)) {
                    return true;
                }
            }
        }
        if (listParam == null) {
            return false;
        }

        /*
         * this only used to check is EE version or not
         */
        if ("IS_STUDIO_EE_VERSION".equals(variableName)) {
            boolean isTIS = PluginChecker.isTIS();
            if ("true".equals(variableValue)) {
                return isTIS;
            } else {
                return !isTIS;
            }
        }

        // 3 levels of variable name accepted maximum (ex: MY_VAR.TABLE.FIELD == 'test')
        String[] varNames;
        varNames = StringUtils.split(variableName, '.');

        // wyang: only for bug:9055, to search the related Node, for example tFTPGet wants to check tFTPConnection info
        // variableName like: #LINK@NODE.CONNECTION.SFTP ----->it is a checkbox in tFTPConnection
        // #LINK@NODE, #PREVIOUS@NODE, #NEXT@NODE ----->implement them later

        if ((variableName != null) && (variableValue != null)) {
            if (varNames[0].equals("#LINK@NODE")) { //$NON-NLS-1$
                INode node = null;
                if (currentParam != null && currentParam.getElement() instanceof INode) {
                    node = (INode) currentParam.getElement();
                } else if (currentParam == null) {
                    if (listParam != null && listParam.size() > 0) {
                        IElement element = listParam.get(0).getElement();
                        if (element instanceof INode) {
                            node = (INode) element;
                        }
                    }
                }
                if (node != null) {
                    String relatedNodeName = ElementParameterParser.getValue(node, "__" + varNames[1] + "__"); //$NON-NLS-1$ //$NON-NLS-2$
                    // if relatedNodeName is empty, maybe means this property have not been setted
                    if (relatedNodeName != null && !relatedNodeName.trim().isEmpty()) {
                        List<? extends INode> generatingNodes = node.getProcess().getGeneratingNodes();
                        for (INode aNode : generatingNodes) {
                            if (aNode.getUniqueName().equals(relatedNodeName)) {
                                simpleExpression = simpleExpression.replace(varNames[0] + "." + varNames[1] + ".", ""); //$NON-NLS-1$ //$NON-NLS-2$//$NON-NLS-3$
                                List<? extends IElementParameter> elementParameters = aNode.getElementParameters();
                                // let's supose the currentParam = null, there won't want deal with the TABLE field,
                                // only deal with LIST/CHECKBOX
                                return evaluate(simpleExpression, elementParameters);

                            }
                        }
                    }
                }
            }
            /*
             * TESB-6240 GangLiu Test the connection configuration.
             */
            else if ("#LINK@CONNECTOR".equals(varNames[0])) {
                if (listParam != null && listParam.size() > 0) {
                    IElement element = listParam.get(0).getElement();
                    if (element != null && element instanceof INode) {
                        INode node = (INode) element;
                        if (varNames.length > 2 && varNames[1] != null && varNames[2] != null) {
                            // read in/out connection type accounts
                            List<? extends IConnection> connections = new ArrayList<IConnection>();
                            if ("IN".equals(varNames[1]) || "OUT".equals(varNames[1])) {
                                if ("IN".equals(varNames[1])) {
                                    if ("ANY".equals(varNames[2])) {
                                        connections = node.getIncomingConnections();
                                    } else {
                                        connections = node.getIncomingConnections(EConnectionType.valueOf(varNames[2]));
                                    }
                                } else {
                                    if ("ANY".equals(varNames[2])) {
                                        connections = node.getOutgoingConnections();
                                    } else {
                                        connections = node.getOutgoingConnections(EConnectionType.valueOf(varNames[2]));
                                    }
                                }
                                try {
                                    int connSize = connections.size();
                                    int targetNumber = Integer.parseInt(variableValue);
                                    if (GREAT_THAN.equals(test)) {
                                        return connSize > targetNumber;
                                    } else if (LESS_THAN.equals(test)) {
                                        return connSize < targetNumber;
                                    } else if (EQUALS.equals(test)) {
                                        return connSize == targetNumber;
                                    } else if (NOT_EQUALS.equals(test)) {
                                        return connSize != targetNumber;
                                    }
                                } catch (Exception e) {
                                }
                            } else {
                                // read specific connection parameter
                                connections = node.getOutgoingConnections(EConnectionType.valueOf(varNames[1]));
                                for (IConnection c : connections) {
                                    IElementParameter elementParameter = c.getElementParameter(varNames[2]);
                                    if (variableValue.equals(elementParameter.getValue())) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }// End of TESB-6240
            else if ("#NODE@IN".equals(varNames[0])) {
                if (listParam != null && listParam.size() > 0) {
                    IElement element = listParam.get(0).getElement();
                    if (element != null && element instanceof IConnection) {
                        INode sourceNode = ((IConnection) element).getSource();
                        // change from: #NODE@IN.SUBTREE_START == 'false'
                        // to: SUBTREE_START == 'false'
                        simpleExpression = simpleExpression.replace(varNames[0] + ".", ""); //$NON-NLS-1$ //$NON-NLS-2$                       
                        return evaluate(simpleExpression, sourceNode.getElementParameters());
                    }
                }
            } else if ("#NODE@OUT".equals(varNames[0])) {
                if (listParam != null && listParam.size() > 0) {
                    IElement element = listParam.get(0).getElement();
                    if (element != null && element instanceof IConnection) {
                        INode sourceNode = ((IConnection) element).getTarget();
                        // change from: #NODE@OUT.END_OF_FLOW == 'false'
                        // to: END_OF_FLOW == 'false'
                        simpleExpression = simpleExpression.replace(varNames[0] + ".", ""); //$NON-NLS-1$ //$NON-NLS-2$                       
                        return evaluate(simpleExpression, sourceNode.getElementParameters());
                    }
                }
            }
        }

        if ((variableName != null) && (variableValue != null)) {
            for (IElementParameter param : listParam) {

                if (param.getName().equals(varNames[0])) {
                    IElementParameter testedParameter = param;
                    Object value = null;
                    boolean found = false;
                    if (param.getFieldType().equals(EParameterFieldType.TABLE)) {
                        List<Map<String, Object>> tableValues = (List<Map<String, Object>>) param.getValue();
                        if (currentParam == null) {
                            continue;
                        }
                        if (tableValues.size() <= currentParam.getCurrentRow()) {
                            break;
                        }
                        Map<String, Object> currentRow = tableValues.get(currentParam.getCurrentRow());
                        if (currentRow.containsKey(varNames[1])) {
                            for (Object curObj : param.getListItemsValue()) {
                                if (curObj instanceof IElementParameter) {
                                    IElementParameter testParam = (IElementParameter) curObj;
                                    if (testParam.getName().equals(varNames[1])) {
                                        testedParameter = testParam;
                                        break;
                                    }
                                }
                            }
                            if (varNames.length == 2) { // simple value
                                value = currentRow.get(varNames[1]);
                            } else {
                                if ("TYPE".equals(varNames[2])) { //$NON-NLS-1$
                                    IMetadataTable baseTable = null;
                                    IMetadataColumn baseColumn = null;
                                    INode node;
                                    Object obj = currentRow.get(testedParameter.getName());
                                    String columnName = ""; //$NON-NLS-1$
                                    if (obj instanceof String) {
                                        columnName = (String) obj;
                                    } else if (obj instanceof Integer) {
                                        int index = (Integer) obj;
                                        if (index < testedParameter.getListItemsDisplayName().length && index >= 0) {
                                            columnName = testedParameter.getListItemsDisplayName()[(Integer) obj];
                                        }
                                    }
                                    if (currentParam.getElement() instanceof INode) {
                                        node = (INode) currentParam.getElement();

                                        switch (testedParameter.getFieldType()) {
                                        case COLUMN_LIST:
                                            baseTable = node.getMetadataList().get(0);
                                            break;
                                        case PREV_COLUMN_LIST:
                                            IConnection connection = null;
                                            for (int i = 0; i < node.getIncomingConnections().size(); i++) {
                                                IConnection curConnec = node.getIncomingConnections().get(i);
                                                if (curConnec.getLineStyle() == EConnectionType.FLOW_MAIN) {
                                                    connection = curConnec;
                                                    break;
                                                }
                                            }
                                            if (connection != null) {
                                                baseTable = connection.getMetadataTable();
                                            }
                                            break;
                                        case LOOKUP_COLUMN_LIST:
                                            List<IConnection> refConnections = new ArrayList<IConnection>();
                                            for (int i = 0; i < node.getIncomingConnections().size(); i++) {
                                                IConnection curConnec = node.getIncomingConnections().get(i);
                                                if (curConnec.getLineStyle() == EConnectionType.FLOW_REF) {
                                                    refConnections.add(curConnec);
                                                }
                                            }
                                            for (IConnection curConnec : refConnections) {
                                                IMetadataTable table = curConnec.getMetadataTable();
                                                for (IMetadataColumn column : table.getListColumns()) {
                                                    String name = curConnec.getName() + "." + column.getLabel(); //$NON-NLS-1$
                                                    if (name.equals(columnName)) {
                                                        baseColumn = column;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                        }

                                        if (baseTable != null) {
                                            for (IMetadataColumn column : baseTable.getListColumns()) {
                                                if (column.getLabel().equals(columnName)) {
                                                    baseColumn = column;
                                                    break;
                                                }
                                            }
                                        }

                                        if (baseColumn != null) {
                                            switch (LanguageManager.getCurrentLanguage()) {
                                            case JAVA:
                                                value = JavaTypesManager.getTypeToGenerate(baseColumn.getTalendType(),
                                                        baseColumn.isNullable());
                                                break;
                                            default:
                                                value = baseColumn.getTalendType();
                                            }
                                            if (value.equals(variableValue)) {
                                                found = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (param.getFieldType().equals(EParameterFieldType.PROPERTY_TYPE)
                            || param.getFieldType().equals(EParameterFieldType.SCHEMA_TYPE)
                            || param.getFieldType().equals(EParameterFieldType.QUERYSTORE_TYPE)
                            || param.getFieldType().equals(EParameterFieldType.ENCODING_TYPE)) {

                        boolean child = false;
                        Map<String, IElementParameter> childParameters = param.getChildParameters();

                        if ("PROPERTY".equals(param.getName())) { //$NON-NLS-1$
                            if (childParameters != null) {
                                IElementParameter iElementParameter = childParameters.get("PROPERTY_TYPE"); //$NON-NLS-1$
                                if (iElementParameter != null) {
                                    Object value2 = iElementParameter.getValue();
                                    if (variableValue.equals(value2.toString())) {
                                        child = true;
                                        found = true;
                                        value = value2.toString();
                                    }
                                }
                            }
                        }

                        if (varNames.length > 1 && varNames[1] != null) {
                            IElementParameter tempParam = childParameters.get(varNames[1]);
                            if (tempParam != null) {
                                value = tempParam.getValue();
                                if (value.equals(variableValue)) {
                                    found = true;
                                }
                                child = true;
                            }
                        }
                        if (!child) {
                            value = testedParameter.getValue();
                        }
                    } else {
                        value = testedParameter.getValue();
                    }
                    if (value instanceof Integer) {
                        if (((Integer) value) < testedParameter.getListItemsValue().length) {
                            value = testedParameter.getListItemsValue()[(Integer) value];
                        }
                    }
                    if (value instanceof String) {
                        if (variableValue.equals(value)) {
                            found = true;
                        } else if (testedParameter.getListItemsValue() instanceof Object[]) {
                            Object[] values = testedParameter.getListItemsValue();
                            for (int i = 0; i < values.length && !found; i++) {
                                if (values[i].equals(value)) {
                                    String variableCode = testedParameter.getListItemsDisplayCodeName()[i];
                                    if (variableCode.equals(variableValue)) {
                                        found = true;
                                    }
                                }
                            }
                        }
                    } else if (value instanceof Boolean) {
                        Boolean tmpValue = new Boolean(variableValue);
                        if (tmpValue.equals(value)) {
                            found = true;
                        }
                    }

                    if (found) {
                        if (test.equals(EQUALS)) {
                            showParameter = true;
                        }
                    } else {
                        if (test.equals(NOT_EQUALS)) {
                            showParameter = true;
                        }
                    }

                    break;
                }
            }
        }
        return showParameter;
    }

    private static List<String> getParaNamesFromIsShowFunc(String expr) {
        List<String> paraNames = new ArrayList<String>();
        if (expr == null) {
            return paraNames;
        }
        Matcher matcher = isShowFuncPattern.matcher(expr);
        while (matcher.find()) {
            String paraName = matcher.group(1) + (matcher.group(2) == null ? "" : matcher.group(2));
            if (!paraNames.contains(paraName)) {
                paraNames.add(paraName);
            }
        }

        return paraNames;
    }

    private static void checkIsShowLoop(String testParamName, String expression, List<? extends IElementParameter> listParam,
            IElementParameter currentParam, List<String> testedParaNames) throws Exception {
        List<String> paraNames = testedParaNames;
        if (paraNames == null) {
            paraNames = new ArrayList<String>();
        }
        String currentParaName = null;
        if (currentParam != null) {
            currentParaName = currentParam.getName();
            if (!paraNames.contains(currentParaName)) {
                paraNames.add(currentParaName);
            }
        }

        if (paraNames.contains(testParamName)) {
            if (currentParam != null) {
                throw new Exception("Expression \"" + expression + "\" of parameter \"" + currentParam.getName()
                        + "\" bring an endless loop by parameter \"" + testParamName + "\" in the element \""
                        + currentParam.getElement().getElementName() + "\". Please check and amend it!");
            } else {
                throw new Exception("Expression \"" + expression + "\" bring an endless loop by parameter \"" + testParamName
                        + "\". Please check and amend it!");
            }
        } else {
            paraNames.add(testParamName);
            for (IElementParameter param : listParam) {
                if (testParamName != null && testParamName.equals(param.getName())) {
                    List<String> paramNames = getParaNamesFromIsShowFunc(param.getShowIf());
                    for (String paramName : paramNames) {
                        checkIsShowLoop(paramName, expression, listParam, currentParam, paraNames);
                    }
                }
            }
        }
    }

    private static Expression evaluateExpression(Expression expression, List<? extends IElementParameter> listParam,
            ElementParameter currentParam) {
        int indexBegining = 0, indexEnd;
        int expressionLevel = 0;
        String string = expression.getExpressionString();
        boolean conditionFound = false;

        // if there's no braket then there should be only simple expression
        // or only one expression.
        for (int i = 0; i < string.length() && !conditionFound; i++) {
            if (string.charAt(i) == '(') {
                if (expressionLevel == 0) {
                    indexBegining = i + 1;
                }
                expressionLevel++;
            } else if (string.charAt(i) == ')') {
                expressionLevel--;
                indexEnd = i;

                if (expressionLevel == 0) {
                    if (isThereCondition(string, AND) || isThereCondition(string, OR)) {
                        String leftString = string.substring(indexBegining, indexEnd).trim();
                        if (isThereCondition(leftString, AND) || isThereCondition(leftString, OR)) {
                            Expression leftExpression = new Expression(leftString);
                            expression.setLeftExpression(leftExpression);
                            evaluateExpression(leftExpression, listParam, currentParam);
                        } else {
                            Expression leftExpression = new Expression(leftString);
                            expression.setLeftExpression(leftExpression);
                            leftExpression.setValid(evaluateSimpleExpression(leftString, listParam, currentParam));
                            // debug: System.out.println(leftString + " => " +
                            // leftExpression.isValid());
                        }
                    } else {
                        String newValue; // remove brackets
                        newValue = string.replace("(", ""); //$NON-NLS-1$ //$NON-NLS-2$
                        newValue = newValue.replace(")", ""); //$NON-NLS-1$ //$NON-NLS-2$
                        expression.setExpressionString(newValue);
                        expression.setValid(evaluateSimpleExpression(newValue, listParam, currentParam));
                    }
                }
            } else if (expressionLevel == 0) {
                if ((string.indexOf(AND, i) == i) || (string.indexOf(AND.toUpperCase(), i) == i)) {
                    String subStr = string.substring(i - 3, i + 5);
                    if (isThereCondition(subStr, AND)) {
                        expression.setCondition(AND);
                        conditionFound = true;
                    }
                } else if ((string.indexOf(OR, i) == i) || (string.indexOf(OR.toUpperCase(), i) == i)) {
                    String subStr = string.substring(i - 3, i + 5);
                    if (isThereCondition(subStr, OR)) {
                        expression.setCondition(OR);
                        conditionFound = true;
                    }
                }
            }
            if (conditionFound) {
                if (expression.getLeftExpression() == null) { // no bracket ==
                    // evaluate
                    // expression
                    String leftString = string.substring(0, i - 1).trim();
                    Expression leftExpression = new Expression(leftString);
                    expression.setLeftExpression(leftExpression);
                    leftExpression.setValid(evaluateSimpleExpression(leftString, listParam, currentParam));
                    // debug: System.out.println(leftString + " => " +
                    // leftExpression.isValid());
                }

                boolean needValidRightExpression = true;
                if (expression.getCondition().equals(AND) && !expression.getLeftExpression().isValid()) {
                    // if left expression is already false, then needn't continue to validate right expression
                    expression.setValid(false);
                    needValidRightExpression = false;
                } else if (expression.getCondition().equals(OR) && expression.getLeftExpression().isValid()) {
                    // if left expression is already true, then need't continue to validate right expression
                    expression.setValid(true);
                    needValidRightExpression = false;
                }

                if (needValidRightExpression) {
                    String rightString = string.substring(i + 3, string.length()).trim();
                    Expression rightExpression = new Expression(rightString);
                    expression.setRightExpression(rightExpression);
                    if (rightString.contains("(") //$NON-NLS-1$
                            || isThereCondition(rightString, AND) || isThereCondition(rightString, OR)) {
                        evaluateExpression(rightExpression, listParam, currentParam);
                    } else { // no bracket == evaluate expression
                        rightExpression.setValid(evaluateSimpleExpression(rightString, listParam, currentParam));
                        // debug: System.out.println(rightString + " => " +
                        // rightExpression.isValid());
                    }
                    if (expression.getCondition().equals(AND)) {
                        if (expression.getLeftExpression().isValid() && expression.getRightExpression().isValid()) {
                            expression.setValid(true);
                        } else {
                            expression.setValid(false);
                        }
                    } else if (expression.getCondition().equals(OR)) {
                        if (expression.getLeftExpression().isValid() || expression.getRightExpression().isValid()) {
                            expression.setValid(true);
                        } else {
                            expression.setValid(false);
                        }
                    }
                }
            }
        }
        // if after an expression between bracket there's no other expression,
        // then the validation of the expression
        // will depends on the "left" expression.
        if ((expression.getRightExpression() == null) && (expression.getLeftExpression() != null)) {
            expression.setValid(expression.getLeftExpression().isValid());
        }
        // debug: System.out.println(expression.getExpressionString() + " => " +
        // expression.isValid());
        return expression;
    }

    /*
     * check this OS
     */
    private static boolean checkCurrentOS(final String osName) {
        if (osName == null) {
            return false;
        }
        final String tmpOSName = osName.toLowerCase();
        // check windows
        if (EnvironmentUtils.isWindowsSystem() && tmpOSName.startsWith("windows")) { //$NON-NLS-1$
            return true;
        }
        // check MacOS
        if (EnvironmentUtils.isMacOsSytem() && tmpOSName.startsWith("mac")) { //$NON-NLS-1$
            return true;
        }
        // check linux and unix
        if (EnvironmentUtils.isLinuxUnixSystem()) {
            if (tmpOSName.startsWith("unix") || tmpOSName.startsWith("linux")) { //$NON-NLS-1$ //$NON-NLS-2$
                return true;
            }
        }
        return false;
    }

}
