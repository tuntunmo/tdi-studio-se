/**
 * SyncCustomObjStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class SyncCustomObjStatus implements java.io.Serializable {
	private java.lang.String objTypeName;

	private com.marketo.www.mktows.Attribute[] customObjKeyList;

	private com.marketo.www.mktows.SyncStatusEnum status;

	private java.lang.String error;

	public SyncCustomObjStatus() {
	}

	public SyncCustomObjStatus(java.lang.String objTypeName,
			com.marketo.www.mktows.Attribute[] customObjKeyList,
			com.marketo.www.mktows.SyncStatusEnum status, java.lang.String error) {
		this.objTypeName = objTypeName;
		this.customObjKeyList = customObjKeyList;
		this.status = status;
		this.error = error;
	}

	/**
	 * Gets the objTypeName value for this SyncCustomObjStatus.
	 * 
	 * @return objTypeName
	 */
	public java.lang.String getObjTypeName() {
		return objTypeName;
	}

	/**
	 * Sets the objTypeName value for this SyncCustomObjStatus.
	 * 
	 * @param objTypeName
	 */
	public void setObjTypeName(java.lang.String objTypeName) {
		this.objTypeName = objTypeName;
	}

	/**
	 * Gets the customObjKeyList value for this SyncCustomObjStatus.
	 * 
	 * @return customObjKeyList
	 */
	public com.marketo.www.mktows.Attribute[] getCustomObjKeyList() {
		return customObjKeyList;
	}

	/**
	 * Sets the customObjKeyList value for this SyncCustomObjStatus.
	 * 
	 * @param customObjKeyList
	 */
	public void setCustomObjKeyList(
			com.marketo.www.mktows.Attribute[] customObjKeyList) {
		this.customObjKeyList = customObjKeyList;
	}

	/**
	 * Gets the status value for this SyncCustomObjStatus.
	 * 
	 * @return status
	 */
	public com.marketo.www.mktows.SyncStatusEnum getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this SyncCustomObjStatus.
	 * 
	 * @param status
	 */
	public void setStatus(com.marketo.www.mktows.SyncStatusEnum status) {
		this.status = status;
	}

	/**
	 * Gets the error value for this SyncCustomObjStatus.
	 * 
	 * @return error
	 */
	public java.lang.String getError() {
		return error;
	}

	/**
	 * Sets the error value for this SyncCustomObjStatus.
	 * 
	 * @param error
	 */
	public void setError(java.lang.String error) {
		this.error = error;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof SyncCustomObjStatus))
			return false;
		SyncCustomObjStatus other = (SyncCustomObjStatus) obj;
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
				&& ((this.objTypeName == null && other.getObjTypeName() == null) || (this.objTypeName != null && this.objTypeName
						.equals(other.getObjTypeName())))
				&& ((this.customObjKeyList == null && other
						.getCustomObjKeyList() == null) || (this.customObjKeyList != null && java.util.Arrays
						.equals(this.customObjKeyList,
								other.getCustomObjKeyList())))
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
		if (getObjTypeName() != null) {
			_hashCode += getObjTypeName().hashCode();
		}
		if (getCustomObjKeyList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCustomObjKeyList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCustomObjKeyList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
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
			SyncCustomObjStatus.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SyncCustomObjStatus"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("objTypeName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "objTypeName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customObjKeyList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"customObjKeyList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "Attribute"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("status");
		elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SyncStatusEnum"));
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
