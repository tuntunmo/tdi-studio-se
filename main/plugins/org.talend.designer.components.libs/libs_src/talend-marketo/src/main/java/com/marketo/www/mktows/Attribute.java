/**
 * Attribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class Attribute implements java.io.Serializable {
	private java.lang.String attrName;

	private java.lang.String attrType;

	private java.lang.String attrValue;

	public Attribute() {
	}

	public Attribute(java.lang.String attrName, java.lang.String attrType,
			java.lang.String attrValue) {
		this.attrName = attrName;
		this.attrType = attrType;
		this.attrValue = attrValue;
	}

	/**
	 * Gets the attrName value for this Attribute.
	 * 
	 * @return attrName
	 */
	public java.lang.String getAttrName() {
		return attrName;
	}

	/**
	 * Sets the attrName value for this Attribute.
	 * 
	 * @param attrName
	 */
	public void setAttrName(java.lang.String attrName) {
		this.attrName = attrName;
	}

	/**
	 * Gets the attrType value for this Attribute.
	 * 
	 * @return attrType
	 */
	public java.lang.String getAttrType() {
		return attrType;
	}

	/**
	 * Sets the attrType value for this Attribute.
	 * 
	 * @param attrType
	 */
	public void setAttrType(java.lang.String attrType) {
		this.attrType = attrType;
	}

	/**
	 * Gets the attrValue value for this Attribute.
	 * 
	 * @return attrValue
	 */
	public java.lang.String getAttrValue() {
		return attrValue;
	}

	/**
	 * Sets the attrValue value for this Attribute.
	 * 
	 * @param attrValue
	 */
	public void setAttrValue(java.lang.String attrValue) {
		this.attrValue = attrValue;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Attribute))
			return false;
		Attribute other = (Attribute) obj;
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
				&& ((this.attrName == null && other.getAttrName() == null) || (this.attrName != null && this.attrName
						.equals(other.getAttrName())))
				&& ((this.attrType == null && other.getAttrType() == null) || (this.attrType != null && this.attrType
						.equals(other.getAttrType())))
				&& ((this.attrValue == null && other.getAttrValue() == null) || (this.attrValue != null && this.attrValue
						.equals(other.getAttrValue())));
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
		if (getAttrName() != null) {
			_hashCode += getAttrName().hashCode();
		}
		if (getAttrType() != null) {
			_hashCode += getAttrType().hashCode();
		}
		if (getAttrValue() != null) {
			_hashCode += getAttrValue().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Attribute.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "Attribute"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("attrName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "attrName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("attrType");
		elemField.setXmlName(new javax.xml.namespace.QName("", "attrType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("attrValue");
		elemField.setXmlName(new javax.xml.namespace.QName("", "attrValue"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
