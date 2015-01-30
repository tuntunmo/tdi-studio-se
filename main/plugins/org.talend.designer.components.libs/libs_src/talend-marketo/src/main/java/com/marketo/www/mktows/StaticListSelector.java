/**
 * StaticListSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class StaticListSelector extends com.marketo.www.mktows.LeadSelector
		implements java.io.Serializable {
	private java.lang.String staticListName;

	private java.lang.Integer staticListId;

	public StaticListSelector() {
	}

	public StaticListSelector(java.lang.String staticListName,
			java.lang.Integer staticListId) {
		this.staticListName = staticListName;
		this.staticListId = staticListId;
	}

	/**
	 * Gets the staticListName value for this StaticListSelector.
	 * 
	 * @return staticListName
	 */
	public java.lang.String getStaticListName() {
		return staticListName;
	}

	/**
	 * Sets the staticListName value for this StaticListSelector.
	 * 
	 * @param staticListName
	 */
	public void setStaticListName(java.lang.String staticListName) {
		this.staticListName = staticListName;
	}

	/**
	 * Gets the staticListId value for this StaticListSelector.
	 * 
	 * @return staticListId
	 */
	public java.lang.Integer getStaticListId() {
		return staticListId;
	}

	/**
	 * Sets the staticListId value for this StaticListSelector.
	 * 
	 * @param staticListId
	 */
	public void setStaticListId(java.lang.Integer staticListId) {
		this.staticListId = staticListId;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof StaticListSelector))
			return false;
		StaticListSelector other = (StaticListSelector) obj;
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
				&& ((this.staticListName == null && other.getStaticListName() == null) || (this.staticListName != null && this.staticListName
						.equals(other.getStaticListName())))
				&& ((this.staticListId == null && other.getStaticListId() == null) || (this.staticListId != null && this.staticListId
						.equals(other.getStaticListId())));
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
		if (getStaticListName() != null) {
			_hashCode += getStaticListName().hashCode();
		}
		if (getStaticListId() != null) {
			_hashCode += getStaticListId().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			StaticListSelector.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "StaticListSelector"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("staticListName");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "staticListName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("staticListId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "staticListId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
