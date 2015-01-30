/**
 * ResultDeleteMObjects.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ResultDeleteMObjects implements java.io.Serializable {
	private com.marketo.www.mktows.MObjStatus[] mObjStatusList;

	public ResultDeleteMObjects() {
	}

	public ResultDeleteMObjects(com.marketo.www.mktows.MObjStatus[] mObjStatusList) {
		this.mObjStatusList = mObjStatusList;
	}

	/**
	 * Gets the mObjStatusList value for this ResultDeleteMObjects.
	 * 
	 * @return mObjStatusList
	 */
	public com.marketo.www.mktows.MObjStatus[] getMObjStatusList() {
		return mObjStatusList;
	}

	/**
	 * Sets the mObjStatusList value for this ResultDeleteMObjects.
	 * 
	 * @param mObjStatusList
	 */
	public void setMObjStatusList(com.marketo.www.mktows.MObjStatus[] mObjStatusList) {
		this.mObjStatusList = mObjStatusList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResultDeleteMObjects))
			return false;
		ResultDeleteMObjects other = (ResultDeleteMObjects) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.mObjStatusList == null && other
				.getMObjStatusList() == null) || (this.mObjStatusList != null && java.util.Arrays
				.equals(this.mObjStatusList, other.getMObjStatusList())));
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
		if (getMObjStatusList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getMObjStatusList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getMObjStatusList(), i);
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
			ResultDeleteMObjects.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ResultDeleteMObjects"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("MObjStatusList");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "mObjStatusList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObjStatus"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "mObjStatus"));
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
