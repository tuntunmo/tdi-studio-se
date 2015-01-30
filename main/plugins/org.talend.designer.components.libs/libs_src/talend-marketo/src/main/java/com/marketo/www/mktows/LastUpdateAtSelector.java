/**
 * LastUpdateAtSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class LastUpdateAtSelector extends com.marketo.www.mktows.LeadSelector
		implements java.io.Serializable {
	private java.util.Calendar latestUpdatedAt;

	private java.util.Calendar oldestUpdatedAt;

	public LastUpdateAtSelector() {
	}

	public LastUpdateAtSelector(java.util.Calendar latestUpdatedAt,
			java.util.Calendar oldestUpdatedAt) {
		this.latestUpdatedAt = latestUpdatedAt;
		this.oldestUpdatedAt = oldestUpdatedAt;
	}

	/**
	 * Gets the latestUpdatedAt value for this LastUpdateAtSelector.
	 * 
	 * @return latestUpdatedAt
	 */
	public java.util.Calendar getLatestUpdatedAt() {
		return latestUpdatedAt;
	}

	/**
	 * Sets the latestUpdatedAt value for this LastUpdateAtSelector.
	 * 
	 * @param latestUpdatedAt
	 */
	public void setLatestUpdatedAt(java.util.Calendar latestUpdatedAt) {
		this.latestUpdatedAt = latestUpdatedAt;
	}

	/**
	 * Gets the oldestUpdatedAt value for this LastUpdateAtSelector.
	 * 
	 * @return oldestUpdatedAt
	 */
	public java.util.Calendar getOldestUpdatedAt() {
		return oldestUpdatedAt;
	}

	/**
	 * Sets the oldestUpdatedAt value for this LastUpdateAtSelector.
	 * 
	 * @param oldestUpdatedAt
	 */
	public void setOldestUpdatedAt(java.util.Calendar oldestUpdatedAt) {
		this.oldestUpdatedAt = oldestUpdatedAt;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LastUpdateAtSelector))
			return false;
		LastUpdateAtSelector other = (LastUpdateAtSelector) obj;
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
				&& ((this.latestUpdatedAt == null && other.getLatestUpdatedAt() == null) || (this.latestUpdatedAt != null && this.latestUpdatedAt
						.equals(other.getLatestUpdatedAt())))
				&& ((this.oldestUpdatedAt == null && other.getOldestUpdatedAt() == null) || (this.oldestUpdatedAt != null && this.oldestUpdatedAt
						.equals(other.getOldestUpdatedAt())));
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
		if (getLatestUpdatedAt() != null) {
			_hashCode += getLatestUpdatedAt().hashCode();
		}
		if (getOldestUpdatedAt() != null) {
			_hashCode += getOldestUpdatedAt().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			LastUpdateAtSelector.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LastUpdateAtSelector"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("latestUpdatedAt");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"latestUpdatedAt"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("oldestUpdatedAt");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"oldestUpdatedAt"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
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
