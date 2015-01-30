/**
 * ResultGetCustomObjects.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ResultGetCustomObjects implements java.io.Serializable {
	private java.lang.String objTypeName;

	private int returnCount;

	private int remainingCount;

	private java.lang.String newStreamPosition;

	private com.marketo.www.mktows.CustomObj[] customObjList;

	public ResultGetCustomObjects() {
	}

	public ResultGetCustomObjects(java.lang.String objTypeName,
			int returnCount, int remainingCount,
			java.lang.String newStreamPosition,
			com.marketo.www.mktows.CustomObj[] customObjList) {
		this.objTypeName = objTypeName;
		this.returnCount = returnCount;
		this.remainingCount = remainingCount;
		this.newStreamPosition = newStreamPosition;
		this.customObjList = customObjList;
	}

	/**
	 * Gets the objTypeName value for this ResultGetCustomObjects.
	 * 
	 * @return objTypeName
	 */
	public java.lang.String getObjTypeName() {
		return objTypeName;
	}

	/**
	 * Sets the objTypeName value for this ResultGetCustomObjects.
	 * 
	 * @param objTypeName
	 */
	public void setObjTypeName(java.lang.String objTypeName) {
		this.objTypeName = objTypeName;
	}

	/**
	 * Gets the returnCount value for this ResultGetCustomObjects.
	 * 
	 * @return returnCount
	 */
	public int getReturnCount() {
		return returnCount;
	}

	/**
	 * Sets the returnCount value for this ResultGetCustomObjects.
	 * 
	 * @param returnCount
	 */
	public void setReturnCount(int returnCount) {
		this.returnCount = returnCount;
	}

	/**
	 * Gets the remainingCount value for this ResultGetCustomObjects.
	 * 
	 * @return remainingCount
	 */
	public int getRemainingCount() {
		return remainingCount;
	}

	/**
	 * Sets the remainingCount value for this ResultGetCustomObjects.
	 * 
	 * @param remainingCount
	 */
	public void setRemainingCount(int remainingCount) {
		this.remainingCount = remainingCount;
	}

	/**
	 * Gets the newStreamPosition value for this ResultGetCustomObjects.
	 * 
	 * @return newStreamPosition
	 */
	public java.lang.String getNewStreamPosition() {
		return newStreamPosition;
	}

	/**
	 * Sets the newStreamPosition value for this ResultGetCustomObjects.
	 * 
	 * @param newStreamPosition
	 */
	public void setNewStreamPosition(java.lang.String newStreamPosition) {
		this.newStreamPosition = newStreamPosition;
	}

	/**
	 * Gets the customObjList value for this ResultGetCustomObjects.
	 * 
	 * @return customObjList
	 */
	public com.marketo.www.mktows.CustomObj[] getCustomObjList() {
		return customObjList;
	}

	/**
	 * Sets the customObjList value for this ResultGetCustomObjects.
	 * 
	 * @param customObjList
	 */
	public void setCustomObjList(com.marketo.www.mktows.CustomObj[] customObjList) {
		this.customObjList = customObjList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResultGetCustomObjects))
			return false;
		ResultGetCustomObjects other = (ResultGetCustomObjects) obj;
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
				&& this.returnCount == other.getReturnCount()
				&& this.remainingCount == other.getRemainingCount()
				&& ((this.newStreamPosition == null && other
						.getNewStreamPosition() == null) || (this.newStreamPosition != null && this.newStreamPosition
						.equals(other.getNewStreamPosition())))
				&& ((this.customObjList == null && other.getCustomObjList() == null) || (this.customObjList != null && java.util.Arrays
						.equals(this.customObjList, other.getCustomObjList())));
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
		_hashCode += getReturnCount();
		_hashCode += getRemainingCount();
		if (getNewStreamPosition() != null) {
			_hashCode += getNewStreamPosition().hashCode();
		}
		if (getCustomObjList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCustomObjList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCustomObjList(), i);
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
			ResultGetCustomObjects.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ResultGetCustomObjects"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("objTypeName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "objTypeName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("returnCount");
		elemField.setXmlName(new javax.xml.namespace.QName("", "returnCount"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("remainingCount");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "remainingCount"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("newStreamPosition");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"newStreamPosition"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customObjList");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "customObjList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "CustomObj"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new javax.xml.namespace.QName("", "customObj"));
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
