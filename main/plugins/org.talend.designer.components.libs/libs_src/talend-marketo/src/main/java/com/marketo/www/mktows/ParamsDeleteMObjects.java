/**
 * ParamsDeleteMObjects.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsDeleteMObjects implements java.io.Serializable {
	private com.marketo.www.mktows.MObject[] mObjectList;

	public ParamsDeleteMObjects() {
	}

	public ParamsDeleteMObjects(com.marketo.www.mktows.MObject[] mObjectList) {
		this.mObjectList = mObjectList;
	}

	/**
	 * Gets the mObjectList value for this ParamsDeleteMObjects.
	 * 
	 * @return mObjectList
	 */
	public com.marketo.www.mktows.MObject[] getMObjectList() {
		return mObjectList;
	}

	/**
	 * Sets the mObjectList value for this ParamsDeleteMObjects.
	 * 
	 * @param mObjectList
	 */
	public void setMObjectList(com.marketo.www.mktows.MObject[] mObjectList) {
		this.mObjectList = mObjectList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsDeleteMObjects))
			return false;
		ParamsDeleteMObjects other = (ParamsDeleteMObjects) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.mObjectList == null && other.getMObjectList() == null) || (this.mObjectList != null && java.util.Arrays
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
			ParamsDeleteMObjects.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsDeleteMObjects"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("MObjectList");
		elemField.setXmlName(new javax.xml.namespace.QName("", "mObjectList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObject"));
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
