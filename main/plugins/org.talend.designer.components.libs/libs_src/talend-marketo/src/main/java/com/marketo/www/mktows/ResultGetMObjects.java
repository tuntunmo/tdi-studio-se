/**
 * ResultGetMObjects.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ResultGetMObjects implements java.io.Serializable {
	private int returnCount;

	private boolean hasMore;

	private java.lang.String newStreamPosition;

	private com.marketo.www.mktows.MObject[] mObjectList;

	public ResultGetMObjects() {
	}

	public ResultGetMObjects(int returnCount, boolean hasMore,
			java.lang.String newStreamPosition,
			com.marketo.www.mktows.MObject[] mObjectList) {
		this.returnCount = returnCount;
		this.hasMore = hasMore;
		this.newStreamPosition = newStreamPosition;
		this.mObjectList = mObjectList;
	}

	/**
	 * Gets the returnCount value for this ResultGetMObjects.
	 * 
	 * @return returnCount
	 */
	public int getReturnCount() {
		return returnCount;
	}

	/**
	 * Sets the returnCount value for this ResultGetMObjects.
	 * 
	 * @param returnCount
	 */
	public void setReturnCount(int returnCount) {
		this.returnCount = returnCount;
	}

	/**
	 * Gets the hasMore value for this ResultGetMObjects.
	 * 
	 * @return hasMore
	 */
	public boolean isHasMore() {
		return hasMore;
	}

	/**
	 * Sets the hasMore value for this ResultGetMObjects.
	 * 
	 * @param hasMore
	 */
	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}

	/**
	 * Gets the newStreamPosition value for this ResultGetMObjects.
	 * 
	 * @return newStreamPosition
	 */
	public java.lang.String getNewStreamPosition() {
		return newStreamPosition;
	}

	/**
	 * Sets the newStreamPosition value for this ResultGetMObjects.
	 * 
	 * @param newStreamPosition
	 */
	public void setNewStreamPosition(java.lang.String newStreamPosition) {
		this.newStreamPosition = newStreamPosition;
	}

	/**
	 * Gets the mObjectList value for this ResultGetMObjects.
	 * 
	 * @return mObjectList
	 */
	public com.marketo.www.mktows.MObject[] getMObjectList() {
		return mObjectList;
	}

	/**
	 * Sets the mObjectList value for this ResultGetMObjects.
	 * 
	 * @param mObjectList
	 */
	public void setMObjectList(com.marketo.www.mktows.MObject[] mObjectList) {
		this.mObjectList = mObjectList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResultGetMObjects))
			return false;
		ResultGetMObjects other = (ResultGetMObjects) obj;
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
				&& this.returnCount == other.getReturnCount()
				&& this.hasMore == other.isHasMore()
				&& ((this.newStreamPosition == null && other
						.getNewStreamPosition() == null) || (this.newStreamPosition != null && this.newStreamPosition
						.equals(other.getNewStreamPosition())))
				&& ((this.mObjectList == null && other.getMObjectList() == null) || (this.mObjectList != null && java.util.Arrays
						.equals(this.mObjectList, other.getMObjectList())));
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
		_hashCode += getReturnCount();
		_hashCode += (isHasMore() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getNewStreamPosition() != null) {
			_hashCode += getNewStreamPosition().hashCode();
		}
		if (getMObjectList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getMObjectList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getMObjectList(), i);
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
			ResultGetMObjects.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ResultGetMObjects"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("returnCount");
		elemField.setXmlName(new javax.xml.namespace.QName("", "returnCount"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hasMore");
		elemField.setXmlName(new javax.xml.namespace.QName("", "hasMore"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
		elemField.setFieldName("MObjectList");
		elemField.setXmlName(new javax.xml.namespace.QName("", "mObjectList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObject"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "mObject"));
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
