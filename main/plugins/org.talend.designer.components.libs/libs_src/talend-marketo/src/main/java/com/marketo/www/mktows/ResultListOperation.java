/**
 * ResultListOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ResultListOperation implements java.io.Serializable {
	private boolean success;

	private com.marketo.www.mktows.LeadStatus[] statusList;

	public ResultListOperation() {
	}

	public ResultListOperation(boolean success,
			com.marketo.www.mktows.LeadStatus[] statusList) {
		this.success = success;
		this.statusList = statusList;
	}

	/**
	 * Gets the success value for this ResultListOperation.
	 * 
	 * @return success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Sets the success value for this ResultListOperation.
	 * 
	 * @param success
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * Gets the statusList value for this ResultListOperation.
	 * 
	 * @return statusList
	 */
	public com.marketo.www.mktows.LeadStatus[] getStatusList() {
		return statusList;
	}

	/**
	 * Sets the statusList value for this ResultListOperation.
	 * 
	 * @param statusList
	 */
	public void setStatusList(com.marketo.www.mktows.LeadStatus[] statusList) {
		this.statusList = statusList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResultListOperation))
			return false;
		ResultListOperation other = (ResultListOperation) obj;
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
				&& this.success == other.isSuccess()
				&& ((this.statusList == null && other.getStatusList() == null) || (this.statusList != null && java.util.Arrays
						.equals(this.statusList, other.getStatusList())));
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
		_hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getStatusList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getStatusList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getStatusList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ResultListOperation.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ResultListOperation"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("success");
		elemField.setXmlName(new javax.xml.namespace.QName("", "success"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("statusList");
		elemField.setXmlName(new javax.xml.namespace.QName("", "statusList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadStatus"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new javax.xml.namespace.QName("", "leadStatus"));
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
