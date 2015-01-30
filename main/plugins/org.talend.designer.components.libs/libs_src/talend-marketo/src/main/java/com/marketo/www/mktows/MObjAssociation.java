/**
 * MObjAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class MObjAssociation implements java.io.Serializable {
	private java.lang.String mObjType;

	private java.lang.Integer id;

	private com.marketo.www.mktows.Attrib externalKey;

	public MObjAssociation() {
	}

	public MObjAssociation(java.lang.String mObjType, java.lang.Integer id,
			com.marketo.www.mktows.Attrib externalKey) {
		this.mObjType = mObjType;
		this.id = id;
		this.externalKey = externalKey;
	}

	/**
	 * Gets the mObjType value for this MObjAssociation.
	 * 
	 * @return mObjType
	 */
	public java.lang.String getMObjType() {
		return mObjType;
	}

	/**
	 * Sets the mObjType value for this MObjAssociation.
	 * 
	 * @param mObjType
	 */
	public void setMObjType(java.lang.String mObjType) {
		this.mObjType = mObjType;
	}

	/**
	 * Gets the id value for this MObjAssociation.
	 * 
	 * @return id
	 */
	public java.lang.Integer getId() {
		return id;
	}

	/**
	 * Sets the id value for this MObjAssociation.
	 * 
	 * @param id
	 */
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	/**
	 * Gets the externalKey value for this MObjAssociation.
	 * 
	 * @return externalKey
	 */
	public com.marketo.www.mktows.Attrib getExternalKey() {
		return externalKey;
	}

	/**
	 * Sets the externalKey value for this MObjAssociation.
	 * 
	 * @param externalKey
	 */
	public void setExternalKey(com.marketo.www.mktows.Attrib externalKey) {
		this.externalKey = externalKey;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MObjAssociation))
			return false;
		MObjAssociation other = (MObjAssociation) obj;
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
				&& ((this.mObjType == null && other.getMObjType() == null) || (this.mObjType != null && this.mObjType
						.equals(other.getMObjType())))
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& ((this.externalKey == null && other.getExternalKey() == null) || (this.externalKey != null && this.externalKey
						.equals(other.getExternalKey())));
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
		if (getMObjType() != null) {
			_hashCode += getMObjType().hashCode();
		}
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getExternalKey() != null) {
			_hashCode += getExternalKey().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			MObjAssociation.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObjAssociation"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("MObjType");
		elemField.setXmlName(new javax.xml.namespace.QName("", "mObjType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("externalKey");
		elemField.setXmlName(new javax.xml.namespace.QName("", "externalKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "Attrib"));
		elemField.setMinOccurs(0);
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
