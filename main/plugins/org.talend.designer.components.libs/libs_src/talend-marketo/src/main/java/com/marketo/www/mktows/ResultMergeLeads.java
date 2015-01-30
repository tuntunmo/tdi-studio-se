/**
 * ResultMergeLeads.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ResultMergeLeads implements java.io.Serializable {
	private com.marketo.www.mktows.MergeStatus mergeStatus;

	public ResultMergeLeads() {
	}

	public ResultMergeLeads(com.marketo.www.mktows.MergeStatus mergeStatus) {
		this.mergeStatus = mergeStatus;
	}

	/**
	 * Gets the mergeStatus value for this ResultMergeLeads.
	 * 
	 * @return mergeStatus
	 */
	public com.marketo.www.mktows.MergeStatus getMergeStatus() {
		return mergeStatus;
	}

	/**
	 * Sets the mergeStatus value for this ResultMergeLeads.
	 * 
	 * @param mergeStatus
	 */
	public void setMergeStatus(com.marketo.www.mktows.MergeStatus mergeStatus) {
		this.mergeStatus = mergeStatus;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResultMergeLeads))
			return false;
		ResultMergeLeads other = (ResultMergeLeads) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.mergeStatus == null && other.getMergeStatus() == null) || (this.mergeStatus != null && this.mergeStatus
				.equals(other.getMergeStatus())));
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
		if (getMergeStatus() != null) {
			_hashCode += getMergeStatus().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ResultMergeLeads.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ResultMergeLeads"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mergeStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("", "mergeStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MergeStatus"));
		elemField.setNillable(false);
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
