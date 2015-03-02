// ============================================================================
//
// Copyright (C) 2006-2014 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.talend.core.CorePlugin;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.process.JobInfo;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.designer.core.IDesignerCoreService;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.runprocess.ItemCacheManager;
import org.talend.librariesmanager.model.ModulesNeededProvider;

/**
 * DOC xye class global comment. Detailled comment
 */
public class JavaProcessUtil {

    public static Set<ModuleNeeded> getNeededModules(final IProcess process, boolean withChildrens) {
        return getNeededModules(process, withChildrens, false);
    }

    public static Set<ModuleNeeded> getNeededModules(final IProcess process, boolean withChildrens, boolean forMR) {
        List<ModuleNeeded> modulesNeeded = new ArrayList<ModuleNeeded>();
        // see bug 4939: making tRunjobs work loop will cause a error of "out of memory"
        Set<ProcessItem> searchItems = new HashSet<ProcessItem>();
        if (withChildrens) {
            ProcessItem processItem = null;
            if (process.getVersion() != null) {
                processItem = ItemCacheManager.getProcessItem(process.getId(), process.getVersion());
            } else {
                processItem = ItemCacheManager.getProcessItem(process.getId());
            }
            if (processItem != null) {
                searchItems.add(processItem);
            }
        }

        // call recursive function to get all dependencies from job & subjobs
        getNeededModules(process, withChildrens, searchItems, modulesNeeded, forMR);

        // remove duplicates, and keep by priority the one got bundle dependency setup
        Collections.sort(modulesNeeded, new Comparator<ModuleNeeded>() {

            @Override
            public int compare(ModuleNeeded arg0, ModuleNeeded arg1) {
                if (arg0.getBundleName() == null && arg1.getBundleName() != null) {
                    return 1;
                }
                if (arg0.getBundleName() != null && arg1.getBundleName() != null && "".equals(arg0.getBundleName()) //$NON-NLS-1$
                        && !"".equals(arg1.getBundleName())) { //$NON-NLS-1$
                    return 1;
                }
                return 0;
            }

        });

        Set<String> dedupModulesList = new HashSet<String>();
        Iterator<ModuleNeeded> it = modulesNeeded.iterator();
        while (it.hasNext()) {
            ModuleNeeded module = it.next();
            // try to keep only real files (with extension, no matter be jar or other)
            // in some case it's not a real library, but just a text.
            if (!module.getModuleName().contains(".")) { //$NON-NLS-1$
                it.remove();
            } else if (dedupModulesList.contains(module.getModuleName())) {
                it.remove();
            } else {
                dedupModulesList.add(module.getModuleName());
            }
        }

        return new HashSet<ModuleNeeded>(modulesNeeded);
    }

    public static Set<String> getNeededLibraries(final IProcess process, boolean withChildrens) {
        return getNeededLibraries(process, withChildrens, false);
    }

    // for MapReduce job, if the jar on Xml don't set MRREQUIRED="true", shouldn't add it to
    // DistributedCache
    public static Set<String> getNeededLibraries(final IProcess process, boolean withChildrens, boolean forMR) {
        Set<String> libsNeeded = new HashSet<String>();
        for (ModuleNeeded module : getNeededModules(process, withChildrens, forMR)) {
            libsNeeded.add(module.getModuleName());
        }

        return libsNeeded;
    }

