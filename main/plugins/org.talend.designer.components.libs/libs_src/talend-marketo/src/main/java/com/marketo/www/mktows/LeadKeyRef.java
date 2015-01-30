/**
 * LeadKeyRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class LeadKeyRef implements java.io.Serializable {
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected LeadKeyRef(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _IDNUM = "IDNUM";
	public static final java.lang.String _COOKIE = "COOKIE";
	public static final java.lang.String _EMAIL = "EMAIL";
	public static final java.lang.String _LEADOWNEREMAIL = "LEADOWNEREMAIL";
	public static final java.lang.String _SFDCACCOUNTID = "SFDCACCOUNTID";
	public static final java.lang.String _SFDCCONTACTID = "SFDCCONTACTID";
	public static final java.lang.String _SFDCLEADID = "SFDCLEADID";
	public static final java.lang.String _SFDCLEADOWNERID = "SFDCLEADOWNERID";
	public static final java.lang.String _SFDCOPPTYID = "SFDCOPPTYID";
	public static final LeadKeyRef IDNUM = new LeadKeyRef(_IDNUM);
	public static final LeadKeyRef COOKIE = new LeadKeyRef(_COOKIE);
	public static final LeadKeyRef EMAIL = new LeadKeyRef(_EMAIL);
	public static final LeadKeyRef LEADOWNEREMAIL = new LeadKeyRef(
			_LEADOWNEREMAIL);
	public static final LeadKeyRef SFDCACCOUNTID = new LeadKeyRef(
			_SFDCACCOUNTID);
	public static final LeadKeyRef SFDCCONTACTID = new LeadKeyRef(
			_SFDCCONTACTID);
	public static final LeadKeyRef SFDCLEADID = new LeadKeyRef(_SFDCLEADID);
	public static final LeadKeyRef SFDCLEADOWNERID = new LeadKeyRef(
			_SFDCLEADOWNERID);
	public static final LeadKeyRef SFDCOPPTYID = new LeadKeyRef(_SFDCOPPTYID);

	public java.lang.String getValue() {
		return _value_;
	}

	public static LeadKeyRef fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		LeadKeyRef enumeration = (LeadKeyRef) _table_.get(value);
		if (enumeration == null)
			throw new java.lang.IllegalArgumentException();
		return enumeration;
	}

	public static LeadKeyRef fromString(java.lang.String value)
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
			LeadKeyRef.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadKeyRef"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
