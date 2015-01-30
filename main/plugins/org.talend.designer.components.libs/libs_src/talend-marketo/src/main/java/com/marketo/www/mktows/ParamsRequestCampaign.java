/**
 * ParamsRequestCampaign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsRequestCampaign implements java.io.Serializable {
	private com.marketo.www.mktows.ReqCampSourceType source;

	private java.lang.Integer campaignId;

	private com.marketo.www.mktows.LeadKey[] leadList;

	private java.lang.String programName;

	private java.lang.String campaignName;

	private com.marketo.www.mktows.Attrib[] programTokenList;

	public ParamsRequestCampaign() {
	}

	public ParamsRequestCampaign(com.marketo.www.mktows.ReqCampSourceType source,
			java.lang.Integer campaignId,
			com.marketo.www.mktows.LeadKey[] leadList,
			java.lang.String programName, java.lang.String campaignName,
			com.marketo.www.mktows.Attrib[] programTokenList) {
		this.source = source;
		this.campaignId = campaignId;
		this.leadList = leadList;
		this.programName = programName;
		this.campaignName = campaignName;
		this.programTokenList = programTokenList;
	}

	/**
	 * Gets the source value for this ParamsRequestCampaign.
	 * 
	 * @return source
	 */
	public com.marketo.www.mktows.ReqCampSourceType getSource() {
		return source;
	}

	/**
	 * Sets the source value for this ParamsRequestCampaign.
	 * 
	 * @param source
	 */
	public void setSource(com.marketo.www.mktows.ReqCampSourceType source) {
		this.source = source;
	}

	/**
	 * Gets the campaignId value for this ParamsRequestCampaign.
	 * 
	 * @return campaignId
	 */
	public java.lang.Integer getCampaignId() {
		return campaignId;
	}

	/**
	 * Sets the campaignId value for this ParamsRequestCampaign.
	 * 
	 * @param campaignId
	 */
	public void setCampaignId(java.lang.Integer campaignId) {
		this.campaignId = campaignId;
	}

	/**
	 * Gets the leadList value for this ParamsRequestCampaign.
	 * 
	 * @return leadList
	 */
	public com.marketo.www.mktows.LeadKey[] getLeadList() {
		return leadList;
	}

	/**
	 * Sets the leadList value for this ParamsRequestCampaign.
	 * 
	 * @param leadList
	 */
	public void setLeadList(com.marketo.www.mktows.LeadKey[] leadList) {
		this.leadList = leadList;
	}

	/**
	 * Gets the programName value for this ParamsRequestCampaign.
	 * 
	 * @return programName
	 */
	public java.lang.String getProgramName() {
		return programName;
	}

	/**
	 * Sets the programName value for this ParamsRequestCampaign.
	 * 
	 * @param programName
	 */
	public void setProgramName(java.lang.String programName) {
		this.programName = programName;
	}

	/**
	 * Gets the campaignName value for this ParamsRequestCampaign.
	 * 
	 * @return campaignName
	 */
	public java.lang.String getCampaignName() {
		return campaignName;
	}

	/**
	 * Sets the campaignName value for this ParamsRequestCampaign.
	 * 
	 * @param campaignName
	 */
	public void setCampaignName(java.lang.String campaignName) {
		this.campaignName = campaignName;
	}

	/**
	 * Gets the programTokenList value for this ParamsRequestCampaign.
	 * 
	 * @return programTokenList
	 */
	public com.marketo.www.mktows.Attrib[] getProgramTokenList() {
		return programTokenList;
	}

	/**
	 * Sets the programTokenList value for this ParamsRequestCampaign.
	 * 
	 * @param programTokenList
	 */
	public void setProgramTokenList(com.marketo.www.mktows.Attrib[] programTokenList) {
		this.programTokenList = programTokenList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsRequestCampaign))
			return false;
		ParamsRequestCampaign other = (ParamsRequestCampaign) obj;
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
				&& ((this.source == null && other.getSource() == null) || (this.source != null && this.source
						.equals(other.getSource())))
				&& ((this.campaignId == null && other.getCampaignId() == null) || (this.campaignId != null && this.campaignId
						.equals(other.getCampaignId())))
				&& ((this.leadList == null && other.getLeadList() == null) || (this.leadList != null && java.util.Arrays
						.equals(this.leadList, other.getLeadList())))
				&& ((this.programName == null && other.getProgramName() == null) || (this.programName != null && this.programName
						.equals(other.getProgramName())))
				&& ((this.campaignName == null && other.getCampaignName() == null) || (this.campaignName != null && this.campaignName
						.equals(other.getCampaignName())))
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
		if (getSource() != null) {
			_hashCode += getSource().hashCode();
		}
		if (getCampaignId() != null) {
			_hashCode += getCampaignId().hashCode();
		}
		if (getLeadList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getLeadList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLeadList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getProgramName() != null) {
			_hashCode += getProgramName().hashCode();
		}
		if (getCampaignName() != null) {
			_hashCode += getCampaignName().hashCode();
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
			ParamsRequestCampaign.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsRequestCampaign"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("source");
		elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ReqCampSourceType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("campaignId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "campaignId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leadList");
		elemField.setXmlName(new javax.xml.namespace.QName("", "leadList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadKey"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new javax.xml.namespace.QName("", "leadKey"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("programName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "programName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("campaignName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "campaignName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
