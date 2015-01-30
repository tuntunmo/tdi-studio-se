/**
 * ParamsSyncMultipleLeads.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsSyncMultipleLeads implements java.io.Serializable {
	private com.marketo.www.mktows.LeadRecord[] leadRecordList;

	private java.lang.Boolean dedupEnabled;

	public ParamsSyncMultipleLeads() {
	}

	public ParamsSyncMultipleLeads(
			com.marketo.www.mktows.LeadRecord[] leadRecordList,
			java.lang.Boolean dedupEnabled) {
		this.leadRecordList = leadRecordList;
		this.dedupEnabled = dedupEnabled;
	}

	/**
	 * Gets the leadRecordList value for this ParamsSyncMultipleLeads.
	 * 
	 * @return leadRecordList
	 */
	public com.marketo.www.mktows.LeadRecord[] getLeadRecordList() {
		return leadRecordList;
	}

	/**
	 * Sets the leadRecordList value for this ParamsSyncMultipleLeads.
	 * 
	 * @param leadRecordList
	 */
	public void setLeadRecordList(com.marketo.www.mktows.LeadRecord[] leadRecordList) {
		this.leadRecordList = leadRecordList;
	}

	/**
	 * Gets the dedupEnabled value for this ParamsSyncMultipleLeads.
	 * 
	 * @return dedupEnabled
	 */
	public java.lang.Boolean getDedupEnabled() {
		return dedupEnabled;
	}

	/**
	 * Sets the dedupEnabled value for this ParamsSyncMultipleLeads.
	 * 
	 * @param dedupEnabled
	 */
	public void setDedupEnabled(java.lang.Boolean dedupEnabled) {
		this.dedupEnabled = dedupEnabled;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsSyncMultipleLeads))
			return false;
		ParamsSyncMultipleLeads other = (ParamsSyncMultipleLeads) obj;
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
				&& ((this.leadRecordList == null && other.getLeadRecordList() == null) || (this.leadRecordList != null && java.util.Arrays
						.equals(this.leadRecordList, other.getLeadRecordList())))
				&& ((this.dedupEnabled == null && other.getDedupEnabled() == null) || (this.dedupEnabled != null && this.dedupEnabled
						.equals(other.getDedupEnabled())));
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
		if (getLeadRecordList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getLeadRecordList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLeadRecordList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDedupEnabled() != null) {
			_hashCode += getDedupEnabled().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParamsSyncMultipleLeads.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsSyncMultipleLeads"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leadRecordList");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "leadRecordList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadRecord"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "leadRecord"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dedupEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dedupEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
