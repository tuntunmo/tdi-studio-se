/**
 * ActivityType.java
 * 
 * This file was auto-generated from WSDL by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ActivityType implements java.io.Serializable {

	private java.lang.String _value_;

	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected ActivityType(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _VisitWebpage = "VisitWebpage";

	public static final java.lang.String _FillOutForm = "FillOutForm";

	public static final java.lang.String _ClickLink = "ClickLink";

	public static final java.lang.String _RegisterForEvent = "RegisterForEvent";

	public static final java.lang.String _AttendEvent = "AttendEvent";

	public static final java.lang.String _SendEmail = "SendEmail";

	public static final java.lang.String _EmailDelivered = "EmailDelivered";

	public static final java.lang.String _EmailBounced = "EmailBounced";

	public static final java.lang.String _UnsubscribeEmail = "UnsubscribeEmail";

	public static final java.lang.String _OpenEmail = "OpenEmail";

	public static final java.lang.String _ClickEmail = "ClickEmail";

	public static final java.lang.String _NewLead = "NewLead";

	public static final java.lang.String _ChangeDataValue = "ChangeDataValue";

	public static final java.lang.String _LeadAssigned = "LeadAssigned";

	public static final java.lang.String _NewSFDCOpprtnty = "NewSFDCOpprtnty";

	public static final java.lang.String _Wait = "Wait";

	public static final java.lang.String _RunSubflow = "RunSubflow";

	public static final java.lang.String _RemoveFromFlow = "RemoveFromFlow";

	public static final java.lang.String _PushLeadToSales = "PushLeadToSales";

	public static final java.lang.String _CreateTask = "CreateTask";

	public static final java.lang.String _ConvertLead = "ConvertLead";

	public static final java.lang.String _ChangeScore = "ChangeScore";

	public static final java.lang.String _ChangeOwner = "ChangeOwner";

	public static final java.lang.String _AddToList = "AddToList";

	public static final java.lang.String _RemoveFromList = "RemoveFromList";

	public static final java.lang.String _SFDCActivity = "SFDCActivity";

	public static final java.lang.String _EmailBouncedSoft = "EmailBouncedSoft";

	public static final java.lang.String _PushLeadUpdatesToSales = "PushLeadUpdatesToSales";

	public static final java.lang.String _DeleteLeadFromSales = "DeleteLeadFromSales";

	public static final java.lang.String _SFDCActivityUpdated = "SFDCActivityUpdated";

	public static final java.lang.String _SFDCMergeLeads = "SFDCMergeLeads";

	public static final java.lang.String _MergeLeads = "MergeLeads";

	public static final java.lang.String _ResolveConflicts = "ResolveConflicts";

	public static final java.lang.String _AssocWithOpprtntyInSales = "AssocWithOpprtntyInSales";

	public static final java.lang.String _DissocFromOpprtntyInSales = "DissocFromOpprtntyInSales";

	public static final java.lang.String _UpdateOpprtntyInSales = "UpdateOpprtntyInSales";

	public static final java.lang.String _DeleteLead = "DeleteLead";

	public static final java.lang.String _SendAlert = "SendAlert";

	public static final java.lang.String _SendSalesEmail = "SendSalesEmail";

	public static final java.lang.String _OpenSalesEmail = "OpenSalesEmail";

	public static final java.lang.String _ClickSalesEmail = "ClickSalesEmail";

	public static final java.lang.String _AddtoSFDCCampaign = "AddtoSFDCCampaign";

	public static final java.lang.String _RemoveFromSFDCCampaign = "RemoveFromSFDCCampaign";

	public static final java.lang.String _ChangeStatusInSFDCCampaign = "ChangeStatusInSFDCCampaign";

	public static final java.lang.String _ReceiveSalesEmail = "ReceiveSalesEmail";

	public static final java.lang.String _InterestingMoment = "InterestingMoment";

	public static final java.lang.String _RequestCampaign = "RequestCampaign";

	public static final java.lang.String _SalesEmailBounced = "SalesEmailBounced";

	public static final java.lang.String _ChangeLeadPartition = "ChangeLeadPartition";

	public static final java.lang.String _ChangeRevenueStage = "ChangeRevenueStage";

	public static final java.lang.String _ChangeRevenueStageManually = "ChangeRevenueStageManually";

	public static final java.lang.String _ComputeDataValue = "ComputeDataValue";

	public static final java.lang.String _ChangeStatusInProgression = "ChangeStatusInProgression";

	public static final java.lang.String _ChangeFieldInProgram = "ChangeFieldInProgram";

	public static final java.lang.String _EnrichWithDatacom = "EnrichWithDatacom";

	public static final java.lang.String _ChangeSegment = "ChangeSegment";

	public static final java.lang.String _ComputeSegmentation = "ComputeSegmentation";

	public static final java.lang.String _ResolveRuleset = "ResolveRuleset";

	public static final java.lang.String _SmartCampaignTest = "SmartCampaignTest";

	public static final java.lang.String _SmartCampaignTestTrigger = "SmartCampaignTestTrigger";

	public static final ActivityType VisitWebpage = new ActivityType(
			_VisitWebpage);

	public static final ActivityType FillOutForm = new ActivityType(
			_FillOutForm);

	public static final ActivityType ClickLink = new ActivityType(_ClickLink);

	public static final ActivityType RegisterForEvent = new ActivityType(
			_RegisterForEvent);

	public static final ActivityType AttendEvent = new ActivityType(
			_AttendEvent);

	public static final ActivityType SendEmail = new ActivityType(_SendEmail);

	public static final ActivityType EmailDelivered = new ActivityType(
			_EmailDelivered);

	public static final ActivityType EmailBounced = new ActivityType(
			_EmailBounced);

	public static final ActivityType UnsubscribeEmail = new ActivityType(
			_UnsubscribeEmail);

	public static final ActivityType OpenEmail = new ActivityType(_OpenEmail);

	public static final ActivityType ClickEmail = new ActivityType(_ClickEmail);

	public static final ActivityType NewLead = new ActivityType(_NewLead);

	public static final ActivityType ChangeDataValue = new ActivityType(
			_ChangeDataValue);

	public static final ActivityType LeadAssigned = new ActivityType(
			_LeadAssigned);

	public static final ActivityType NewSFDCOpprtnty = new ActivityType(
			_NewSFDCOpprtnty);

	public static final ActivityType Wait = new ActivityType(_Wait);

	public static final ActivityType RunSubflow = new ActivityType(_RunSubflow);

	public static final ActivityType RemoveFromFlow = new ActivityType(
			_RemoveFromFlow);

	public static final ActivityType PushLeadToSales = new ActivityType(
			_PushLeadToSales);

	public static final ActivityType CreateTask = new ActivityType(_CreateTask);

	public static final ActivityType ConvertLead = new ActivityType(
			_ConvertLead);

	public static final ActivityType ChangeScore = new ActivityType(
			_ChangeScore);

	public static final ActivityType ChangeOwner = new ActivityType(
			_ChangeOwner);

	public static final ActivityType AddToList = new ActivityType(_AddToList);

	public static final ActivityType RemoveFromList = new ActivityType(
			_RemoveFromList);

	public static final ActivityType SFDCActivity = new ActivityType(
			_SFDCActivity);

	public static final ActivityType EmailBouncedSoft = new ActivityType(
			_EmailBouncedSoft);

	public static final ActivityType PushLeadUpdatesToSales = new ActivityType(
			_PushLeadUpdatesToSales);

	public static final ActivityType DeleteLeadFromSales = new ActivityType(
			_DeleteLeadFromSales);

	public static final ActivityType SFDCActivityUpdated = new ActivityType(
			_SFDCActivityUpdated);

	public static final ActivityType SFDCMergeLeads = new ActivityType(
			_SFDCMergeLeads);

	public static final ActivityType MergeLeads = new ActivityType(_MergeLeads);

	public static final ActivityType ResolveConflicts = new ActivityType(
			_ResolveConflicts);

	public static final ActivityType AssocWithOpprtntyInSales = new ActivityType(
			_AssocWithOpprtntyInSales);

	public static final ActivityType DissocFromOpprtntyInSales = new ActivityType(
			_DissocFromOpprtntyInSales);

	public static final ActivityType UpdateOpprtntyInSales = new ActivityType(
			_UpdateOpprtntyInSales);

	public static final ActivityType DeleteLead = new ActivityType(_DeleteLead);

	public static final ActivityType SendAlert = new ActivityType(_SendAlert);

	public static final ActivityType SendSalesEmail = new ActivityType(
			_SendSalesEmail);

	public static final ActivityType OpenSalesEmail = new ActivityType(
			_OpenSalesEmail);

	public static final ActivityType ClickSalesEmail = new ActivityType(
			_ClickSalesEmail);

	public static final ActivityType AddtoSFDCCampaign = new ActivityType(
			_AddtoSFDCCampaign);

	public static final ActivityType RemoveFromSFDCCampaign = new ActivityType(
			_RemoveFromSFDCCampaign);

	public static final ActivityType ChangeStatusInSFDCCampaign = new ActivityType(
			_ChangeStatusInSFDCCampaign);

	public static final ActivityType ReceiveSalesEmail = new ActivityType(
			_ReceiveSalesEmail);

	public static final ActivityType InterestingMoment = new ActivityType(
			_InterestingMoment);

	public static final ActivityType RequestCampaign = new ActivityType(
			_RequestCampaign);

	public static final ActivityType SalesEmailBounced = new ActivityType(
			_SalesEmailBounced);

	public static final ActivityType ChangeLeadPartition = new ActivityType(
			_ChangeLeadPartition);

	public static final ActivityType ChangeRevenueStage = new ActivityType(
			_ChangeRevenueStage);

	public static final ActivityType ChangeRevenueStageManually = new ActivityType(
			_ChangeRevenueStageManually);

	public static final ActivityType ComputeDataValue = new ActivityType(
			_ComputeDataValue);

	public static final ActivityType ChangeStatusInProgression = new ActivityType(
			_ChangeStatusInProgression);

	public static final ActivityType ChangeFieldInProgram = new ActivityType(
			_ChangeFieldInProgram);

	public static final ActivityType EnrichWithDatacom = new ActivityType(
			_EnrichWithDatacom);

	public static final ActivityType ChangeSegment = new ActivityType(
			_ChangeSegment);

	public static final ActivityType ComputeSegmentation = new ActivityType(
			_ComputeSegmentation);

	public static final ActivityType ResolveRuleset = new ActivityType(
			_ResolveRuleset);

	public static final ActivityType SmartCampaignTest = new ActivityType(
			_SmartCampaignTest);

	public static final ActivityType SmartCampaignTestTrigger = new ActivityType(
			_SmartCampaignTestTrigger);

	public java.lang.String getValue() {
		return _value_;
	}

	public static ActivityType fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		ActivityType enumeration = (ActivityType) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static ActivityType fromString(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		return fromValue(value);
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public java.lang.String toString() {
		return _value_;
	}

	public java.lang.Object readResolve() throws java.io.ObjectStreamException {
		return fromValue(_value_);
	}

	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumSerializer(_javaType,
				_xmlType);
	}

	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumDeserializer(_javaType,
				_xmlType);
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ActivityType.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ActivityType"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
