/**
 * ParamsGetMObjects.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsGetMObjects implements java.io.Serializable {
	private java.lang.String type;

	private java.lang.Integer id;

	private com.marketo.www.mktows.Attrib externalKey;

	private com.marketo.www.mktows.MObjCriteria[] mObjCriteriaList;

	private com.marketo.www.mktows.MObjAssociation[] mObjAssociationList;

	private java.lang.Boolean includeDetails;

	private java.lang.String streamPosition;

	public ParamsGetMObjects() {
	}

	public ParamsGetMObjects(java.lang.String type, java.lang.Integer id,
			com.marketo.www.mktows.Attrib externalKey,
			com.marketo.www.mktows.MObjCriteria[] mObjCriteriaList,
			com.marketo.www.mktows.MObjAssociation[] mObjAssociationList,
			java.lang.Boolean includeDetails, java.lang.String streamPosition) {
		this.type = type;
		this.id = id;
		this.externalKey = externalKey;
		this.mObjCriteriaList = mObjCriteriaList;
		this.mObjAssociationList = mObjAssociationList;
		this.includeDetails = includeDetails;
		this.streamPosition = streamPosition;
	}

	/**
	 * Gets the type value for this ParamsGetMObjects.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this ParamsGetMObjects.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the id value for this ParamsGetMObjects.
	 * 
	 * @return id
	 */
	public java.lang.Integer getId() {
		return id;
	}

	/**
	 * Sets the id value for this ParamsGetMObjects.
	 * 
	 * @param id
	 */
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	/**
	 * Gets the externalKey value for this ParamsGetMObjects.
	 * 
	 * @return externalKey
	 */
	public com.marketo.www.mktows.Attrib getExternalKey() {
		return externalKey;
	}

	/**
	 * Sets the externalKey value for this ParamsGetMObjects.
	 * 
	 * @param externalKey
	 */
	public void setExternalKey(com.marketo.www.mktows.Attrib externalKey) {
		this.externalKey = externalKey;
	}

	/**
	 * Gets the mObjCriteriaList value for this ParamsGetMObjects.
	 * 
	 * @return mObjCriteriaList
	 */
	public com.marketo.www.mktows.MObjCriteria[] getMObjCriteriaList() {
		return mObjCriteriaList;
	}

	/**
	 * Sets the mObjCriteriaList value for this ParamsGetMObjects.
	 * 
	 * @param mObjCriteriaList
	 */
	public void setMObjCriteriaList(
			com.marketo.www.mktows.MObjCriteria[] mObjCriteriaList) {
		this.mObjCriteriaList = mObjCriteriaList;
	}

	/**
	 * Gets the mObjAssociationList value for this ParamsGetMObjects.
	 * 
	 * @return mObjAssociationList
	 */
	public com.marketo.www.mktows.MObjAssociation[] getMObjAssociationList() {
		return mObjAssociationList;
	}

	/**
	 * Sets the mObjAssociationList value for this ParamsGetMObjects.
	 * 
	 * @param mObjAssociationList
	 */
	public void setMObjAssociationList(
			com.marketo.www.mktows.MObjAssociation[] mObjAssociationList) {
		this.mObjAssociationList = mObjAssociationList;
	}

	/**
	 * Gets the includeDetails value for this ParamsGetMObjects.
	 * 
	 * @return includeDetails
	 */
	public java.lang.Boolean getIncludeDetails() {
		return includeDetails;
	}

	/**
	 * Sets the includeDetails value for this ParamsGetMObjects.
	 * 
	 * @param includeDetails
	 */
	public void setIncludeDetails(java.lang.Boolean includeDetails) {
		this.includeDetails = includeDetails;
	}

	/**
	 * Gets the streamPosition value for this ParamsGetMObjects.
	 * 
	 * @return streamPosition
	 */
	public java.lang.String getStreamPosition() {
		return streamPosition;
	}

	/**
	 * Sets the streamPosition value for this ParamsGetMObjects.
	 * 
	 * @param streamPosition
	 */
	public void setStreamPosition(java.lang.String streamPosition) {
		this.streamPosition = streamPosition;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsGetMObjects))
			return false;
		ParamsGetMObjects other = (ParamsGetMObjects) obj;
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
				&& ((this.mObjCriteriaList == null && other
						.getMObjCriteriaList() == null) || (this.mObjCriteriaList != null && java.util.Arrays
						.equals(this.mObjCriteriaList,
								other.getMObjCriteriaList())))
				&& ((this.mObjAssociationList == null && other
						.getMObjAssociationList() == null) || (this.mObjAssociationList != null && java.util.Arrays
						.equals(this.mObjAssociationList,
								other.getMObjAssociationList())))
				&& ((this.includeDetails == null && other.getIncludeDetails() == null) || (this.includeDetails != null && this.includeDetails
						.equals(other.getIncludeDetails())))
				&& ((this.streamPosition == null && other.getStreamPosition() == null) || (this.streamPosition != null && this.streamPosition
						.equals(other.getStreamPosition())));
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
		if (getMObjCriteriaList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getMObjCriteriaList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getMObjCriteriaList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getMObjAssociationList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getMObjAssociationList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getMObjAssociationList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getIncludeDetails() != null) {
			_hashCode += getIncludeDetails().hashCode();
		}
		if (getStreamPosition() != null) {
			_hashCode += getStreamPosition().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParamsGetMObjects.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsGetMObjects"));
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
		elemField.setFieldName("MObjCriteriaList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"mObjCriteriaList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObjCriteria"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField
				.setItemQName(new javax.xml.namespace.QName("", "mObjCriteria"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("MObjAssociationList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"mObjAssociationList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObjAssociation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("",
				"mObjAssociation"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("includeDetails");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "includeDetails"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("streamPosition");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "streamPosition"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
