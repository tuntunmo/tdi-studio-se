/**
 * TypeAttrib.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class TypeAttrib implements java.io.Serializable {
	private java.lang.String attrType;

	private com.marketo.www.mktows.Attrib[] attrList;

	public TypeAttrib() {
	}

	public TypeAttrib(java.lang.String attrType,
			com.marketo.www.mktows.Attrib[] attrList) {
		this.attrType = attrType;
		this.attrList = attrList;
	}

	/**
	 * Gets the attrType value for this TypeAttrib.
	 * 
	 * @return attrType
	 */
	public java.lang.String getAttrType() {
		return attrType;
	}

	/**
	 * Sets the attrType value for this TypeAttrib.
	 * 
	 * @param attrType
	 */
	public void setAttrType(java.lang.String attrType) {
		this.attrType = attrType;
	}

	/**
	 * Gets the attrList value for this TypeAttrib.
	 * 
	 * @return attrList
	 */
	public com.marketo.www.mktows.Attrib[] getAttrList() {
		return attrList;
	}

	/**
	 * Sets the attrList value for this TypeAttrib.
	 * 
	 * @param attrList
	 */
	public void setAttrList(com.marketo.www.mktows.Attrib[] attrList) {
		this.attrList = attrList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof TypeAttrib))
			return false;
		TypeAttrib other = (TypeAttrib) obj;
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
				&& ((this.attrType == null && other.getAttrType() == null) || (this.attrType != null && this.attrType
						.equals(other.getAttrType())))
				&& ((this.attrList == null && other.getAttrList() == null) || (this.attrList != null && java.util.Arrays
						.equals(this.attrList, other.getAttrList())));
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
		if (getAttrType() != null) {
			_hashCode += getAttrType().hashCode();
		}
		if (getAttrList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getAttrList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getAttrList(), i);
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
			TypeAttrib.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "TypeAttrib"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("attrType");
		elemField.setXmlName(new javax.xml.namespace.QName("", "attrType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("attrList");
		elemField.setXmlName(new javax.xml.namespace.QName("", "attrList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "Attrib"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "attrib"));
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