    private static void getNeededModules(final IProcess process, boolean withChildrens, Set<ProcessItem> searchItems,
            List<ModuleNeeded> modulesNeeded, boolean forMR) {
        IElementParameter headerParameter = process.getElementParameter(EParameterName.HEADER_LIBRARY.getName());
        if (headerParameter != null) {
            Object value = headerParameter.getValue();
            if (value != null) {
                String headerLibraries = (String) value;
                if (headerLibraries.indexOf(File.separatorChar) > 0
                        && headerLibraries.length() > headerLibraries.lastIndexOf(File.separatorChar) + 1) {
                    String substring = headerLibraries.substring(headerLibraries.lastIndexOf(File.separatorChar) + 1);
                    if (!"".equals(substring)) { //$NON-NLS-1$
                        modulesNeeded.add(getModuleValue(process, substring));
                    }
                }
            }
        }
        IElementParameter footerParameter = process.getElementParameter(EParameterName.FOOTER_LIBRARY.getName());
        if (footerParameter != null) {
            Object value = footerParameter.getValue();
            if (value != null) {
                String footerLibraries = (String) value;
                if (footerLibraries.indexOf(File.separatorChar) > 0
                        && footerLibraries.length() > footerLibraries.lastIndexOf(File.separatorChar) + 1) {
                    String substring = footerLibraries.substring(footerLibraries.lastIndexOf(File.separatorChar) + 1);
                    if (!"".equals(substring)) { //$NON-NLS-1$
                        modulesNeeded.add(getModuleValue(process, substring));
                    }
                }
            }
        }

        IElementParameter elementParameter = process.getElementParameter(EParameterName.DRIVER_JAR.getName());
        if (elementParameter != null && elementParameter.getFieldType() == EParameterFieldType.TABLE) {
            getModulesInTable(process, elementParameter, modulesNeeded);
        }

        if (process instanceof IProcess2) {
            Item item = ((IProcess2) process).getProperty().getItem();
            if (item instanceof ProcessItem) {
                List<ModuleNeeded> modulesNeededForRoutines = ModulesNeededProvider.getModulesNeededForRoutines(
                        (ProcessItem) item, ERepositoryObjectType.ROUTINES);
                if (modulesNeededForRoutines != null) {
                    modulesNeeded.addAll(modulesNeededForRoutines);
                }
                List<ModuleNeeded> modulesNeededForPigudf = ModulesNeededProvider.getModulesNeededForRoutines((ProcessItem) item,
                        ERepositoryObjectType.PIG_UDF);
                if (modulesNeededForPigudf != null) {
                    modulesNeeded.addAll(modulesNeededForPigudf);
                }
            }
        }

        List<? extends INode> nodeList = process.getGeneratingNodes();
        for (INode node : nodeList) {
            Set<ModuleNeeded> nodeNeededModules = getNeededModules(node, searchItems, withChildrens, forMR);
            if (nodeNeededModules != null) {
                modulesNeeded.addAll(nodeNeededModules);
            }
        }
    }

    public static Set<ModuleNeeded> getNeededModules(final INode node, boolean withChildrens, boolean forMR) {
        return getNeededModules(node, null, withChildrens, forMR);
    }

    private static Set<ModuleNeeded> getNeededModules(final INode node, Set<ProcessItem> searchItems, boolean withChildrens,
            boolean forMR) {
        if (searchItems == null) {
            searchItems = new HashSet<ProcessItem>();
        }

        List<ModuleNeeded> modulesNeeded = new ArrayList<ModuleNeeded>();
        addNodeRelatedModules(node.getProcess(), modulesNeeded, node, forMR);

        if (withChildrens) {
            if (node.getComponent().getName().equals("tRunJob")) { //$NON-NLS-1$
                IElementParameter processIdparam = node.getElementParameter("PROCESS_TYPE_PROCESS"); //$NON-NLS-1$
                IElementParameter processVersionParam = node.getElementParameter(EParameterName.PROCESS_TYPE_VERSION.getName());

                ProcessItem processItem = null;
                if (processVersionParam != null) {
                    processItem = ItemCacheManager.getProcessItem((String) processIdparam.getValue(),
                            (String) processVersionParam.getValue());
                } else {
                    processItem = ItemCacheManager.getProcessItem((String) processIdparam.getValue());
                }

                String context = (String) node.getElementParameter("PROCESS_TYPE_CONTEXT").getValue(); //$NON-NLS-1$
                if (processItem != null && !searchItems.contains(processItem)) {
                    // avoid dead loop of method call
                    searchItems.add(processItem);
                    JobInfo subJobInfo = new JobInfo(processItem, context);
                    // achen modify to fix 0006107
                    IDesignerCoreService service = CorePlugin.getDefault().getDesignerCoreService();
                    IProcess child = service.getProcessFromItem(subJobInfo.getProcessItem());
                    // Process child = new Process(subJobInfo.getProcessItem().getProperty());
                    // child.loadXmlFile();
                    JavaProcessUtil.getNeededModules(child, true, searchItems, modulesNeeded, forMR);
                }
            }
        }
        return new HashSet<ModuleNeeded>(modulesNeeded);
    }

