/**
 * MktowsApiSoapBindingStub.java
 * 
 * This file was auto-generated from WSDL by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPFactory;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeaderElement;
import org.talend.common.Signature;

public class MktowsApiSoapBindingStub extends org.apache.axis.client.Stub
		implements com.marketo.www.mktows.MktowsPort {

	private java.util.Vector cachedSerClasses = new java.util.Vector();

	private java.util.Vector cachedSerQNames = new java.util.Vector();

	private java.util.Vector cachedSerFactories = new java.util.Vector();

	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[23];
		_initOperationDesc1();
		_initOperationDesc2();
		_initOperationDesc3();
	}

	int timeout;

	String clientAccessID;

	String secretKey;

	@Override
	public int getTimeout() {
		return timeout;
	}

	@Override
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public String getClientAccessID() {
		return clientAccessID;
	}

	public void setClientAccessID(String clientAccessID) {
		this.clientAccessID = clientAccessID;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("deleteMObjects");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsDeleteMObjects"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsDeleteMObjects"),
				com.marketo.www.mktows.ParamsDeleteMObjects.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessDeleteMObjects"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessDeleteMObjects.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successDeleteMObjects"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("describeMObject");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsDescribeMObject"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsDescribeMObject"),
				com.marketo.www.mktows.ParamsDescribeMObject.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessDescribeMObject"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessDescribeMObject.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successDescribeMObject"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getMObjects");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsGetMObjects"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsGetMObjects"),
				com.marketo.www.mktows.ParamsGetMObjects.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessGetMObjects"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessGetMObjects.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successGetMObjects"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("syncMObjects");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsSyncMObjects"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsSyncMObjects"),
				com.marketo.www.mktows.ParamsSyncMObjects.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessSyncMObjects"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessSyncMObjects.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successSyncMObjects"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getCampaignsForSource");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsGetCampaignsForSource"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsGetCampaignsForSource"),
				com.marketo.www.mktows.ParamsGetCampaignsForSource.class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/",
				"SuccessGetCampaignsForSource"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessGetCampaignsForSource.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/",
				"successGetCampaignsForSource"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getImportToListStatus");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsGetImportToListStatus"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsGetImportToListStatus"),
				com.marketo.www.mktows.ParamsGetImportToListStatus.class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/",
				"SuccessGetImportToListStatus"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessGetImportToListStatus.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/",
				"successGetImportToListStatus"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getLead");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsGetLead"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsGetLead"),
				com.marketo.www.mktows.ParamsGetLead.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessGetLead"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessGetLead.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successGetLead"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getLeadActivity");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsGetLeadActivity"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsGetLeadActivity"),
				com.marketo.www.mktows.ParamsGetLeadActivity.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessGetLeadActivity"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessGetLeadActivity.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successGetLeadActivity"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getLeadChanges");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsGetLeadChanges"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsGetLeadChanges"),
				com.marketo.www.mktows.ParamsGetLeadChanges.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessGetLeadChanges"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessGetLeadChanges.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successGetLeadChanges"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[8] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getMultipleLeads");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsGetMultipleLeads"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsGetMultipleLeads"),
				com.marketo.www.mktows.ParamsGetMultipleLeads.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessGetMultipleLeads"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessGetMultipleLeads.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successGetMultipleLeads"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[9] = oper;

	}

	private static void _initOperationDesc2() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("importToList");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsImportToList"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsImportToList"),
				com.marketo.www.mktows.ParamsImportToList.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessImportToList"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessImportToList.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successImportToList"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[10] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("listMObjects");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsListMObjects"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsListMObjects"),
				com.marketo.www.mktows.ParamsListMObjects.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessListMObjects"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessListMObjects.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successListMObjects"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[11] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("listOperation");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsListOperation"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsListOperation"),
				com.marketo.www.mktows.ParamsListOperation.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessListOperation"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessListOperation.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successListOperation"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[12] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("requestCampaign");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsRequestCampaign"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsRequestCampaign"),
				com.marketo.www.mktows.ParamsRequestCampaign.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessRequestCampaign"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessRequestCampaign.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successRequestCampaign"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[13] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("scheduleCampaign");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsScheduleCampaign"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsScheduleCampaign"),
				com.marketo.www.mktows.ParamsScheduleCampaign.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessScheduleCampaign"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessScheduleCampaign.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successScheduleCampaign"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[14] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("syncLead");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsSyncLead"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsSyncLead"),
				com.marketo.www.mktows.ParamsSyncLead.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessSyncLead"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessSyncLead.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successSyncLead"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[15] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("syncMultipleLeads");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsSyncMultipleLeads"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsSyncMultipleLeads"),
				com.marketo.www.mktows.ParamsSyncMultipleLeads.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessSyncMultipleLeads"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessSyncMultipleLeads.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successSyncMultipleLeads"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[16] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("syncCustomObjects");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsSyncCustomObjects"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsSyncCustomObjects"),
				com.marketo.www.mktows.ParamsSyncCustomObjects.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessSyncCustomObjects"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessSyncCustomObjects.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successSyncCustomObjects"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[17] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("deleteCustomObjects");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsDeleteCustomObjects"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsDeleteCustomObjects"),
				com.marketo.www.mktows.ParamsDeleteCustomObjects.class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessDeleteCustomObjects"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessDeleteCustomObjects.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successDeleteCustomObjects"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[18] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getCustomObjects");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsGetCustomObjects"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsGetCustomObjects"),
				com.marketo.www.mktows.ParamsGetCustomObjects.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessGetCustomObjects"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessGetCustomObjects.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successGetCustomObjects"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[19] = oper;

	}

	private static void _initOperationDesc3() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("mergeLeads");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsMergeLeads"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsMergeLeads"),
				com.marketo.www.mktows.ParamsMergeLeads.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessMergeLeads"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessMergeLeads.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successMergeLeads"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[20] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getChannels");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsGetChannels"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsGetChannels"),
				com.marketo.www.mktows.ParamsGetChannels.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessGetChannels"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessGetChannels.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successGetChannels"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[21] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getTags");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"paramsGetTags"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
						"ParamsGetTags"),
				com.marketo.www.mktows.ParamsGetTags.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SuccessGetTags"));
		oper.setReturnClass(com.marketo.www.mktows.SuccessGetTags.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "successGetTags"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[22] = oper;

	}

	public MktowsApiSoapBindingStub() throws org.apache.axis.AxisFault {
		this(null);
	}

	public MktowsApiSoapBindingStub(java.net.URL endpointURL,
			javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public MktowsApiSoapBindingStub(javax.xml.rpc.Service service)
			throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service)
				.setTypeMappingVersion("1.2");
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		addBindings0();
		addBindings1();
	}

	private void addBindings0() {
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ActivityRecord");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ActivityRecord.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ActivityType");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ActivityType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ActivityTypeFilter");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ActivityTypeFilter.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfActivityRecord");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ActivityRecord[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ActivityRecord");
		qName2 = new javax.xml.namespace.QName("", "activityRecord");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfActivityType");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ActivityType[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ActivityType");
		qName2 = new javax.xml.namespace.QName("", "activityType");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfAttrib");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.Attrib[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"Attrib");
		qName2 = new javax.xml.namespace.QName("", "attrib");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfAttribute");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.Attribute[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"Attribute");
		qName2 = new javax.xml.namespace.QName("", "attribute");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfCampaignRecord");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.CampaignRecord[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"CampaignRecord");
		qName2 = new javax.xml.namespace.QName("", "campaignRecord");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfCustomObj");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.CustomObj[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"CustomObj");
		qName2 = new javax.xml.namespace.QName("", "customObj");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfInteger");
		cachedSerQNames.add(qName);
		cls = int[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int");
		qName2 = new javax.xml.namespace.QName("", "integerItem");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfKeyList");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.Attribute[][].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfAttribute");
		qName2 = new javax.xml.namespace.QName("", "keyList");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfLeadChangeRecord");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadChangeRecord[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadChangeRecord");
		qName2 = new javax.xml.namespace.QName("", "leadChangeRecord");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfLeadKey");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadKey[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadKey");
		qName2 = new javax.xml.namespace.QName("", "leadKey");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfLeadRecord");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadRecord[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadRecord");
		qName2 = new javax.xml.namespace.QName("", "leadRecord");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfLeadStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadStatus[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadStatus");
		qName2 = new javax.xml.namespace.QName("", "leadStatus");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfMObjAssociation");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MObjAssociation[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MObjAssociation");
		qName2 = new javax.xml.namespace.QName("", "mObjAssociation");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfMObjCriteria");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MObjCriteria[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MObjCriteria");
		qName2 = new javax.xml.namespace.QName("", "mObjCriteria");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfMObject");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MObject[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MObject");
		qName2 = new javax.xml.namespace.QName("", "mObject");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfMObjFieldMetadata");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MObjFieldMetadata[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MObjFieldMetadata");
		qName2 = new javax.xml.namespace.QName("", "field");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfMObjStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MObjStatus[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MObjStatus");
		qName2 = new javax.xml.namespace.QName("", "mObjStatus");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfProgressionStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ProgressionStatus[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ProgressionStatus");
		qName2 = new javax.xml.namespace.QName("", "progressionStatusItem");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfString");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string");
		qName2 = new javax.xml.namespace.QName("", "stringItem");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfSyncCustomObjStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SyncCustomObjStatus[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SyncCustomObjStatus");
		qName2 = new javax.xml.namespace.QName("", "syncCustomObjStatus");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfSyncStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SyncStatus[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SyncStatus");
		qName2 = new javax.xml.namespace.QName("", "syncStatus");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfTag");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.Tag[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"Tag");
		qName2 = new javax.xml.namespace.QName("", "tag");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfTagStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.TagStatus[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"TagStatus");
		qName2 = new javax.xml.namespace.QName("", "tagStatus");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ArrayOfTypeAttrib");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.TypeAttrib[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"TypeAttrib");
		qName2 = new javax.xml.namespace.QName("", "typeAttrib");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"Attrib");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.Attrib.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"Attribute");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.Attribute.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"CampaignRecord");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.CampaignRecord.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ComparisonEnum");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ComparisonEnum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"CustomObj");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.CustomObj.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ForeignSysType");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ForeignSysType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ImportToListModeEnum");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ImportToListModeEnum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ImportToListStatusEnum");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ImportToListStatusEnum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LastUpdateAtSelector");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LastUpdateAtSelector.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadActivityList");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadActivityList.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadChangeRecord");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadChangeRecord.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadKey");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadKey.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadKeyRef");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadKeyRef.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadKeySelector");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadKeySelector.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadMergeStatusEnum");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadMergeStatusEnum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadRecord");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadRecord.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadSelector");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadSelector.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"LeadSyncStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.LeadSyncStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ListKey");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ListKey.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ListKeyType");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ListKeyType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ListOperationType");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ListOperationType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MergeStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MergeStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MObjAssociation");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MObjAssociation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MObjCriteria");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MObjCriteria.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MObject");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MObject.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MObjectMetadata");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MObjectMetadata.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MObjFieldMetadata");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MObjFieldMetadata.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MObjStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MObjStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MObjStatusEnum");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.MObjStatusEnum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsDeleteCustomObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsDeleteCustomObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsDeleteMObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsDeleteMObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsDescribeMObject");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsDescribeMObject.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsGetCampaignsForSource");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsGetCampaignsForSource.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsGetChannels");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsGetChannels.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsGetCustomObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsGetCustomObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsGetImportToListStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsGetImportToListStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsGetLead");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsGetLead.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsGetLeadActivity");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsGetLeadActivity.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsGetLeadChanges");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsGetLeadChanges.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsGetMObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsGetMObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsGetMultipleLeads");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsGetMultipleLeads.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsGetTags");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsGetTags.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsImportToList");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsImportToList.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsListMObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsListMObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsListOperation");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsListOperation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsMergeLeads");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsMergeLeads.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsRequestCampaign");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsRequestCampaign.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsScheduleCampaign");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsScheduleCampaign.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsSyncCustomObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsSyncCustomObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsSyncLead");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsSyncLead.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsSyncMObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsSyncMObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ParamsSyncMultipleLeads");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ParamsSyncMultipleLeads.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ProgressionStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ProgressionStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ReqCampSourceType");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ReqCampSourceType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultDeleteCustomObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultDeleteCustomObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultDeleteMObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultDeleteMObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultDescribeMObject");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultDescribeMObject.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultGetCampaignsForSource");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultGetCampaignsForSource.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultGetChannels");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultGetChannels.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultGetCustomObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultGetCustomObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultGetImportToListStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultGetImportToListStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultGetLead");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultGetLead.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultGetLeadChanges");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultGetLeadChanges.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultGetMObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultGetMObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultGetMultipleLeads");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultGetMultipleLeads.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultGetTags");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultGetTags.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultImportToList");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultImportToList.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultListMObjects");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string");
		qName2 = new javax.xml.namespace.QName("", "objects");
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultListOperation");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultListOperation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultMergeLeads");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultMergeLeads.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultRequestCampaign");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultRequestCampaign.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultScheduleCampaign");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultScheduleCampaign.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

	}

	private void addBindings1() {
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultSyncCustomObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultSyncCustomObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultSyncLead");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultSyncLead.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultSyncMObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultSyncMObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"ResultSyncMultipleLeads");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.ResultSyncMultipleLeads.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"StaticListSelector");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.StaticListSelector.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"StreamPosition");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.StreamPosition.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessDeleteCustomObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessDeleteCustomObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessDeleteMObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessDeleteMObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessDescribeMObject");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessDescribeMObject.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessGetCampaignsForSource");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessGetCampaignsForSource.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessGetChannels");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessGetChannels.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessGetCustomObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessGetCustomObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessGetImportToListStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessGetImportToListStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessGetLead");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessGetLead.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessGetLeadActivity");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessGetLeadActivity.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessGetLeadChanges");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessGetLeadChanges.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessGetMObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessGetMObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessGetMultipleLeads");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessGetMultipleLeads.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessGetTags");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessGetTags.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessImportToList");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessImportToList.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessListMObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessListMObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessListOperation");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessListOperation.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessMergeLeads");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessMergeLeads.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessRequestCampaign");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessRequestCampaign.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessScheduleCampaign");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessScheduleCampaign.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessSyncCustomObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessSyncCustomObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessSyncLead");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessSyncLead.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessSyncMObjects");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessSyncMObjects.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SuccessSyncMultipleLeads");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SuccessSyncMultipleLeads.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SyncCustomObjStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SyncCustomObjStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SyncOperationEnum");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SyncOperationEnum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SyncStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SyncStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"SyncStatusEnum");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.SyncStatusEnum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"Tag");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.Tag.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"TagStatus");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.TagStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"TypeAttrib");
		cachedSerQNames.add(qName);
		cls = com.marketo.www.mktows.TypeAttrib.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

	}

	protected org.apache.axis.client.Call createCall()
			throws java.rmi.RemoteException {
		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			// if (super.cachedTimeout != null) {
			// _call.setTimeout(super.cachedTimeout);
			// }
			// add an ability to set time out. feature 18073.
			_call.setTimeout(timeout);
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setEncodingStyle(null);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class cls = (java.lang.Class) cachedSerClasses
								.get(i);
						javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames
								.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class) cachedSerFactories
									.get(i);
							java.lang.Class df = (java.lang.Class) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						} else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
									.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		} catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault(
					"Failure trying to get the Call object", _t);
		}
	}

	public com.marketo.www.mktows.SuccessDeleteMObjects deleteMObjects(
			com.marketo.www.mktows.ParamsDeleteMObjects paramsDeleteMObjects)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/deleteMObjects");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"deleteMObjects"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsDeleteMObjects });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessDeleteMObjects) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessDeleteMObjects) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessDeleteMObjects.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessDescribeMObject describeMObject(
			com.marketo.www.mktows.ParamsDescribeMObject paramsDescribeMObject)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/describeMObject");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"describeMObject"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsDescribeMObject });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessDescribeMObject) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessDescribeMObject) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessDescribeMObject.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessGetMObjects getMObjects(
			com.marketo.www.mktows.ParamsGetMObjects paramsGetMObjects)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/getMObjects");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "getMObjects"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsGetMObjects });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessGetMObjects) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessGetMObjects) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									com.marketo.www.mktows.SuccessGetMObjects.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessSyncMObjects syncMObjects(
			com.marketo.www.mktows.ParamsSyncMObjects paramsSyncMObjects)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/syncMObjects");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "syncMObjects"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsSyncMObjects });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessSyncMObjects) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessSyncMObjects) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessSyncMObjects.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessGetCampaignsForSource getCampaignsForSource(
			com.marketo.www.mktows.ParamsGetCampaignsForSource paramsGetCampaignsForSource)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/getCampaignsForSource");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"getCampaignsForSource"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsGetCampaignsForSource });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessGetCampaignsForSource) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessGetCampaignsForSource) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessGetCampaignsForSource.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessGetImportToListStatus getImportToListStatus(
			com.marketo.www.mktows.ParamsGetImportToListStatus paramsGetImportToListStatus)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/getImportToListStatus");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"getImportToListStatus"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsGetImportToListStatus });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessGetImportToListStatus) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessGetImportToListStatus) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessGetImportToListStatus.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessGetLead getLead(
			com.marketo.www.mktows.ParamsGetLead paramsGetLead)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/getLead");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "getLead"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsGetLead });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessGetLead) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessGetLead) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									com.marketo.www.mktows.SuccessGetLead.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	@Override
	protected void setRequestHeaders(Call arg0) throws AxisFault {
		super.setRequestHeaders(arg0);
		// AuthenticationHeader
		try {
			addMarketoAuthenticatioNHeader(_call);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addMarketoAuthenticatioNHeader(org.apache.axis.client.Call _call)
			throws Exception {
		// Request timestamp: a timestamp string in W3C WSDL date format

		String requestTimestamp = formatAsW3C(Calendar.getInstance().getTime());
		// System.out.println(requestTimestamp);

		String stringToEncrypt = requestTimestamp + clientAccessID;
		String signature = Signature.hmac_sha1(stringToEncrypt, secretKey);

		QName authenticationHeaderName = new QName("", "AuthenticationHeader",
				"");
		SOAPHeaderElement authenticationHeader = new SOAPHeaderElement(
				authenticationHeaderName);

		authenticationHeader.setActor(null);
		authenticationHeader.setMustUnderstand(false);
		authenticationHeader.setEnvelope(new SOAPEnvelope());

		authenticationHeader.addAttribute(
				SOAPFactory.newInstance().createName("xmlns"),
				"http://www.marketo.com/mktows/");

		authenticationHeader.addChildElement("mktowsUserId").addTextNode(
				clientAccessID);
		authenticationHeader.addChildElement("requestSignature").addTextNode(
				signature);
		authenticationHeader.addChildElement("requestTimestamp").addTextNode(
				requestTimestamp);

		// System.out.println(authenticationHeader.getAsString());
		_call.addHeader(authenticationHeader);
	}

	public String formatAsW3C(java.util.Date dt) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		String text = df.format(dt);
		String w3cValue = text.substring(0, 22) + ":" + text.substring(22);
		return w3cValue;
	}

	public com.marketo.www.mktows.SuccessGetLeadActivity getLeadActivity(
			com.marketo.www.mktows.ParamsGetLeadActivity paramsGetLeadActivity)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/getLeadActivity");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"getLeadActivity"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsGetLeadActivity });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessGetLeadActivity) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessGetLeadActivity) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessGetLeadActivity.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessGetLeadChanges getLeadChanges(
			com.marketo.www.mktows.ParamsGetLeadChanges paramsGetLeadChanges)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/getLeadChanges");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"getLeadChanges"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsGetLeadChanges });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessGetLeadChanges) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessGetLeadChanges) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessGetLeadChanges.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessGetMultipleLeads getMultipleLeads(
			com.marketo.www.mktows.ParamsGetMultipleLeads paramsGetMultipleLeads)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[9]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/getMultipleLeads");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"getMultipleLeads"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsGetMultipleLeads });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessGetMultipleLeads) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessGetMultipleLeads) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessGetMultipleLeads.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessImportToList importToList(
			com.marketo.www.mktows.ParamsImportToList paramsImportToList)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[10]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/importToList");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "importToList"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsImportToList });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessImportToList) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessImportToList) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessImportToList.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessListMObjects listMObjects(
			com.marketo.www.mktows.ParamsListMObjects paramsListMObjects)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[11]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/listMObjects");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "listMObjects"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsListMObjects });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessListMObjects) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessListMObjects) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessListMObjects.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessListOperation listOperation(
			com.marketo.www.mktows.ParamsListOperation paramsListOperation)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[12]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/listOperation");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"listOperation"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsListOperation });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessListOperation) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessListOperation) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessListOperation.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessRequestCampaign requestCampaign(
			com.marketo.www.mktows.ParamsRequestCampaign paramsRequestCampaign)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[13]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/requestCampaign");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"requestCampaign"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsRequestCampaign });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessRequestCampaign) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessRequestCampaign) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessRequestCampaign.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessScheduleCampaign scheduleCampaign(
			com.marketo.www.mktows.ParamsScheduleCampaign paramsScheduleCampaign)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[14]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/scheduleCampaign");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"scheduleCampaign"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsScheduleCampaign });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessScheduleCampaign) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessScheduleCampaign) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessScheduleCampaign.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessSyncLead syncLead(
			com.marketo.www.mktows.ParamsSyncLead paramsSyncLead)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[15]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/syncLead");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "syncLead"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsSyncLead });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessSyncLead) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessSyncLead) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									com.marketo.www.mktows.SuccessSyncLead.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessSyncMultipleLeads syncMultipleLeads(
			com.marketo.www.mktows.ParamsSyncMultipleLeads paramsSyncMultipleLeads)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[16]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/syncMultipleLeads");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"syncMultipleLeads"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsSyncMultipleLeads });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessSyncMultipleLeads) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessSyncMultipleLeads) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessSyncMultipleLeads.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessSyncCustomObjects syncCustomObjects(
			com.marketo.www.mktows.ParamsSyncCustomObjects paramsSyncCustomObjects)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[17]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/syncCustomObjects");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"syncCustomObjects"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsSyncCustomObjects });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessSyncCustomObjects) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessSyncCustomObjects) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessSyncCustomObjects.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessDeleteCustomObjects deleteCustomObjects(
			com.marketo.www.mktows.ParamsDeleteCustomObjects paramsDeleteCustomObjects)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[18]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/deleteCustomObjects");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"deleteCustomObjects"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsDeleteCustomObjects });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessDeleteCustomObjects) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessDeleteCustomObjects) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessDeleteCustomObjects.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessGetCustomObjects getCustomObjects(
			com.marketo.www.mktows.ParamsGetCustomObjects paramsGetCustomObjects)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[19]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/getCustomObjects");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("",
				"getCustomObjects"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsGetCustomObjects });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessGetCustomObjects) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessGetCustomObjects) org.apache.axis.utils.JavaUtils
							.convert(
									_resp,
									com.marketo.www.mktows.SuccessGetCustomObjects.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessMergeLeads mergeLeads(
			com.marketo.www.mktows.ParamsMergeLeads paramsMergeLeads)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[20]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/mergeLeads");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "mergeLeads"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsMergeLeads });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessMergeLeads) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessMergeLeads) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									com.marketo.www.mktows.SuccessMergeLeads.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessGetChannels getChannels(
			com.marketo.www.mktows.ParamsGetChannels paramsGetChannels)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[21]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/getChannels");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "getChannels"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsGetChannels });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessGetChannels) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessGetChannels) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									com.marketo.www.mktows.SuccessGetChannels.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.marketo.www.mktows.SuccessGetTags getTags(
			com.marketo.www.mktows.ParamsGetTags paramsGetTags)
			throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[22]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.marketo.com/mktows/getTags");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR,
				Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "getTags"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call
					.invoke(new java.lang.Object[] { paramsGetTags });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (com.marketo.www.mktows.SuccessGetTags) _resp;
				} catch (java.lang.Exception _exception) {
					return (com.marketo.www.mktows.SuccessGetTags) org.apache.axis.utils.JavaUtils
							.convert(_resp,
									com.marketo.www.mktows.SuccessGetTags.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
