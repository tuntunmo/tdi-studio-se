/**
 * ParamsSyncMObjects.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsSyncMObjects implements java.io.Serializable {
	private com.marketo.www.mktows.MObject[] mObjectList;

	private com.marketo.www.mktows.SyncOperationEnum operation;

	public ParamsSyncMObjects() {
	}

	public ParamsSyncMObjects(com.marketo.www.mktows.MObject[] mObjectList,
			com.marketo.www.mktows.SyncOperationEnum operation) {
		this.mObjectList = mObjectList;
		this.operation = operation;
	}

	/**
	 * Gets the mObjectList value for this ParamsSyncMObjects.
	 * 
	 * @return mObjectList
	 */
	public com.marketo.www.mktows.MObject[] getMObjectList() {
		return mObjectList;
	}

	/**
	 * Sets the mObjectList value for this ParamsSyncMObjects.
	 * 
	 * @param mObjectList
	 */
	public void setMObjectList(com.marketo.www.mktows.MObject[] mObjectList) {
		this.mObjectList = mObjectList;
	}

	/**
	 * Gets the operation value for this ParamsSyncMObjects.
	 * 
	 * @return operation
	 */
	public com.marketo.www.mktows.SyncOperationEnum getOperation() {
		return operation;
	}

	/**
	 * Sets the operation value for this ParamsSyncMObjects.
	 * 
	 * @param operation
	 */
	public void setOperation(com.marketo.www.mktows.SyncOperationEnum operation) {
		this.operation = operation;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsSyncMObjects))
			return false;
		ParamsSyncMObjects other = (ParamsSyncMObjects) obj;
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
				&& ((this.mObjectList == null && other.getMObjectList() == null) || (this.mObjectList != null && java.util.Arrays
						.equals(this.mObjectList, other.getMObjectList())))
				&& ((this.operation == null && other.getOperation() == null) || (this.operation != null && this.operation
						.equals(other.getOperation())));
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
		if (getOperation() != null) {
			_hashCode += getOperation().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParamsSyncMObjects.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsSyncMObjects"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("MObjectList");
		elemField.setXmlName(new javax.xml.namespace.QName("", "mObjectList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObject"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "mObject"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("operation");
		elemField.setXmlName(new javax.xml.namespace.QName("", "operation"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SyncOperationEnum"));
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