    /**
     * DOC nrousseau Comment method "addNodeRelatedModules".
     *
     * @param process
     * @param modulesNeeded
     * @param node
     */
    public static void addNodeRelatedModules(final IProcess process, List<ModuleNeeded> modulesNeeded, INode node) {
        addNodeRelatedModules(process, modulesNeeded, node, false);
    }

    public static void addNodeRelatedModules(final IProcess process, List<ModuleNeeded> modulesNeeded, INode node, boolean onlyMR) {
        if (!node.isActivate()) {
            // if node is deactivated, we don't need at all its dependencies.
            return;
        }
        List<ModuleNeeded> moduleList = node.getModulesNeeded();
        for (ModuleNeeded needed : moduleList) {
            if (needed.isRequired(node.getElementParameters())) {
                // for MapReduce job, if the jar on Xml don't set MRREQUIRED="true", shouldn't add it to
                // DistributedCache
                if (onlyMR && !needed.isMrRequired()) {
                    continue;
                }
                modulesNeeded.add(needed);
            }
        }
        for (IElementParameter curParam : node.getElementParameters()) {
            if (curParam.getFieldType() == null) {
                continue; // field can be null in some really specific cases, like for example when preview from
                // wizard.
            }
            if (!curParam.isShow(node.getElementParameters())) {
                continue;
            }
            if (curParam.getFieldType().equals(EParameterFieldType.MODULE_LIST)) {
                if (curParam.getValue() != null && !"".equals(curParam.getValue())) { // if the parameter //$NON-NLS-1$
                    // is not empty.
                    modulesNeeded.add(getModuleValue(process, (String) curParam.getValue()));
                }
            } else if (curParam.getFieldType() == EParameterFieldType.TABLE) {
                getModulesInTable(process, curParam, modulesNeeded);
            }
            findMoreLibraries(process, modulesNeeded, curParam);
        }
    }

