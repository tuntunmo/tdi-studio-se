/**
 * ActivityRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ActivityRecord implements java.io.Serializable {
	private long id;

	private java.util.Calendar activityDateTime;

	private java.lang.String activityType;

	private java.lang.String mktgAssetName;

	private com.marketo.www.mktows.Attribute[] activityAttributes;

	private java.lang.String campaign;

	private java.lang.String personName;

	private java.lang.String mktPersonId;

	private java.lang.String foreignSysId;

	private java.lang.String orgName;

	private java.lang.String foreignSysOrgId;

	public ActivityRecord() {
	}

	public ActivityRecord(long id, java.util.Calendar activityDateTime,
			java.lang.String activityType, java.lang.String mktgAssetName,
			com.marketo.www.mktows.Attribute[] activityAttributes,
			java.lang.String campaign, java.lang.String personName,
			java.lang.String mktPersonId, java.lang.String foreignSysId,
			java.lang.String orgName, java.lang.String foreignSysOrgId) {
		this.id = id;
		this.activityDateTime = activityDateTime;
		this.activityType = activityType;
		this.mktgAssetName = mktgAssetName;
		this.activityAttributes = activityAttributes;
		this.campaign = campaign;
		this.personName = personName;
		this.mktPersonId = mktPersonId;
		this.foreignSysId = foreignSysId;
		this.orgName = orgName;
		this.foreignSysOrgId = foreignSysOrgId;
	}

	/**
	 * Gets the id value for this ActivityRecord.
	 * 
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id value for this ActivityRecord.
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the activityDateTime value for this ActivityRecord.
	 * 
	 * @return activityDateTime
	 */
	public java.util.Calendar getActivityDateTime() {
		return activityDateTime;
	}

	/**
	 * Sets the activityDateTime value for this ActivityRecord.
	 * 
	 * @param activityDateTime
	 */
	public void setActivityDateTime(java.util.Calendar activityDateTime) {
		this.activityDateTime = activityDateTime;
	}

	/**
	 * Gets the activityType value for this ActivityRecord.
	 * 
	 * @return activityType
	 */
	public java.lang.String getActivityType() {
		return activityType;
	}

	/**
	 * Sets the activityType value for this ActivityRecord.
	 * 
	 * @param activityType
	 */
	public void setActivityType(java.lang.String activityType) {
		this.activityType = activityType;
	}

	/**
	 * Gets the mktgAssetName value for this ActivityRecord.
	 * 
	 * @return mktgAssetName
	 */
	public java.lang.String getMktgAssetName() {
		return mktgAssetName;
	}

	/**
	 * Sets the mktgAssetName value for this ActivityRecord.
	 * 
	 * @param mktgAssetName
	 */
	public void setMktgAssetName(java.lang.String mktgAssetName) {
		this.mktgAssetName = mktgAssetName;
	}

	/**
	 * Gets the activityAttributes value for this ActivityRecord.
	 * 
	 * @return activityAttributes
	 */
	public com.marketo.www.mktows.Attribute[] getActivityAttributes() {
		return activityAttributes;
	}

	/**
	 * Sets the activityAttributes value for this ActivityRecord.
	 * 
	 * @param activityAttributes
	 */
	public void setActivityAttributes(
			com.marketo.www.mktows.Attribute[] activityAttributes) {
		this.activityAttributes = activityAttributes;
	}

	/**
	 * Gets the campaign value for this ActivityRecord.
	 * 
	 * @return campaign
	 */
	public java.lang.String getCampaign() {
		return campaign;
	}

	/**
	 * Sets the campaign value for this ActivityRecord.
	 * 
	 * @param campaign
	 */
	public void setCampaign(java.lang.String campaign) {
		this.campaign = campaign;
	}

	/**
	 * Gets the personName value for this ActivityRecord.
	 * 
	 * @return personName
	 */
	public java.lang.String getPersonName() {
		return personName;
	}

	/**
	 * Sets the personName value for this ActivityRecord.
	 * 
	 * @param personName
	 */
	public void setPersonName(java.lang.String personName) {
		this.personName = personName;
	}

	/**
	 * Gets the mktPersonId value for this ActivityRecord.
	 * 
	 * @return mktPersonId
	 */
	public java.lang.String getMktPersonId() {
		return mktPersonId;
	}

	/**
	 * Sets the mktPersonId value for this ActivityRecord.
	 * 
	 * @param mktPersonId
	 */
	public void setMktPersonId(java.lang.String mktPersonId) {
		this.mktPersonId = mktPersonId;
	}

	/**
	 * Gets the foreignSysId value for this ActivityRecord.
	 * 
	 * @return foreignSysId
	 */
	public java.lang.String getForeignSysId() {
		return foreignSysId;
	}

	/**
	 * Sets the foreignSysId value for this ActivityRecord.
	 * 
	 * @param foreignSysId
	 */
	public void setForeignSysId(java.lang.String foreignSysId) {
		this.foreignSysId = foreignSysId;
	}

	/**
	 * Gets the orgName value for this ActivityRecord.
	 * 
	 * @return orgName
	 */
	public java.lang.String getOrgName() {
		return orgName;
	}

	/**
	 * Sets the orgName value for this ActivityRecord.
	 * 
	 * @param orgName
	 */
	public void setOrgName(java.lang.String orgName) {
		this.orgName = orgName;
	}

	/**
	 * Gets the foreignSysOrgId value for this ActivityRecord.
	 * 
	 * @return foreignSysOrgId
	 */
	public java.lang.String getForeignSysOrgId() {
		return foreignSysOrgId;
	}

	/**
	 * Sets the foreignSysOrgId value for this ActivityRecord.
	 * 
	 * @param foreignSysOrgId
	 */
	public void setForeignSysOrgId(java.lang.String foreignSysOrgId) {
		this.foreignSysOrgId = foreignSysOrgId;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ActivityRecord))
			return false;
		ActivityRecord other = (ActivityRecord) obj;
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
				&& this.id == other.getId()
				&& ((this.activityDateTime == null && other
						.getActivityDateTime() == null) || (this.activityDateTime != null && this.activityDateTime
						.equals(other.getActivityDateTime())))
				&& ((this.activityType == null && other.getActivityType() == null) || (this.activityType != null && this.activityType
						.equals(other.getActivityType())))
				&& ((this.mktgAssetName == null && other.getMktgAssetName() == null) || (this.mktgAssetName != null && this.mktgAssetName
						.equals(other.getMktgAssetName())))
				&& ((this.activityAttributes == null && other
						.getActivityAttributes() == null) || (this.activityAttributes != null && java.util.Arrays
						.equals(this.activityAttributes,
								other.getActivityAttributes())))
				&& ((this.campaign == null && other.getCampaign() == null) || (this.campaign != null && this.campaign
						.equals(other.getCampaign())))
				&& ((this.personName == null && other.getPersonName() == null) || (this.personName != null && this.personName
						.equals(other.getPersonName())))
				&& ((this.mktPersonId == null && other.getMktPersonId() == null) || (this.mktPersonId != null && this.mktPersonId
						.equals(other.getMktPersonId())))
				&& ((this.foreignSysId == null && other.getForeignSysId() == null) || (this.foreignSysId != null && this.foreignSysId
						.equals(other.getForeignSysId())))
				&& ((this.orgName == null && other.getOrgName() == null) || (this.orgName != null && this.orgName
						.equals(other.getOrgName())))
				&& ((this.foreignSysOrgId == null && other.getForeignSysOrgId() == null) || (this.foreignSysOrgId != null && this.foreignSysOrgId
						.equals(other.getForeignSysOrgId())));
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
		_hashCode += new Long(getId()).hashCode();
		if (getActivityDateTime() != null) {
			_hashCode += getActivityDateTime().hashCode();
		}
		if (getActivityType() != null) {
			_hashCode += getActivityType().hashCode();
		}
		if (getMktgAssetName() != null) {
			_hashCode += getMktgAssetName().hashCode();
		}
		if (getActivityAttributes() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getActivityAttributes()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getActivityAttributes(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getCampaign() != null) {
			_hashCode += getCampaign().hashCode();
		}
		if (getPersonName() != null) {
			_hashCode += getPersonName().hashCode();
		}
		if (getMktPersonId() != null) {
			_hashCode += getMktPersonId().hashCode();
		}
		if (getForeignSysId() != null) {
			_hashCode += getForeignSysId().hashCode();
		}
		if (getOrgName() != null) {
			_hashCode += getOrgName().hashCode();
		}
		if (getForeignSysOrgId() != null) {
			_hashCode += getForeignSysOrgId().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ActivityRecord.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ActivityRecord"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("activityDateTime");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"activityDateTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("activityType");
		elemField.setXmlName(new javax.xml.namespace.QName("", "activityType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mktgAssetName");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "mktgAssetName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("activityAttributes");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"activityAttributes"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "Attribute"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("campaign");
		elemField.setXmlName(new javax.xml.namespace.QName("", "campaign"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("personName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "personName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mktPersonId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "mktPersonId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("foreignSysId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "foreignSysId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("orgName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "orgName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("foreignSysOrgId");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"foreignSysOrgId"));
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
