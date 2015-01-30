/**
 * ParamsGetLeadActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsGetLeadActivity implements java.io.Serializable {
	private com.marketo.www.mktows.LeadKey leadKey;

	private com.marketo.www.mktows.ActivityTypeFilter activityFilter;

	private com.marketo.www.mktows.StreamPosition startPosition;

	private java.lang.Integer batchSize;

	public ParamsGetLeadActivity() {
	}

	public ParamsGetLeadActivity(com.marketo.www.mktows.LeadKey leadKey,
			com.marketo.www.mktows.ActivityTypeFilter activityFilter,
			com.marketo.www.mktows.StreamPosition startPosition,
			java.lang.Integer batchSize) {
		this.leadKey = leadKey;
		this.activityFilter = activityFilter;
		this.startPosition = startPosition;
		this.batchSize = batchSize;
	}

	/**
	 * Gets the leadKey value for this ParamsGetLeadActivity.
	 * 
	 * @return leadKey
	 */
	public com.marketo.www.mktows.LeadKey getLeadKey() {
		return leadKey;
	}

	/**
	 * Sets the leadKey value for this ParamsGetLeadActivity.
	 * 
	 * @param leadKey
	 */
	public void setLeadKey(com.marketo.www.mktows.LeadKey leadKey) {
		this.leadKey = leadKey;
	}

	/**
	 * Gets the activityFilter value for this ParamsGetLeadActivity.
	 * 
	 * @return activityFilter
	 */
	public com.marketo.www.mktows.ActivityTypeFilter getActivityFilter() {
		return activityFilter;
	}

	/**
	 * Sets the activityFilter value for this ParamsGetLeadActivity.
	 * 
	 * @param activityFilter
	 */
	public void setActivityFilter(
			com.marketo.www.mktows.ActivityTypeFilter activityFilter) {
		this.activityFilter = activityFilter;
	}

	/**
	 * Gets the startPosition value for this ParamsGetLeadActivity.
	 * 
	 * @return startPosition
	 */
	public com.marketo.www.mktows.StreamPosition getStartPosition() {
		return startPosition;
	}

	/**
	 * Sets the startPosition value for this ParamsGetLeadActivity.
	 * 
	 * @param startPosition
	 */
	public void setStartPosition(com.marketo.www.mktows.StreamPosition startPosition) {
		this.startPosition = startPosition;
	}

	/**
	 * Gets the batchSize value for this ParamsGetLeadActivity.
	 * 
	 * @return batchSize
	 */
	public java.lang.Integer getBatchSize() {
		return batchSize;
	}

	/**
	 * Sets the batchSize value for this ParamsGetLeadActivity.
	 * 
	 * @param batchSize
	 */
	public void setBatchSize(java.lang.Integer batchSize) {
		this.batchSize = batchSize;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsGetLeadActivity))
			return false;
		ParamsGetLeadActivity other = (ParamsGetLeadActivity) obj;
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
				&& ((this.leadKey == null && other.getLeadKey() == null) || (this.leadKey != null && this.leadKey
						.equals(other.getLeadKey())))
				&& ((this.activityFilter == null && other.getActivityFilter() == null) || (this.activityFilter != null && this.activityFilter
						.equals(other.getActivityFilter())))
				&& ((this.startPosition == null && other.getStartPosition() == null) || (this.startPosition != null && this.startPosition
						.equals(other.getStartPosition())))
				&& ((this.batchSize == null && other.getBatchSize() == null) || (this.batchSize != null && this.batchSize
						.equals(other.getBatchSize())));
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
		if (getLeadKey() != null) {
			_hashCode += getLeadKey().hashCode();
		}
		if (getActivityFilter() != null) {
			_hashCode += getActivityFilter().hashCode();
		}
		if (getStartPosition() != null) {
			_hashCode += getStartPosition().hashCode();
		}
		if (getBatchSize() != null) {
			_hashCode += getBatchSize().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParamsGetLeadActivity.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsGetLeadActivity"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leadKey");
		elemField.setXmlName(new javax.xml.namespace.QName("", "leadKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadKey"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("activityFilter");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "activityFilter"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ActivityTypeFilter"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startPosition");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "startPosition"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "StreamPosition"));
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
