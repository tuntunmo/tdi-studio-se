package org.talend.marketo;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;

import javax.wsdl.Definition;
import javax.wsdl.Types;
import javax.wsdl.extensions.ExtensibilityElement;
import javax.wsdl.extensions.schema.Schema;
import javax.wsdl.factory.WSDLFactory;
import javax.wsdl.xml.WSDLReader;
import javax.xml.namespace.QName;

import org.apache.ws.commons.schema.XmlSchema;
import org.apache.ws.commons.schema.XmlSchemaCollection;
import org.apache.ws.commons.schema.XmlSchemaEnumerationFacet;
import org.apache.ws.commons.schema.XmlSchemaObjectCollection;
import org.apache.ws.commons.schema.XmlSchemaObjectTable;
import org.apache.ws.commons.schema.XmlSchemaSimpleType;
import org.apache.ws.commons.schema.XmlSchemaSimpleTypeRestriction;

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

/**
 * DOC bchen class global comment. Detailled comment
 */
public class GenConfigOfComponent {

    private WSDLFactory wsdlFactory;

    private Definition definition;

    private XmlSchemaCollection schemaCollection;

    public GenConfigOfComponent(String wsdlFile) throws Exception {
        wsdlFactory = WSDLFactory.newInstance();
        WSDLReader newWSDLReader = wsdlFactory.newWSDLReader();
        definition = newWSDLReader.readWSDL(wsdlFile);
        schemaCollection = new XmlSchemaCollection();
        Types types = definition.getTypes();
        List<ExtensibilityElement> extensibilityElements = types.getExtensibilityElements();
        for (ExtensibilityElement el : extensibilityElements) {
            if (el instanceof Schema) {
                Schema schema = (Schema) el;
                schemaCollection.read(schema.getElement());
            }
        }
    }

    public void genActivityType() {
        try {
            FileWriter propertiFile = new FileWriter("ActivityType.properties");
            FileWriter file = new FileWriter("ActivityType.xml");
            boolean isFirst = true;
            XmlSchema[] xmlSchemas = schemaCollection.getXmlSchemas();
            for (XmlSchema xmlSchema : xmlSchemas) {
                XmlSchemaObjectTable xmlSchemaTable = xmlSchema.getSchemaTypes();
                XmlSchemaSimpleType activityType = (XmlSchemaSimpleType) xmlSchemaTable.getItem(new QName(
                        "http://www.marketo.com/mktows/", "ActivityType"));// {http://www.marketo.com/mktows/}ActivityType
                if (activityType != null) {
                    XmlSchemaSimpleTypeRestriction content = (XmlSchemaSimpleTypeRestriction) activityType.getContent();
                    XmlSchemaObjectCollection collection = content.getFacets();
                    Iterator iter = collection.getIterator();
                    while (iter.hasNext()) {
                        XmlSchemaEnumerationFacet facet = (XmlSchemaEnumerationFacet) iter.next();
                        if (isFirst) {
                            file.append("<ITEMS DEFAULT=\"" + facet.getValue().toString() + "\">");
                            file.append(System.getProperty("line.separator"));
                            isFirst = false;
                        }
                        file.append("<ITEM NAME=\"");
                        file.append(facet.getValue().toString());
                        file.append("\" VALUE=\"");
                        file.append(facet.getValue().toString());
                        file.append("\" />");
                        file.append(System.getProperty("line.separator"));
                        propertiFile.append("INCLUDE_TYPES.ITEM.TYPES.ITEM." + facet.getValue().toString() + "="
                                + facet.getValue().toString());
                        propertiFile.append(System.getProperty("line.separator"));
                    }
                }
            }
            file.append("</ITEMS>");
            file.close();
            propertiFile.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            String wsdlFile = "marketo2_7.wsdl";
            GenConfigOfComponent gen = new GenConfigOfComponent(wsdlFile);
            gen.genActivityType();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
