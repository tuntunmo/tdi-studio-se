/**
 * LeadKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class LeadKey implements java.io.Serializable {
	private com.marketo.www.mktows.LeadKeyRef keyType;

	private java.lang.String keyValue;

	public LeadKey() {
	}

	public LeadKey(com.marketo.www.mktows.LeadKeyRef keyType,
			java.lang.String keyValue) {
		this.keyType = keyType;
		this.keyValue = keyValue;
	}

	/**
	 * Gets the keyType value for this LeadKey.
	 * 
	 * @return keyType
	 */
	public com.marketo.www.mktows.LeadKeyRef getKeyType() {
		return keyType;
	}

	/**
	 * Sets the keyType value for this LeadKey.
	 * 
	 * @param keyType
	 */
	public void setKeyType(com.marketo.www.mktows.LeadKeyRef keyType) {
		this.keyType = keyType;
	}

	/**
	 * Gets the keyValue value for this LeadKey.
	 * 
	 * @return keyValue
	 */
	public java.lang.String getKeyValue() {
		return keyValue;
	}

	/**
	 * Sets the keyValue value for this LeadKey.
	 * 
	 * @param keyValue
	 */
	public void setKeyValue(java.lang.String keyValue) {
		this.keyValue = keyValue;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LeadKey))
			return false;
		LeadKey other = (LeadKey) obj;
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
				&& ((this.keyType == null && other.getKeyType() == null) || (this.keyType != null && this.keyType
						.equals(other.getKeyType())))
				&& ((this.keyValue == null && other.getKeyValue() == null) || (this.keyValue != null && this.keyValue
						.equals(other.getKeyValue())));
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
		if (getKeyType() != null) {
			_hashCode += getKeyType().hashCode();
		}
		if (getKeyValue() != null) {
			_hashCode += getKeyValue().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			LeadKey.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadKey"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("keyType");
		elemField.setXmlName(new javax.xml.namespace.QName("", "keyType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadKeyRef"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("keyValue");
		elemField.setXmlName(new javax.xml.namespace.QName("", "keyValue"));
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
