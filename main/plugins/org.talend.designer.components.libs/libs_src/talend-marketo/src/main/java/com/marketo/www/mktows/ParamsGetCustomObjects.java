/**
 * ParamsGetCustomObjects.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsGetCustomObjects implements java.io.Serializable {
	private java.lang.String objTypeName;

	private java.lang.String streamPosition;

	private java.lang.Integer batchSize;

	private com.marketo.www.mktows.Attribute[] customObjKeyList;

	private java.lang.String[] includeAttributes;

	public ParamsGetCustomObjects() {
	}

	public ParamsGetCustomObjects(java.lang.String objTypeName,
			java.lang.String streamPosition, java.lang.Integer batchSize,
			com.marketo.www.mktows.Attribute[] customObjKeyList,
			java.lang.String[] includeAttributes) {
		this.objTypeName = objTypeName;
		this.streamPosition = streamPosition;
		this.batchSize = batchSize;
		this.customObjKeyList = customObjKeyList;
		this.includeAttributes = includeAttributes;
	}

	/**
	 * Gets the objTypeName value for this ParamsGetCustomObjects.
	 * 
	 * @return objTypeName
	 */
	public java.lang.String getObjTypeName() {
		return objTypeName;
	}

	/**
	 * Sets the objTypeName value for this ParamsGetCustomObjects.
	 * 
	 * @param objTypeName
	 */
	public void setObjTypeName(java.lang.String objTypeName) {
		this.objTypeName = objTypeName;
	}

	/**
	 * Gets the streamPosition value for this ParamsGetCustomObjects.
	 * 
	 * @return streamPosition
	 */
	public java.lang.String getStreamPosition() {
		return streamPosition;
	}

	/**
	 * Sets the streamPosition value for this ParamsGetCustomObjects.
	 * 
	 * @param streamPosition
	 */
	public void setStreamPosition(java.lang.String streamPosition) {
		this.streamPosition = streamPosition;
	}

	/**
	 * Gets the batchSize value for this ParamsGetCustomObjects.
	 * 
	 * @return batchSize
	 */
	public java.lang.Integer getBatchSize() {
		return batchSize;
	}

	/**
	 * Sets the batchSize value for this ParamsGetCustomObjects.
	 * 
	 * @param batchSize
	 */
	public void setBatchSize(java.lang.Integer batchSize) {
		this.batchSize = batchSize;
	}

	/**
	 * Gets the customObjKeyList value for this ParamsGetCustomObjects.
	 * 
	 * @return customObjKeyList
	 */
	public com.marketo.www.mktows.Attribute[] getCustomObjKeyList() {
		return customObjKeyList;
	}

	/**
	 * Sets the customObjKeyList value for this ParamsGetCustomObjects.
	 * 
	 * @param customObjKeyList
	 */
	public void setCustomObjKeyList(
			com.marketo.www.mktows.Attribute[] customObjKeyList) {
		this.customObjKeyList = customObjKeyList;
	}

	/**
	 * Gets the includeAttributes value for this ParamsGetCustomObjects.
	 * 
	 * @return includeAttributes
	 */
	public java.lang.String[] getIncludeAttributes() {
		return includeAttributes;
	}

	/**
	 * Sets the includeAttributes value for this ParamsGetCustomObjects.
	 * 
	 * @param includeAttributes
	 */
	public void setIncludeAttributes(java.lang.String[] includeAttributes) {
		this.includeAttributes = includeAttributes;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsGetCustomObjects))
			return false;
		ParamsGetCustomObjects other = (ParamsGetCustomObjects) obj;
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
				&& ((this.objTypeName == null && other.getObjTypeName() == null) || (this.objTypeName != null && this.objTypeName
						.equals(other.getObjTypeName())))
				&& ((this.streamPosition == null && other.getStreamPosition() == null) || (this.streamPosition != null && this.streamPosition
						.equals(other.getStreamPosition())))
				&& ((this.batchSize == null && other.getBatchSize() == null) || (this.batchSize != null && this.batchSize
						.equals(other.getBatchSize())))
				&& ((this.customObjKeyList == null && other
						.getCustomObjKeyList() == null) || (this.customObjKeyList != null && java.util.Arrays
						.equals(this.customObjKeyList,
								other.getCustomObjKeyList())))
				&& ((this.includeAttributes == null && other
						.getIncludeAttributes() == null) || (this.includeAttributes != null && java.util.Arrays
						.equals(this.includeAttributes,
								other.getIncludeAttributes())));
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
		if (getObjTypeName() != null) {
			_hashCode += getObjTypeName().hashCode();
		}
		if (getStreamPosition() != null) {
			_hashCode += getStreamPosition().hashCode();
		}
		if (getBatchSize() != null) {
			_hashCode += getBatchSize().hashCode();
		}
		if (getCustomObjKeyList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCustomObjKeyList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCustomObjKeyList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getIncludeAttributes() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getIncludeAttributes()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getIncludeAttributes(), i);
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
			ParamsGetCustomObjects.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsGetCustomObjects"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("objTypeName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "objTypeName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("streamPosition");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "streamPosition"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("batchSize");
		elemField.setXmlName(new javax.xml.namespace.QName("", "batchSize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customObjKeyList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"customObjKeyList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "Attribute"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("includeAttributes");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"includeAttributes"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "stringItem"));
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
