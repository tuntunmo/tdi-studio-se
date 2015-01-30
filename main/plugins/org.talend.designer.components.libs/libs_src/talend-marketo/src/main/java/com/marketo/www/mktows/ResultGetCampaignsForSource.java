/**
 * ResultGetCampaignsForSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ResultGetCampaignsForSource implements java.io.Serializable {
	private int returnCount;

	private com.marketo.www.mktows.CampaignRecord[] campaignRecordList;

	public ResultGetCampaignsForSource() {
	}

	public ResultGetCampaignsForSource(int returnCount,
			com.marketo.www.mktows.CampaignRecord[] campaignRecordList) {
		this.returnCount = returnCount;
		this.campaignRecordList = campaignRecordList;
	}

	/**
	 * Gets the returnCount value for this ResultGetCampaignsForSource.
	 * 
	 * @return returnCount
	 */
	public int getReturnCount() {
		return returnCount;
	}

	/**
	 * Sets the returnCount value for this ResultGetCampaignsForSource.
	 * 
	 * @param returnCount
	 */
	public void setReturnCount(int returnCount) {
		this.returnCount = returnCount;
	}

	/**
	 * Gets the campaignRecordList value for this ResultGetCampaignsForSource.
	 * 
	 * @return campaignRecordList
	 */
	public com.marketo.www.mktows.CampaignRecord[] getCampaignRecordList() {
		return campaignRecordList;
	}

	/**
	 * Sets the campaignRecordList value for this ResultGetCampaignsForSource.
	 * 
	 * @param campaignRecordList
	 */
	public void setCampaignRecordList(
			com.marketo.www.mktows.CampaignRecord[] campaignRecordList) {
		this.campaignRecordList = campaignRecordList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResultGetCampaignsForSource))
			return false;
		ResultGetCampaignsForSource other = (ResultGetCampaignsForSource) obj;
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
				&& this.returnCount == other.getReturnCount()
				&& ((this.campaignRecordList == null && other
						.getCampaignRecordList() == null) || (this.campaignRecordList != null && java.util.Arrays
						.equals(this.campaignRecordList,
								other.getCampaignRecordList())));
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
		_hashCode += getReturnCount();
		if (getCampaignRecordList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCampaignRecordList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCampaignRecordList(), i);
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
			ResultGetCampaignsForSource.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ResultGetCampaignsForSource"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("returnCount");
		elemField.setXmlName(new javax.xml.namespace.QName("", "returnCount"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("campaignRecordList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"campaignRecordList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "CampaignRecord"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new javax.xml.namespace.QName("",
				"campaignRecord"));
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
