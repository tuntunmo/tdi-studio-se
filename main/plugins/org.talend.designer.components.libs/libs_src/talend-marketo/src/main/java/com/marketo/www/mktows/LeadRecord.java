/**
 * LeadRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class LeadRecord implements java.io.Serializable {
	private java.lang.Integer id;

	private java.lang.String email;

	private java.lang.String foreignSysPersonId;

	private com.marketo.www.mktows.ForeignSysType foreignSysType;

	private com.marketo.www.mktows.Attribute[] leadAttributeList;

	public LeadRecord() {
	}

	public LeadRecord(java.lang.Integer id, java.lang.String email,
			java.lang.String foreignSysPersonId,
			com.marketo.www.mktows.ForeignSysType foreignSysType,
			com.marketo.www.mktows.Attribute[] leadAttributeList) {
		this.id = id;
		this.email = email;
		this.foreignSysPersonId = foreignSysPersonId;
		this.foreignSysType = foreignSysType;
		this.leadAttributeList = leadAttributeList;
	}

	/**
	 * Gets the id value for this LeadRecord.
	 * 
	 * @return id
	 */
	public java.lang.Integer getId() {
		return id;
	}

	/**
	 * Sets the id value for this LeadRecord.
	 * 
	 * @param id
	 */
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	/**
	 * Gets the email value for this LeadRecord.
	 * 
	 * @return email
	 */
	public java.lang.String getEmail() {
		return email;
	}

	/**
	 * Sets the email value for this LeadRecord.
	 * 
	 * @param email
	 */
	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	/**
	 * Gets the foreignSysPersonId value for this LeadRecord.
	 * 
	 * @return foreignSysPersonId
	 */
	public java.lang.String getForeignSysPersonId() {
		return foreignSysPersonId;
	}

	/**
	 * Sets the foreignSysPersonId value for this LeadRecord.
	 * 
	 * @param foreignSysPersonId
	 */
	public void setForeignSysPersonId(java.lang.String foreignSysPersonId) {
		this.foreignSysPersonId = foreignSysPersonId;
	}

	/**
	 * Gets the foreignSysType value for this LeadRecord.
	 * 
	 * @return foreignSysType
	 */
	public com.marketo.www.mktows.ForeignSysType getForeignSysType() {
		return foreignSysType;
	}

	/**
	 * Sets the foreignSysType value for this LeadRecord.
	 * 
	 * @param foreignSysType
	 */
	public void setForeignSysType(
			com.marketo.www.mktows.ForeignSysType foreignSysType) {
		this.foreignSysType = foreignSysType;
	}

	/**
	 * Gets the leadAttributeList value for this LeadRecord.
	 * 
	 * @return leadAttributeList
	 */
	public com.marketo.www.mktows.Attribute[] getLeadAttributeList() {
		return leadAttributeList;
	}

	/**
	 * Sets the leadAttributeList value for this LeadRecord.
	 * 
	 * @param leadAttributeList
	 */
	public void setLeadAttributeList(
			com.marketo.www.mktows.Attribute[] leadAttributeList) {
		this.leadAttributeList = leadAttributeList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LeadRecord))
			return false;
		LeadRecord other = (LeadRecord) obj;
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
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& ((this.email == null && other.getEmail() == null) || (this.email != null && this.email
						.equals(other.getEmail())))
				&& ((this.foreignSysPersonId == null && other
						.getForeignSysPersonId() == null) || (this.foreignSysPersonId != null && this.foreignSysPersonId
						.equals(other.getForeignSysPersonId())))
				&& ((this.foreignSysType == null && other.getForeignSysType() == null) || (this.foreignSysType != null && this.foreignSysType
						.equals(other.getForeignSysType())))
				&& ((this.leadAttributeList == null && other
						.getLeadAttributeList() == null) || (this.leadAttributeList != null && java.util.Arrays
						.equals(this.leadAttributeList,
								other.getLeadAttributeList())));
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
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getEmail() != null) {
			_hashCode += getEmail().hashCode();
		}
		if (getForeignSysPersonId() != null) {
			_hashCode += getForeignSysPersonId().hashCode();
		}
		if (getForeignSysType() != null) {
			_hashCode += getForeignSysType().hashCode();
		}
		if (getLeadAttributeList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getLeadAttributeList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLeadAttributeList(), i);
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
			LeadRecord.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadRecord"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("email");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Email"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("foreignSysPersonId");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"ForeignSysPersonId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("foreignSysType");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "ForeignSysType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ForeignSysType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leadAttributeList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"leadAttributeList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "Attribute"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
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
