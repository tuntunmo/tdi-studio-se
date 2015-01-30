/**
 * ParamsGetMultipleLeads.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsGetMultipleLeads implements java.io.Serializable {
	private com.marketo.www.mktows.LeadSelector leadSelector;

	private java.util.Calendar lastUpdatedAt;

	private java.lang.String streamPosition;

	private java.lang.Integer batchSize;

	private java.lang.String[] includeAttributes;

	public ParamsGetMultipleLeads() {
	}

	public ParamsGetMultipleLeads(com.marketo.www.mktows.LeadSelector leadSelector,
			java.util.Calendar lastUpdatedAt, java.lang.String streamPosition,
			java.lang.Integer batchSize, java.lang.String[] includeAttributes) {
		this.leadSelector = leadSelector;
		this.lastUpdatedAt = lastUpdatedAt;
		this.streamPosition = streamPosition;
		this.batchSize = batchSize;
		this.includeAttributes = includeAttributes;
	}

	/**
	 * Gets the leadSelector value for this ParamsGetMultipleLeads.
	 * 
	 * @return leadSelector
	 */
	public com.marketo.www.mktows.LeadSelector getLeadSelector() {
		return leadSelector;
	}

	/**
	 * Sets the leadSelector value for this ParamsGetMultipleLeads.
	 * 
	 * @param leadSelector
	 */
	public void setLeadSelector(com.marketo.www.mktows.LeadSelector leadSelector) {
		this.leadSelector = leadSelector;
	}

	/**
	 * Gets the lastUpdatedAt value for this ParamsGetMultipleLeads.
	 * 
	 * @return lastUpdatedAt
	 */
	public java.util.Calendar getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	/**
	 * Sets the lastUpdatedAt value for this ParamsGetMultipleLeads.
	 * 
	 * @param lastUpdatedAt
	 */
	public void setLastUpdatedAt(java.util.Calendar lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	/**
	 * Gets the streamPosition value for this ParamsGetMultipleLeads.
	 * 
	 * @return streamPosition
	 */
	public java.lang.String getStreamPosition() {
		return streamPosition;
	}

	/**
	 * Sets the streamPosition value for this ParamsGetMultipleLeads.
	 * 
	 * @param streamPosition
	 */
	public void setStreamPosition(java.lang.String streamPosition) {
		this.streamPosition = streamPosition;
	}

	/**
	 * Gets the batchSize value for this ParamsGetMultipleLeads.
	 * 
	 * @return batchSize
	 */
	public java.lang.Integer getBatchSize() {
		return batchSize;
	}

	/**
	 * Sets the batchSize value for this ParamsGetMultipleLeads.
	 * 
	 * @param batchSize
	 */
	public void setBatchSize(java.lang.Integer batchSize) {
		this.batchSize = batchSize;
	}

	/**
	 * Gets the includeAttributes value for this ParamsGetMultipleLeads.
	 * 
	 * @return includeAttributes
	 */
	public java.lang.String[] getIncludeAttributes() {
		return includeAttributes;
	}

	/**
	 * Sets the includeAttributes value for this ParamsGetMultipleLeads.
	 * 
	 * @param includeAttributes
	 */
	public void setIncludeAttributes(java.lang.String[] includeAttributes) {
		this.includeAttributes = includeAttributes;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsGetMultipleLeads))
			return false;
		ParamsGetMultipleLeads other = (ParamsGetMultipleLeads) obj;
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
				&& ((this.leadSelector == null && other.getLeadSelector() == null) || (this.leadSelector != null && this.leadSelector
						.equals(other.getLeadSelector())))
				&& ((this.lastUpdatedAt == null && other.getLastUpdatedAt() == null) || (this.lastUpdatedAt != null && this.lastUpdatedAt
						.equals(other.getLastUpdatedAt())))
				&& ((this.streamPosition == null && other.getStreamPosition() == null) || (this.streamPosition != null && this.streamPosition
						.equals(other.getStreamPosition())))
				&& ((this.batchSize == null && other.getBatchSize() == null) || (this.batchSize != null && this.batchSize
						.equals(other.getBatchSize())))
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
		if (getLeadSelector() != null) {
			_hashCode += getLeadSelector().hashCode();
		}
		if (getLastUpdatedAt() != null) {
			_hashCode += getLastUpdatedAt().hashCode();
		}
		if (getStreamPosition() != null) {
			_hashCode += getStreamPosition().hashCode();
		}
		if (getBatchSize() != null) {
			_hashCode += getBatchSize().hashCode();
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
			ParamsGetMultipleLeads.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsGetMultipleLeads"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leadSelector");
		elemField.setXmlName(new javax.xml.namespace.QName("", "leadSelector"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadSelector"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lastUpdatedAt");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "lastUpdatedAt"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
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
		elemField.setFieldName("includeAttributes");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"includeAttributes"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
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
