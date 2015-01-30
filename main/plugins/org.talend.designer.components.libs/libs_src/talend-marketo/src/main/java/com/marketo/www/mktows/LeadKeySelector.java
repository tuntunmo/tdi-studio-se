/**
 * LeadKeySelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class LeadKeySelector extends com.marketo.www.mktows.LeadSelector implements
		java.io.Serializable {
	private com.marketo.www.mktows.LeadKeyRef keyType;

	private java.lang.String[] keyValues;

	public LeadKeySelector() {
	}

	public LeadKeySelector(com.marketo.www.mktows.LeadKeyRef keyType,
			java.lang.String[] keyValues) {
		this.keyType = keyType;
		this.keyValues = keyValues;
	}

	/**
	 * Gets the keyType value for this LeadKeySelector.
	 * 
	 * @return keyType
	 */
	public com.marketo.www.mktows.LeadKeyRef getKeyType() {
		return keyType;
	}

	/**
	 * Sets the keyType value for this LeadKeySelector.
	 * 
	 * @param keyType
	 */
	public void setKeyType(com.marketo.www.mktows.LeadKeyRef keyType) {
		this.keyType = keyType;
	}

	/**
	 * Gets the keyValues value for this LeadKeySelector.
	 * 
	 * @return keyValues
	 */
	public java.lang.String[] getKeyValues() {
		return keyValues;
	}

	/**
	 * Sets the keyValues value for this LeadKeySelector.
	 * 
	 * @param keyValues
	 */
	public void setKeyValues(java.lang.String[] keyValues) {
		this.keyValues = keyValues;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LeadKeySelector))
			return false;
		LeadKeySelector other = (LeadKeySelector) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj)
				&& ((this.keyType == null && other.getKeyType() == null) || (this.keyType != null && this.keyType
						.equals(other.getKeyType())))
				&& ((this.keyValues == null && other.getKeyValues() == null) || (this.keyValues != null && java.util.Arrays
						.equals(this.keyValues, other.getKeyValues())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = super.hashCode();
		if (getKeyType() != null) {
			_hashCode += getKeyType().hashCode();
		}
		if (getKeyValues() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getKeyValues()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getKeyValues(), i);
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
			LeadKeySelector.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadKeySelector"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("keyType");
		elemField.setXmlName(new javax.xml.namespace.QName("", "keyType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadKeyRef"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("keyValues");
		elemField.setXmlName(new javax.xml.namespace.QName("", "keyValues"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "stringItem"));
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
