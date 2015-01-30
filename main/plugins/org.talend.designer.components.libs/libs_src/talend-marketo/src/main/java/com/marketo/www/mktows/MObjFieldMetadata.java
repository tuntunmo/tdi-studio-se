/**
 * MObjFieldMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class MObjFieldMetadata implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String description;

	private java.lang.String displayName;

	private java.lang.String sourceObject;

	private java.lang.String dataType;

	private java.lang.Integer size;

	private boolean isReadonly;

	private boolean isUpdateBlocked;

	private java.lang.Boolean isName;

	private boolean isPrimaryKey;

	private boolean isCustom;

	private boolean isDynamic;

	private java.lang.String dynamicFieldRef;

	private java.util.Calendar updatedAt;

	public MObjFieldMetadata() {
	}

	public MObjFieldMetadata(java.lang.String name,
			java.lang.String description, java.lang.String displayName,
			java.lang.String sourceObject, java.lang.String dataType,
			java.lang.Integer size, boolean isReadonly,
			boolean isUpdateBlocked, java.lang.Boolean isName,
			boolean isPrimaryKey, boolean isCustom, boolean isDynamic,
			java.lang.String dynamicFieldRef, java.util.Calendar updatedAt) {
		this.name = name;
		this.description = description;
		this.displayName = displayName;
		this.sourceObject = sourceObject;
		this.dataType = dataType;
		this.size = size;
		this.isReadonly = isReadonly;
		this.isUpdateBlocked = isUpdateBlocked;
		this.isName = isName;
		this.isPrimaryKey = isPrimaryKey;
		this.isCustom = isCustom;
		this.isDynamic = isDynamic;
		this.dynamicFieldRef = dynamicFieldRef;
		this.updatedAt = updatedAt;
	}

	/**
	 * Gets the name value for this MObjFieldMetadata.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this MObjFieldMetadata.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the description value for this MObjFieldMetadata.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this MObjFieldMetadata.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * Gets the displayName value for this MObjFieldMetadata.
	 * 
	 * @return displayName
	 */
	public java.lang.String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the displayName value for this MObjFieldMetadata.
	 * 
	 * @param displayName
	 */
	public void setDisplayName(java.lang.String displayName) {
		this.displayName = displayName;
	}

	/**
	 * Gets the sourceObject value for this MObjFieldMetadata.
	 * 
	 * @return sourceObject
	 */
	public java.lang.String getSourceObject() {
		return sourceObject;
	}

	/**
	 * Sets the sourceObject value for this MObjFieldMetadata.
	 * 
	 * @param sourceObject
	 */
	public void setSourceObject(java.lang.String sourceObject) {
		this.sourceObject = sourceObject;
	}

	/**
	 * Gets the dataType value for this MObjFieldMetadata.
	 * 
	 * @return dataType
	 */
	public java.lang.String getDataType() {
		return dataType;
	}

	/**
	 * Sets the dataType value for this MObjFieldMetadata.
	 * 
	 * @param dataType
	 */
	public void setDataType(java.lang.String dataType) {
		this.dataType = dataType;
	}

	/**
	 * Gets the size value for this MObjFieldMetadata.
	 * 
	 * @return size
	 */
	public java.lang.Integer getSize() {
		return size;
	}

	/**
	 * Sets the size value for this MObjFieldMetadata.
	 * 
	 * @param size
	 */
	public void setSize(java.lang.Integer size) {
		this.size = size;
	}

	/**
	 * Gets the isReadonly value for this MObjFieldMetadata.
	 * 
	 * @return isReadonly
	 */
	public boolean isIsReadonly() {
		return isReadonly;
	}

	/**
	 * Sets the isReadonly value for this MObjFieldMetadata.
	 * 
	 * @param isReadonly
	 */
	public void setIsReadonly(boolean isReadonly) {
		this.isReadonly = isReadonly;
	}

	/**
	 * Gets the isUpdateBlocked value for this MObjFieldMetadata.
	 * 
	 * @return isUpdateBlocked
	 */
	public boolean isIsUpdateBlocked() {
		return isUpdateBlocked;
	}

	/**
	 * Sets the isUpdateBlocked value for this MObjFieldMetadata.
	 * 
	 * @param isUpdateBlocked
	 */
	public void setIsUpdateBlocked(boolean isUpdateBlocked) {
		this.isUpdateBlocked = isUpdateBlocked;
	}

	/**
	 * Gets the isName value for this MObjFieldMetadata.
	 * 
	 * @return isName
	 */
	public java.lang.Boolean getIsName() {
		return isName;
	}

	/**
	 * Sets the isName value for this MObjFieldMetadata.
	 * 
	 * @param isName
	 */
	public void setIsName(java.lang.Boolean isName) {
		this.isName = isName;
	}

	/**
	 * Gets the isPrimaryKey value for this MObjFieldMetadata.
	 * 
	 * @return isPrimaryKey
	 */
	public boolean isIsPrimaryKey() {
		return isPrimaryKey;
	}

	/**
	 * Sets the isPrimaryKey value for this MObjFieldMetadata.
	 * 
	 * @param isPrimaryKey
	 */
	public void setIsPrimaryKey(boolean isPrimaryKey) {
		this.isPrimaryKey = isPrimaryKey;
	}

	/**
	 * Gets the isCustom value for this MObjFieldMetadata.
	 * 
	 * @return isCustom
	 */
	public boolean isIsCustom() {
		return isCustom;
	}

	/**
	 * Sets the isCustom value for this MObjFieldMetadata.
	 * 
	 * @param isCustom
	 */
	public void setIsCustom(boolean isCustom) {
		this.isCustom = isCustom;
	}

	/**
	 * Gets the isDynamic value for this MObjFieldMetadata.
	 * 
	 * @return isDynamic
	 */
	public boolean isIsDynamic() {
		return isDynamic;
	}

	/**
	 * Sets the isDynamic value for this MObjFieldMetadata.
	 * 
	 * @param isDynamic
	 */
	public void setIsDynamic(boolean isDynamic) {
		this.isDynamic = isDynamic;
	}

	/**
	 * Gets the dynamicFieldRef value for this MObjFieldMetadata.
	 * 
	 * @return dynamicFieldRef
	 */
	public java.lang.String getDynamicFieldRef() {
		return dynamicFieldRef;
	}

	/**
	 * Sets the dynamicFieldRef value for this MObjFieldMetadata.
	 * 
	 * @param dynamicFieldRef
	 */
	public void setDynamicFieldRef(java.lang.String dynamicFieldRef) {
		this.dynamicFieldRef = dynamicFieldRef;
	}

	/**
	 * Gets the updatedAt value for this MObjFieldMetadata.
	 * 
	 * @return updatedAt
	 */
	public java.util.Calendar getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Sets the updatedAt value for this MObjFieldMetadata.
	 * 
	 * @param updatedAt
	 */
	public void setUpdatedAt(java.util.Calendar updatedAt) {
		this.updatedAt = updatedAt;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MObjFieldMetadata))
			return false;
		MObjFieldMetadata other = (MObjFieldMetadata) obj;
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
				&& ((this.displayName == null && other.getDisplayName() == null) || (this.displayName != null && this.displayName
						.equals(other.getDisplayName())))
				&& ((this.sourceObject == null && other.getSourceObject() == null) || (this.sourceObject != null && this.sourceObject
						.equals(other.getSourceObject())))
				&& ((this.dataType == null && other.getDataType() == null) || (this.dataType != null && this.dataType
						.equals(other.getDataType())))
				&& ((this.size == null && other.getSize() == null) || (this.size != null && this.size
						.equals(other.getSize())))
				&& this.isReadonly == other.isIsReadonly()
				&& this.isUpdateBlocked == other.isIsUpdateBlocked()
				&& ((this.isName == null && other.getIsName() == null) || (this.isName != null && this.isName
						.equals(other.getIsName())))
				&& this.isPrimaryKey == other.isIsPrimaryKey()
				&& this.isCustom == other.isIsCustom()
				&& this.isDynamic == other.isIsDynamic()
				&& ((this.dynamicFieldRef == null && other.getDynamicFieldRef() == null) || (this.dynamicFieldRef != null && this.dynamicFieldRef
						.equals(other.getDynamicFieldRef())))
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
		if (getDisplayName() != null) {
			_hashCode += getDisplayName().hashCode();
		}
		if (getSourceObject() != null) {
			_hashCode += getSourceObject().hashCode();
		}
		if (getDataType() != null) {
			_hashCode += getDataType().hashCode();
		}
		if (getSize() != null) {
			_hashCode += getSize().hashCode();
		}
		_hashCode += (isIsReadonly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isIsUpdateBlocked() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getIsName() != null) {
			_hashCode += getIsName().hashCode();
		}
		_hashCode += (isIsPrimaryKey() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isIsCustom() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isIsDynamic() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getDynamicFieldRef() != null) {
			_hashCode += getDynamicFieldRef().hashCode();
		}
		if (getUpdatedAt() != null) {
			_hashCode += getUpdatedAt().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			MObjFieldMetadata.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObjFieldMetadata"));
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
		elemField.setFieldName("displayName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "displayName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceObject");
		elemField.setXmlName(new javax.xml.namespace.QName("", "sourceObject"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dataType");
		elemField.setXmlName(new javax.xml.namespace.QName("", "dataType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("size");
		elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("isReadonly");
		elemField.setXmlName(new javax.xml.namespace.QName("", "isReadonly"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("isUpdateBlocked");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"isUpdateBlocked"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("isName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "isName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("isPrimaryKey");
		elemField.setXmlName(new javax.xml.namespace.QName("", "isPrimaryKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("isCustom");
		elemField.setXmlName(new javax.xml.namespace.QName("", "isCustom"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("isDynamic");
		elemField.setXmlName(new javax.xml.namespace.QName("", "isDynamic"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dynamicFieldRef");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"dynamicFieldRef"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
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
