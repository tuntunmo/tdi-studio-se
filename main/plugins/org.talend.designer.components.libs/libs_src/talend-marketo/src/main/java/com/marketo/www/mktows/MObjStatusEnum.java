/**
 * MObjStatusEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class MObjStatusEnum implements java.io.Serializable {
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected MObjStatusEnum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _CREATED = "CREATED";
	public static final java.lang.String _UPDATED = "UPDATED";
	public static final java.lang.String _DELETED = "DELETED";
	public static final java.lang.String _FAILED = "FAILED";
	public static final java.lang.String _UNCHANGED = "UNCHANGED";
	public static final java.lang.String _SKIPPED = "SKIPPED";
	public static final MObjStatusEnum CREATED = new MObjStatusEnum(_CREATED);
	public static final MObjStatusEnum UPDATED = new MObjStatusEnum(_UPDATED);
	public static final MObjStatusEnum DELETED = new MObjStatusEnum(_DELETED);
	public static final MObjStatusEnum FAILED = new MObjStatusEnum(_FAILED);
	public static final MObjStatusEnum UNCHANGED = new MObjStatusEnum(
			_UNCHANGED);
	public static final MObjStatusEnum SKIPPED = new MObjStatusEnum(_SKIPPED);

	public java.lang.String getValue() {
		return _value_;
	}

	public static MObjStatusEnum fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		MObjStatusEnum enumeration = (MObjStatusEnum) _table_.get(value);
		if (enumeration == null)
			throw new java.lang.IllegalArgumentException();
		return enumeration;
	}

	public static MObjStatusEnum fromString(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		return fromValue(value);
	}

	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public java.lang.String toString() {
		return _value_;
	}

	public java.lang.Object readResolve() throws java.io.ObjectStreamException {
		return fromValue(_value_);
	}

	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumSerializer(_javaType,
				_xmlType);
	}

	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumDeserializer(_javaType,
				_xmlType);
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			MObjStatusEnum.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObjStatusEnum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
