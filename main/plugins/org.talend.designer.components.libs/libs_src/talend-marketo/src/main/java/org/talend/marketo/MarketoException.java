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
package org.talend.marketo;

import java.util.ArrayList;
import java.util.List;

/**
 * DOC bchen class global comment. Detailled comment
 */
public class MarketoException {

    public static List<String> inputExceptions = new ArrayList<String>();
    static {
        inputExceptions.add("20101");// 20101 - Lead Key Required
        inputExceptions.add("20102");// 20102 - Lead Key Bad
        inputExceptions.add("20103");// 20103 - Lead not found
        inputExceptions.add("20108");// 20108 - Lead Owner Not Found
    }

    // public static List<String> systemExceptions = new ArrayList<String>();
    // static {
    // inputExceptions.add("10001");// 10001 - Internal Error
    // inputExceptions.add("20011");// 20011 - Internal Error
    // inputExceptions.add("20012");// 20012 - Request Not Understood
    // inputExceptions.add("20013");// 20013 - Access Denied
    // inputExceptions.add("20014");// 20014 - Authentication Failed
    // inputExceptions.add("20015");// 20015 - Request Limit Exceeded
    // inputExceptions.add("20016");// 20016 - Request Expired
    // inputExceptions.add("20017");// 20017 - Invalid Request
    // inputExceptions.add("20019");// 20019 - Unsupported Operation
    // }

    // public static List<String> outputExceptions = new ArrayList<String>();
    // static {
    // outputExceptions.add("20101");// 20101 - Lead Key Required
    // outputExceptions.add("20102");// 20102 - Lead Key Bad
    // outputExceptions.add("20103");// 20103 - Lead not found
    // outputExceptions.add("20104");// 20104 - Lead Detail Required
    // outputExceptions.add("20105");// 20105 - Lead Attribute Bad
    // outputExceptions.add("20106");// 20106 - Lead Sync Failed
    // outputExceptions.add("20107");// 20107 - Activity Key Bad
    // outputExceptions.add("20108");// 20108 - Lead Owner Not Found
    // }
}
