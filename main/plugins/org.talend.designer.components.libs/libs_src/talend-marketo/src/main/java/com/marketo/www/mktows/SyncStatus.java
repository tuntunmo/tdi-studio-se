/**
 * SyncStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class SyncStatus implements java.io.Serializable {
	private int leadId;

	private com.marketo.www.mktows.LeadSyncStatus status;

	private java.lang.String error;

	public SyncStatus() {
	}

	public SyncStatus(int leadId, com.marketo.www.mktows.LeadSyncStatus status,
			java.lang.String error) {
		this.leadId = leadId;
		this.status = status;
		this.error = error;
	}

	/**
	 * Gets the leadId value for this SyncStatus.
	 * 
	 * @return leadId
	 */
	public int getLeadId() {
		return leadId;
	}

	/**
	 * Sets the leadId value for this SyncStatus.
	 * 
	 * @param leadId
	 */
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}

	/**
	 * Gets the status value for this SyncStatus.
	 * 
	 * @return status
	 */
	public com.marketo.www.mktows.LeadSyncStatus getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this SyncStatus.
	 * 
	 * @param status
	 */
	public void setStatus(com.marketo.www.mktows.LeadSyncStatus status) {
		this.status = status;
	}

	/**
	 * Gets the error value for this SyncStatus.
	 * 
	 * @return error
	 */
	public java.lang.String getError() {
		return error;
	}

	/**
	 * Sets the error value for this SyncStatus.
	 * 
	 * @param error
	 */
	public void setError(java.lang.String error) {
		this.error = error;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof SyncStatus))
			return false;
		SyncStatus other = (SyncStatus) obj;
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
				&& ((this.status == null && other.getStatus() == null) || (this.status != null && this.status
						.equals(other.getStatus())))
				&& ((this.error == null && other.getError() == null) || (this.error != null && this.error
						.equals(other.getError())));
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
		if (getStatus() != null) {
			_hashCode += getStatus().hashCode();
		}
		if (getError() != null) {
			_hashCode += getError().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			SyncStatus.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SyncStatus"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leadId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "leadId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("status");
		elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadSyncStatus"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("error");
		elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
