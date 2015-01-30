/**
 * ResultSyncLead.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ResultSyncLead implements java.io.Serializable {
	private int leadId;

	private com.marketo.www.mktows.SyncStatus syncStatus;

	private com.marketo.www.mktows.LeadRecord leadRecord;

	public ResultSyncLead() {
	}

	public ResultSyncLead(int leadId, com.marketo.www.mktows.SyncStatus syncStatus,
			com.marketo.www.mktows.LeadRecord leadRecord) {
		this.leadId = leadId;
		this.syncStatus = syncStatus;
		this.leadRecord = leadRecord;
	}

	/**
	 * Gets the leadId value for this ResultSyncLead.
	 * 
	 * @return leadId
	 */
	public int getLeadId() {
		return leadId;
	}

	/**
	 * Sets the leadId value for this ResultSyncLead.
	 * 
	 * @param leadId
	 */
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}

	/**
	 * Gets the syncStatus value for this ResultSyncLead.
	 * 
	 * @return syncStatus
	 */
	public com.marketo.www.mktows.SyncStatus getSyncStatus() {
		return syncStatus;
	}

	/**
	 * Sets the syncStatus value for this ResultSyncLead.
	 * 
	 * @param syncStatus
	 */
	public void setSyncStatus(com.marketo.www.mktows.SyncStatus syncStatus) {
		this.syncStatus = syncStatus;
	}

	/**
	 * Gets the leadRecord value for this ResultSyncLead.
	 * 
	 * @return leadRecord
	 */
	public com.marketo.www.mktows.LeadRecord getLeadRecord() {
		return leadRecord;
	}

	/**
	 * Sets the leadRecord value for this ResultSyncLead.
	 * 
	 * @param leadRecord
	 */
	public void setLeadRecord(com.marketo.www.mktows.LeadRecord leadRecord) {
		this.leadRecord = leadRecord;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResultSyncLead))
			return false;
		ResultSyncLead other = (ResultSyncLead) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& this.leadId == other.getLeadId()
				&& ((this.syncStatus == null && other.getSyncStatus() == null) || (this.syncStatus != null && this.syncStatus
						.equals(other.getSyncStatus())))
				&& ((this.leadRecord == null && other.getLeadRecord() == null) || (this.leadRecord != null && this.leadRecord
						.equals(other.getLeadRecord())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		_hashCode += getLeadId();
		if (getSyncStatus() != null) {
			_hashCode += getSyncStatus().hashCode();
		}
		if (getLeadRecord() != null) {
			_hashCode += getLeadRecord().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ResultSyncLead.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ResultSyncLead"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leadId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "leadId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("syncStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("", "syncStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SyncStatus"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leadRecord");
		elemField.setXmlName(new javax.xml.namespace.QName("", "leadRecord"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadRecord"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