    private static void getModulesInTable(final IProcess process, IElementParameter curParam, List<ModuleNeeded> modulesNeeded) {

        if (!(curParam.getValue() instanceof List)) {
            return;
        }
        List<Map<String, Object>> values = (List<Map<String, Object>>) curParam.getValue();
        if (values != null && !values.isEmpty()) {
            Object[] listItemsValue = curParam.getListItemsValue();
            if (listItemsValue != null && listItemsValue.length > 0 && listItemsValue[0] instanceof IElementParameter) {
                for (Object o : listItemsValue) {
                    IElementParameter param = (IElementParameter) o;
                    if (param.getFieldType() == EParameterFieldType.MODULE_LIST) {
                        for (Map<String, Object> line : values) {
                            String moduleName = (String) line.get(param.getName());
                            if (moduleName != null && !"".equals(moduleName)) { //$NON-NLS-1$

                                boolean isContextMode = ContextParameterUtils.containContextVariables(moduleName);
                                if (isContextMode) {
                                    List<IContext> listContext = process.getContextManager().getListContext();
                                    for (IContext context : listContext) {
                                        List<IContextParameter> contextParameterList = context.getContextParameterList();
                                        for (IContextParameter contextPara : contextParameterList) {
                                            String var = ContextParameterUtils.getVariableFromCode(moduleName);
                                            if (var.equals(contextPara.getName())) {
                                                String value = context.getContextParameter(contextPara.getName()).getValue();

                                                if (curParam.getName().equals(EParameterName.DRIVER_JAR.getName())
                                                        && value.contains(";")) { //$NON-NLS-1$
                                                    String[] jars = value.split(";"); //$NON-NLS-1$
                                                    for (String jar2 : jars) {
                                                        String jar = jar2;
                                                        jar = jar.substring(jar.lastIndexOf("\\") + 1); //$NON-NLS-1$
                                                        ModuleNeeded module = new ModuleNeeded(null, jar, null, true);
                                                        modulesNeeded.add(module);
                                                    }
                                                } else {
                                                    value = value.substring(value.lastIndexOf("\\") + 1); //$NON-NLS-1$
                                                    ModuleNeeded module = new ModuleNeeded(null, value, null, true);
                                                    modulesNeeded.add(module);
                                                }
                                            }
                                        }
                                    }

                                } else {
                                    modulesNeeded.add(getModuleValue(process, moduleName));
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    private static ModuleNeeded getModuleValue(final IProcess process, String moduleValue) {
        if (ContextParameterUtils.isContainContextParam(moduleValue)) {
            String var = ContextParameterUtils.getVariableFromCode(moduleValue);
            if (var != null) {
                IContext selectedContext = CorePlugin.getDefault().getRunProcessService().getSelectedContext();
                if (selectedContext == null) {
                    selectedContext = process.getContextManager().getDefaultContext();
                }
                IContextParameter param = selectedContext.getContextParameter(var);
                if (param != null) {
                    // add only the file name without path
                    ModuleNeeded module = getModuleNeededForContextParam(param);
                    return module;
                }
            }
        }
        return new ModuleNeeded(null, TalendTextUtils.removeQuotes(moduleValue), null, true);
    }

    /**
     * DOC YeXiaowei Comment method "findMoreLibraries".
     *
     * @param neededLibraries
     * @param curParam
     */
    public static void findMoreLibraries(final IProcess process, List<ModuleNeeded> modulesNeeded, IElementParameter curParam) {
        Object value = curParam.getValue();
        String name = curParam.getName();
        if (name.equals("DRIVER_JAR")) { //$NON-NLS-1$
            // added for bug 13592. new parameter DRIVER_JAR was used for jdbc connection
            if (value != null && value instanceof List) {
                List list = (List) value;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) instanceof HashMap) {
                        HashMap map = (HashMap) list.get(i); // JAR_NAME
                        Object object = map.get("JAR_NAME"); //$NON-NLS-1$
                        if (object != null && object instanceof String) {
                            String driverName = (String) object;
                            if (driverName != null && !"".equals(driverName)) { //$NON-NLS-1$
                                boolean isContextMode = ContextParameterUtils.containContextVariables(driverName);
                                if (isContextMode) {
                                    getModulesInTable(process, curParam, modulesNeeded);
                                } else {
                                    ModuleNeeded module = new ModuleNeeded(null, driverName, null, true);
                                    modulesNeeded.add(module);
                                }
                            }
                        }
                    }
                }
            }
        } else if (name.equals("DB_VERSION")) { //$NON-NLS-1$
            String jdbcName = (String) value;
            if (jdbcName != null) {
                String jars = (jdbcName).replaceAll(TalendTextUtils.QUOTATION_MARK, "").replaceAll( //$NON-NLS-1$
                        TalendTextUtils.SINGLE_QUOTE, ""); //$NON-NLS-1$
                String separator = ";"; //$NON-NLS-1$
                if (jars.contains(separator)) {
                    for (String jar : jars.split(separator)) {
                        if (!jar.contains(".")) { //$NON-NLS-1$
                            continue;
                        }
                        ModuleNeeded module = new ModuleNeeded(null, jar, null, true);
                        modulesNeeded.add(module);
                    }
                } else if (jars.contains(".")) { //$NON-NLS-1$
                    ModuleNeeded module = new ModuleNeeded(null, jars, null, true);
                    modulesNeeded.add(module);
                }
            }
        } else if (name.equals("HOTLIBS")) { //$NON-NLS-1$
            List<Map<String, Object>> tableValues = (List<Map<String, Object>>) value;
            Object[] listItemsValue = curParam.getListItemsValue();
            for (Map<String, Object> line : tableValues) {
                Object libPath = line.get("LIBPATH"); //$NON-NLS-1$
                if (libPath == null) {
                    continue;
                }
                String text = null;
                if (libPath instanceof String && !StringUtils.isEmpty((String) libPath)) {
                    text = (String) libPath;
                } else if (libPath instanceof Integer && listItemsValue != null) {
                    int index = ((Integer) libPath).intValue();
                    if (index > -1 && index < listItemsValue.length && listItemsValue[index] != null) {
                        if (listItemsValue[index] instanceof IElementParameter) {
                            text = (String) ((IElementParameter) listItemsValue[index]).getValue();
                        } else {
                            text = listItemsValue[index].toString();
                        }
                    }
                }
                if (text != null) {
                    boolean isContextMode = ContextParameterUtils.containContextVariables(text);
                    if (isContextMode) {
                        List<IContext> listContext = process.getContextManager().getListContext();
                        String var = ContextParameterUtils.getVariableFromCode(text);
                        for (IContext context : listContext) {
                            List<IContextParameter> contextParameterList = context.getContextParameterList();
                            for (IContextParameter contextPara : contextParameterList) {
                                String paramName = contextPara.getName();
                                if (var.equals(paramName)) {
                                    ModuleNeeded module = getModuleNeededForContextParam(contextPara);
                                    if (module != null && !modulesNeeded.contains(module)) {
                                        modulesNeeded.add(module);
                                    }
                                }
                            }
                        }
                    } else {
                        ModuleNeeded module = new ModuleNeeded(null, TalendTextUtils.removeQuotes(text), null, true);
                        modulesNeeded.add(module);
                    }
                }
            }
        } else if (name.equals(EParameterName.HADOOP_CUSTOM_JARS.getDisplayName())) {
            String jarsName = (String) value;
            if (StringUtils.isNotEmpty(jarsName)) {
                String jars = jarsName.replaceAll(TalendTextUtils.QUOTATION_MARK, "").replaceAll( //$NON-NLS-1$
                        TalendTextUtils.SINGLE_QUOTE, ""); //$NON-NLS-1$
                String separator = ";"; //$NON-NLS-1$
                for (String jar : jars.split(separator)) {
                    ModuleNeeded module = new ModuleNeeded(null, jar, null, true);
                    modulesNeeded.add(module);
                }
            }
        }
    }

    private static ModuleNeeded getModuleNeededForContextParam(IContextParameter contextParam) {
        if (contextParam != null) {
            String values = contextParam.getValue();
            if (StringUtils.isNotBlank(values)) {
                IPath path = new Path(values); // if it's path
                String fileName = path.lastSegment(); // get the file name only.
                ModuleNeeded module = new ModuleNeeded(null, fileName, null, true);
                return module;
            }
        }
        return null;
    }

    /**
     *
     * DOC hcyi Comment method "getContextOriginalValue".
     *
     * @param process
     * @param contextStr
     */
    public static String getContextOriginalValue(final IProcess process, String contextStr) {
        String originalValue = null;
        IContext context = process.getContextManager().getDefaultContext();
        if (context != null) {
            List<IContextParameter> contextParameterList = context.getContextParameterList();
            for (IContextParameter contextPara : contextParameterList) {
                String var = ContextParameterUtils.getVariableFromCode(contextStr);
                if (var.equals(contextPara.getName())) {
                    originalValue = context.getContextParameter(contextPara.getName()).getValue();
                    return originalValue;
                }
            }
        }
        return null;
    }

    /**
     * DOC ycbai Comment method "getRealParamValueByRunProcess".
     * <p>
     * Get the real parameter value by resolving the selected context on the run process view.
     * </p>
     *
     * @param process
     * @param value
     * @return
     */
    public static String getRealParamValueByRunProcess(IProcess process, String value) {
        IContext selectedContext = CorePlugin.getDefault().getRunProcessService().getSelectedContext();
        return getRealParamValue(process, value, selectedContext);
    }

    /**
     * DOC ycbai Comment method "getRealParamValue".
     * <p>
     * Get the real parameter value by resolving the default context of process.
     * </p>
     *
     * @param process
     * @param value
     * @return
     */
    public static String getRealParamValue(IProcess process, String value) {
        return getRealParamValue(process, value, null);
    }

    /**
     * DOC ycbai Comment method "getRealParamValue".
     * <p>
     * Get the real parameter value by resolving the selected context.
     * </p>
     *
     * @param process
     * @param value
     * @param selectedContext
     * @return
     */
    public static String getRealParamValue(IProcess process, String value, IContext selectedContext) {
        if (ContextParameterUtils.isContainContextParam(value)) {
            String var = ContextParameterUtils.getVariableFromCode(value);
            if (var != null) {
                if (selectedContext == null) {
                    selectedContext = process.getContextManager().getDefaultContext();
                }
                IContextParameter param = selectedContext.getContextParameter(var);
                if (param != null) {
                    return param.getValue();
                }
            }
        }
        return value;
    }

}
