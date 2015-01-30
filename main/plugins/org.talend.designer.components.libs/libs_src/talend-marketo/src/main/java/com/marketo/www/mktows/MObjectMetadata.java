/**
 * MObjectMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class MObjectMetadata implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String description;

	private boolean isCustom;

	private boolean isVirtual;

	private com.marketo.www.mktows.MObjFieldMetadata[] fieldList;

	private java.util.Calendar updatedAt;

	public MObjectMetadata() {
	}

	public MObjectMetadata(java.lang.String name, java.lang.String description,
			boolean isCustom, boolean isVirtual,
			com.marketo.www.mktows.MObjFieldMetadata[] fieldList,
			java.util.Calendar updatedAt) {
		this.name = name;
		this.description = description;
		this.isCustom = isCustom;
		this.isVirtual = isVirtual;
		this.fieldList = fieldList;
		this.updatedAt = updatedAt;
	}

	/**
	 * Gets the name value for this MObjectMetadata.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this MObjectMetadata.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the description value for this MObjectMetadata.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this MObjectMetadata.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * Gets the isCustom value for this MObjectMetadata.
	 * 
	 * @return isCustom
	 */
	public boolean isIsCustom() {
		return isCustom;
	}

	/**
	 * Sets the isCustom value for this MObjectMetadata.
	 * 
	 * @param isCustom
	 */
	public void setIsCustom(boolean isCustom) {
		this.isCustom = isCustom;
	}

	/**
	 * Gets the isVirtual value for this MObjectMetadata.
	 * 
	 * @return isVirtual
	 */
	public boolean isIsVirtual() {
		return isVirtual;
	}

	/**
	 * Sets the isVirtual value for this MObjectMetadata.
	 * 
	 * @param isVirtual
	 */
	public void setIsVirtual(boolean isVirtual) {
		this.isVirtual = isVirtual;
	}

	/**
	 * Gets the fieldList value for this MObjectMetadata.
	 * 
	 * @return fieldList
	 */
	public com.marketo.www.mktows.MObjFieldMetadata[] getFieldList() {
		return fieldList;
	}

	/**
	 * Sets the fieldList value for this MObjectMetadata.
	 * 
	 * @param fieldList
	 */
	public void setFieldList(com.marketo.www.mktows.MObjFieldMetadata[] fieldList) {
		this.fieldList = fieldList;
	}

	/**
	 * Gets the updatedAt value for this MObjectMetadata.
	 * 
	 * @return updatedAt
	 */
	public java.util.Calendar getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Sets the updatedAt value for this MObjectMetadata.
	 * 
	 * @param updatedAt
	 */
	public void setUpdatedAt(java.util.Calendar updatedAt) {
		this.updatedAt = updatedAt;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MObjectMetadata))
			return false;
		MObjectMetadata other = (MObjectMetadata) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.description == null && other.getDescription() == null) || (this.description != null && this.description
						.equals(other.getDescription())))
				&& this.isCustom == other.isIsCustom()
				&& this.isVirtual == other.isIsVirtual()
				&& ((this.fieldList == null && other.getFieldList() == null) || (this.fieldList != null && java.util.Arrays
						.equals(this.fieldList, other.getFieldList())))
				&& ((this.updatedAt == null && other.getUpdatedAt() == null) || (this.updatedAt != null && this.updatedAt
						.equals(other.getUpdatedAt())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
		}
		_hashCode += (isIsCustom() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isIsVirtual() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getFieldList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getFieldList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getFieldList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getUpdatedAt() != null) {
			_hashCode += getUpdatedAt().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			MObjectMetadata.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObjectMetadata"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("isCustom");
		elemField.setXmlName(new javax.xml.namespace.QName("", "isCustom"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("isVirtual");
		elemField.setXmlName(new javax.xml.namespace.QName("", "isVirtual"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fieldList");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fieldList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObjFieldMetadata"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "field"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("updatedAt");
		elemField.setXmlName(new javax.xml.namespace.QName("", "updatedAt"));
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
