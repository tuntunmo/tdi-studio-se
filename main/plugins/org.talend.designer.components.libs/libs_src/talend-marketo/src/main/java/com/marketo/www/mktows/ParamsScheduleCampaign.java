/**
 * ParamsScheduleCampaign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsScheduleCampaign implements java.io.Serializable {
	private java.lang.String programName;

	private java.lang.String campaignName;

	private java.util.Calendar campaignRunAt;

	private com.marketo.www.mktows.Attrib[] programTokenList;

	public ParamsScheduleCampaign() {
	}

	public ParamsScheduleCampaign(java.lang.String programName,
			java.lang.String campaignName, java.util.Calendar campaignRunAt,
			com.marketo.www.mktows.Attrib[] programTokenList) {
		this.programName = programName;
		this.campaignName = campaignName;
		this.campaignRunAt = campaignRunAt;
		this.programTokenList = programTokenList;
	}

	/**
	 * Gets the programName value for this ParamsScheduleCampaign.
	 * 
	 * @return programName
	 */
	public java.lang.String getProgramName() {
		return programName;
	}

	/**
	 * Sets the programName value for this ParamsScheduleCampaign.
	 * 
	 * @param programName
	 */
	public void setProgramName(java.lang.String programName) {
		this.programName = programName;
	}

	/**
	 * Gets the campaignName value for this ParamsScheduleCampaign.
	 * 
	 * @return campaignName
	 */
	public java.lang.String getCampaignName() {
		return campaignName;
	}

	/**
	 * Sets the campaignName value for this ParamsScheduleCampaign.
	 * 
	 * @param campaignName
	 */
	public void setCampaignName(java.lang.String campaignName) {
		this.campaignName = campaignName;
	}

	/**
	 * Gets the campaignRunAt value for this ParamsScheduleCampaign.
	 * 
	 * @return campaignRunAt
	 */
	public java.util.Calendar getCampaignRunAt() {
		return campaignRunAt;
	}

	/**
	 * Sets the campaignRunAt value for this ParamsScheduleCampaign.
	 * 
	 * @param campaignRunAt
	 */
	public void setCampaignRunAt(java.util.Calendar campaignRunAt) {
		this.campaignRunAt = campaignRunAt;
	}

	/**
	 * Gets the programTokenList value for this ParamsScheduleCampaign.
	 * 
	 * @return programTokenList
	 */
	public com.marketo.www.mktows.Attrib[] getProgramTokenList() {
		return programTokenList;
	}

	/**
	 * Sets the programTokenList value for this ParamsScheduleCampaign.
	 * 
	 * @param programTokenList
	 */
	public void setProgramTokenList(com.marketo.www.mktows.Attrib[] programTokenList) {
		this.programTokenList = programTokenList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsScheduleCampaign))
			return false;
		ParamsScheduleCampaign other = (ParamsScheduleCampaign) obj;
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
				&& ((this.programName == null && other.getProgramName() == null) || (this.programName != null && this.programName
						.equals(other.getProgramName())))
				&& ((this.campaignName == null && other.getCampaignName() == null) || (this.campaignName != null && this.campaignName
						.equals(other.getCampaignName())))
				&& ((this.campaignRunAt == null && other.getCampaignRunAt() == null) || (this.campaignRunAt != null && this.campaignRunAt
						.equals(other.getCampaignRunAt())))
				&& ((this.programTokenList == null && other
						.getProgramTokenList() == null) || (this.programTokenList != null && java.util.Arrays
						.equals(this.programTokenList,
								other.getProgramTokenList())));
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
		if (getProgramName() != null) {
			_hashCode += getProgramName().hashCode();
		}
		if (getCampaignName() != null) {
			_hashCode += getCampaignName().hashCode();
		}
		if (getCampaignRunAt() != null) {
			_hashCode += getCampaignRunAt().hashCode();
		}
		if (getProgramTokenList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getProgramTokenList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getProgramTokenList(), i);
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
			ParamsScheduleCampaign.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsScheduleCampaign"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("programName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "programName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("campaignName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "campaignName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("campaignRunAt");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "campaignRunAt"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("programTokenList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"programTokenList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "Attrib"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new javax.xml.namespace.QName("", "attrib"));
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
