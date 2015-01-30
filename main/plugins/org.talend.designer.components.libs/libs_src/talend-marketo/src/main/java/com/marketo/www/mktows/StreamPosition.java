/**
 * StreamPosition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class StreamPosition implements java.io.Serializable {
	private java.util.Calendar latestCreatedAt;

	private java.util.Calendar oldestCreatedAt;

	private java.util.Calendar activityCreatedAt;

	private java.lang.String offset;

	public StreamPosition() {
	}

	public StreamPosition(java.util.Calendar latestCreatedAt,
			java.util.Calendar oldestCreatedAt,
			java.util.Calendar activityCreatedAt, java.lang.String offset) {
		this.latestCreatedAt = latestCreatedAt;
		this.oldestCreatedAt = oldestCreatedAt;
		this.activityCreatedAt = activityCreatedAt;
		this.offset = offset;
	}

	/**
	 * Gets the latestCreatedAt value for this StreamPosition.
	 * 
	 * @return latestCreatedAt
	 */
	public java.util.Calendar getLatestCreatedAt() {
		return latestCreatedAt;
	}

	/**
	 * Sets the latestCreatedAt value for this StreamPosition.
	 * 
	 * @param latestCreatedAt
	 */
	public void setLatestCreatedAt(java.util.Calendar latestCreatedAt) {
		this.latestCreatedAt = latestCreatedAt;
	}

	/**
	 * Gets the oldestCreatedAt value for this StreamPosition.
	 * 
	 * @return oldestCreatedAt
	 */
	public java.util.Calendar getOldestCreatedAt() {
		return oldestCreatedAt;
	}

	/**
	 * Sets the oldestCreatedAt value for this StreamPosition.
	 * 
	 * @param oldestCreatedAt
	 */
	public void setOldestCreatedAt(java.util.Calendar oldestCreatedAt) {
		this.oldestCreatedAt = oldestCreatedAt;
	}

	/**
	 * Gets the activityCreatedAt value for this StreamPosition.
	 * 
	 * @return activityCreatedAt
	 */
	public java.util.Calendar getActivityCreatedAt() {
		return activityCreatedAt;
	}

	/**
	 * Sets the activityCreatedAt value for this StreamPosition.
	 * 
	 * @param activityCreatedAt
	 */
	public void setActivityCreatedAt(java.util.Calendar activityCreatedAt) {
		this.activityCreatedAt = activityCreatedAt;
	}

	/**
	 * Gets the offset value for this StreamPosition.
	 * 
	 * @return offset
	 */
	public java.lang.String getOffset() {
		return offset;
	}

	/**
	 * Sets the offset value for this StreamPosition.
	 * 
	 * @param offset
	 */
	public void setOffset(java.lang.String offset) {
		this.offset = offset;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof StreamPosition))
			return false;
		StreamPosition other = (StreamPosition) obj;
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
				&& ((this.latestCreatedAt == null && other.getLatestCreatedAt() == null) || (this.latestCreatedAt != null && this.latestCreatedAt
						.equals(other.getLatestCreatedAt())))
				&& ((this.oldestCreatedAt == null && other.getOldestCreatedAt() == null) || (this.oldestCreatedAt != null && this.oldestCreatedAt
						.equals(other.getOldestCreatedAt())))
				&& ((this.activityCreatedAt == null && other
						.getActivityCreatedAt() == null) || (this.activityCreatedAt != null && this.activityCreatedAt
						.equals(other.getActivityCreatedAt())))
				&& ((this.offset == null && other.getOffset() == null) || (this.offset != null && this.offset
						.equals(other.getOffset())));
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
		if (getLatestCreatedAt() != null) {
			_hashCode += getLatestCreatedAt().hashCode();
		}
		if (getOldestCreatedAt() != null) {
			_hashCode += getOldestCreatedAt().hashCode();
		}
		if (getActivityCreatedAt() != null) {
			_hashCode += getActivityCreatedAt().hashCode();
		}
		if (getOffset() != null) {
			_hashCode += getOffset().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			StreamPosition.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "StreamPosition"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("latestCreatedAt");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"latestCreatedAt"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("oldestCreatedAt");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"oldestCreatedAt"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("activityCreatedAt");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"activityCreatedAt"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("offset");
		elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
