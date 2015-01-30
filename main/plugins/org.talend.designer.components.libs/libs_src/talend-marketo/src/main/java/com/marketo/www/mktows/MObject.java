/**
 * MObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class MObject implements java.io.Serializable {
	private java.lang.String type;

	private java.lang.Integer id;

	private com.marketo.www.mktows.Attrib externalKey;

	private java.util.Calendar createdAt;

	private java.util.Calendar updatedAt;

	private com.marketo.www.mktows.Attrib[] attribList;

	private com.marketo.www.mktows.TypeAttrib[] typeAttribList;

	private com.marketo.www.mktows.MObjAssociation[] associationList;

	public MObject() {
	}

	public MObject(java.lang.String type, java.lang.Integer id,
			com.marketo.www.mktows.Attrib externalKey,
			java.util.Calendar createdAt, java.util.Calendar updatedAt,
			com.marketo.www.mktows.Attrib[] attribList,
			com.marketo.www.mktows.TypeAttrib[] typeAttribList,
			com.marketo.www.mktows.MObjAssociation[] associationList) {
		this.type = type;
		this.id = id;
		this.externalKey = externalKey;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.attribList = attribList;
		this.typeAttribList = typeAttribList;
		this.associationList = associationList;
	}

	/**
	 * Gets the type value for this MObject.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this MObject.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the id value for this MObject.
	 * 
	 * @return id
	 */
	public java.lang.Integer getId() {
		return id;
	}

	/**
	 * Sets the id value for this MObject.
	 * 
	 * @param id
	 */
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	/**
	 * Gets the externalKey value for this MObject.
	 * 
	 * @return externalKey
	 */
	public com.marketo.www.mktows.Attrib getExternalKey() {
		return externalKey;
	}

	/**
	 * Sets the externalKey value for this MObject.
	 * 
	 * @param externalKey
	 */
	public void setExternalKey(com.marketo.www.mktows.Attrib externalKey) {
		this.externalKey = externalKey;
	}

	/**
	 * Gets the createdAt value for this MObject.
	 * 
	 * @return createdAt
	 */
	public java.util.Calendar getCreatedAt() {
		return createdAt;
	}

	/**
	 * Sets the createdAt value for this MObject.
	 * 
	 * @param createdAt
	 */
	public void setCreatedAt(java.util.Calendar createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * Gets the updatedAt value for this MObject.
	 * 
	 * @return updatedAt
	 */
	public java.util.Calendar getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Sets the updatedAt value for this MObject.
	 * 
	 * @param updatedAt
	 */
	public void setUpdatedAt(java.util.Calendar updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * Gets the attribList value for this MObject.
	 * 
	 * @return attribList
	 */
	public com.marketo.www.mktows.Attrib[] getAttribList() {
		return attribList;
	}

	/**
	 * Sets the attribList value for this MObject.
	 * 
	 * @param attribList
	 */
	public void setAttribList(com.marketo.www.mktows.Attrib[] attribList) {
		this.attribList = attribList;
	}

	/**
	 * Gets the typeAttribList value for this MObject.
	 * 
	 * @return typeAttribList
	 */
	public com.marketo.www.mktows.TypeAttrib[] getTypeAttribList() {
		return typeAttribList;
	}

	/**
	 * Sets the typeAttribList value for this MObject.
	 * 
	 * @param typeAttribList
	 */
	public void setTypeAttribList(com.marketo.www.mktows.TypeAttrib[] typeAttribList) {
		this.typeAttribList = typeAttribList;
	}

	/**
	 * Gets the associationList value for this MObject.
	 * 
	 * @return associationList
	 */
	public com.marketo.www.mktows.MObjAssociation[] getAssociationList() {
		return associationList;
	}

	/**
	 * Sets the associationList value for this MObject.
	 * 
	 * @param associationList
	 */
	public void setAssociationList(
			com.marketo.www.mktows.MObjAssociation[] associationList) {
		this.associationList = associationList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MObject))
			return false;
		MObject other = (MObject) obj;
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
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& ((this.externalKey == null && other.getExternalKey() == null) || (this.externalKey != null && this.externalKey
						.equals(other.getExternalKey())))
				&& ((this.createdAt == null && other.getCreatedAt() == null) || (this.createdAt != null && this.createdAt
						.equals(other.getCreatedAt())))
				&& ((this.updatedAt == null && other.getUpdatedAt() == null) || (this.updatedAt != null && this.updatedAt
						.equals(other.getUpdatedAt())))
				&& ((this.attribList == null && other.getAttribList() == null) || (this.attribList != null && java.util.Arrays
						.equals(this.attribList, other.getAttribList())))
				&& ((this.typeAttribList == null && other.getTypeAttribList() == null) || (this.typeAttribList != null && java.util.Arrays
						.equals(this.typeAttribList, other.getTypeAttribList())))
				&& ((this.associationList == null && other.getAssociationList() == null) || (this.associationList != null && java.util.Arrays
						.equals(this.associationList,
								other.getAssociationList())));
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
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getExternalKey() != null) {
			_hashCode += getExternalKey().hashCode();
		}
		if (getCreatedAt() != null) {
			_hashCode += getCreatedAt().hashCode();
		}
		if (getUpdatedAt() != null) {
			_hashCode += getUpdatedAt().hashCode();
		}
		if (getAttribList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getAttribList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getAttribList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getTypeAttribList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getTypeAttribList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getTypeAttribList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getAssociationList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getAssociationList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getAssociationList(), i);
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
			MObject.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObject"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("createdAt");
		elemField.setXmlName(new javax.xml.namespace.QName("", "createdAt"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("updatedAt");
		elemField.setXmlName(new javax.xml.namespace.QName("", "updatedAt"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("attribList");
		elemField.setXmlName(new javax.xml.namespace.QName("", "attribList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "Attrib"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "attrib"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("typeAttribList");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "typeAttribList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "TypeAttrib"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "typeAttrib"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("associationList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"associationList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObjAssociation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("",
				"mObjAssociation"));
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
