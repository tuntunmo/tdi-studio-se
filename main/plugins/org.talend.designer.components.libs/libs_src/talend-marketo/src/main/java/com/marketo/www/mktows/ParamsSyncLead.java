/**
 * ParamsSyncLead.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsSyncLead implements java.io.Serializable {
	private com.marketo.www.mktows.LeadRecord leadRecord;

	private boolean returnLead;

	private java.lang.String marketoCookie;

	public ParamsSyncLead() {
	}

	public ParamsSyncLead(com.marketo.www.mktows.LeadRecord leadRecord,
			boolean returnLead, java.lang.String marketoCookie) {
		this.leadRecord = leadRecord;
		this.returnLead = returnLead;
		this.marketoCookie = marketoCookie;
	}

	/**
	 * Gets the leadRecord value for this ParamsSyncLead.
	 * 
	 * @return leadRecord
	 */
	public com.marketo.www.mktows.LeadRecord getLeadRecord() {
		return leadRecord;
	}

	/**
	 * Sets the leadRecord value for this ParamsSyncLead.
	 * 
	 * @param leadRecord
	 */
	public void setLeadRecord(com.marketo.www.mktows.LeadRecord leadRecord) {
		this.leadRecord = leadRecord;
	}

	/**
	 * Gets the returnLead value for this ParamsSyncLead.
	 * 
	 * @return returnLead
	 */
	public boolean isReturnLead() {
		return returnLead;
	}

	/**
	 * Sets the returnLead value for this ParamsSyncLead.
	 * 
	 * @param returnLead
	 */
	public void setReturnLead(boolean returnLead) {
		this.returnLead = returnLead;
	}

	/**
	 * Gets the marketoCookie value for this ParamsSyncLead.
	 * 
	 * @return marketoCookie
	 */
	public java.lang.String getMarketoCookie() {
		return marketoCookie;
	}

	/**
	 * Sets the marketoCookie value for this ParamsSyncLead.
	 * 
	 * @param marketoCookie
	 */
	public void setMarketoCookie(java.lang.String marketoCookie) {
		this.marketoCookie = marketoCookie;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsSyncLead))
			return false;
		ParamsSyncLead other = (ParamsSyncLead) obj;
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
				&& ((this.leadRecord == null && other.getLeadRecord() == null) || (this.leadRecord != null && this.leadRecord
						.equals(other.getLeadRecord())))
				&& this.returnLead == other.isReturnLead()
				&& ((this.marketoCookie == null && other.getMarketoCookie() == null) || (this.marketoCookie != null && this.marketoCookie
						.equals(other.getMarketoCookie())));
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
		if (getLeadRecord() != null) {
			_hashCode += getLeadRecord().hashCode();
		}
		_hashCode += (isReturnLead() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getMarketoCookie() != null) {
			_hashCode += getMarketoCookie().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParamsSyncLead.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsSyncLead"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leadRecord");
		elemField.setXmlName(new javax.xml.namespace.QName("", "leadRecord"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadRecord"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("returnLead");
		elemField.setXmlName(new javax.xml.namespace.QName("", "returnLead"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("marketoCookie");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "marketoCookie"));
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
