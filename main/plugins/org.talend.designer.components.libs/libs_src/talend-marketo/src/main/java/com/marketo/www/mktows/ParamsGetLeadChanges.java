/**
 * ParamsGetLeadChanges.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsGetLeadChanges implements java.io.Serializable {
	private com.marketo.www.mktows.StreamPosition startPosition;

	private com.marketo.www.mktows.ActivityTypeFilter activityFilter;

	private java.lang.String[] activityNameFilter;
	private java.lang.Integer batchSize;

	private com.marketo.www.mktows.LeadSelector leadSelector;

	public ParamsGetLeadChanges() {
	}

	public ParamsGetLeadChanges(
			com.marketo.www.mktows.StreamPosition startPosition,
			com.marketo.www.mktows.ActivityTypeFilter activityFilter,
			java.lang.String[] activityNameFilter, java.lang.Integer batchSize,
			com.marketo.www.mktows.LeadSelector leadSelector) {
		this.startPosition = startPosition;
		this.activityFilter = activityFilter;
		this.activityNameFilter = activityNameFilter;
		this.batchSize = batchSize;
		this.leadSelector = leadSelector;
	}

	/**
	 * Gets the startPosition value for this ParamsGetLeadChanges.
	 * 
	 * @return startPosition
	 */
	public com.marketo.www.mktows.StreamPosition getStartPosition() {
		return startPosition;
	}

	/**
	 * Sets the startPosition value for this ParamsGetLeadChanges.
	 * 
	 * @param startPosition
	 */
	public void setStartPosition(com.marketo.www.mktows.StreamPosition startPosition) {
		this.startPosition = startPosition;
	}

	/**
	 * Gets the activityFilter value for this ParamsGetLeadChanges.
	 * 
	 * @return activityFilter
	 */
	public com.marketo.www.mktows.ActivityTypeFilter getActivityFilter() {
		return activityFilter;
	}

	/**
	 * Sets the activityFilter value for this ParamsGetLeadChanges.
	 * 
	 * @param activityFilter
	 */
	public void setActivityFilter(
			com.marketo.www.mktows.ActivityTypeFilter activityFilter) {
		this.activityFilter = activityFilter;
	}
	public java.lang.String[] getActivityNameFilter() {
		return activityNameFilter;
	}
	public void setActivityNameFilter(java.lang.String[] activityNameFilter) {
		this.activityNameFilter = activityNameFilter;
	}

	/**
	 * Gets the batchSize value for this ParamsGetLeadChanges.
	 * 
	 * @return batchSize
	 */
	public java.lang.Integer getBatchSize() {
		return batchSize;
	}

	/**
	 * Sets the batchSize value for this ParamsGetLeadChanges.
	 * 
	 * @param batchSize
	 */
	public void setBatchSize(java.lang.Integer batchSize) {
		this.batchSize = batchSize;
	}

	/**
	 * Gets the leadSelector value for this ParamsGetLeadChanges.
	 * 
	 * @return leadSelector
	 */
	public com.marketo.www.mktows.LeadSelector getLeadSelector() {
		return leadSelector;
	}

	/**
	 * Sets the leadSelector value for this ParamsGetLeadChanges.
	 * 
	 * @param leadSelector
	 */
	public void setLeadSelector(com.marketo.www.mktows.LeadSelector leadSelector) {
		this.leadSelector = leadSelector;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsGetLeadChanges))
			return false;
		ParamsGetLeadChanges other = (ParamsGetLeadChanges) obj;
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
				&& ((this.startPosition == null && other.getStartPosition() == null) || (this.startPosition != null && this.startPosition
						.equals(other.getStartPosition())))
				&& ((this.activityFilter == null && other.getActivityFilter() == null) || (this.activityFilter != null && this.activityFilter
						.equals(other.getActivityFilter())))
				&& ((this.activityNameFilter == null && other
						.getActivityNameFilter() == null) || (this.activityNameFilter != null && java.util.Arrays
						.equals(this.activityNameFilter,
								other.getActivityNameFilter())))
				&& ((this.batchSize == null && other.getBatchSize() == null) || (this.batchSize != null && this.batchSize
						.equals(other.getBatchSize())))
				&& ((this.leadSelector == null && other.getLeadSelector() == null) || (this.leadSelector != null && this.leadSelector
						.equals(other.getLeadSelector())));
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
		if (getStartPosition() != null) {
			_hashCode += getStartPosition().hashCode();
		}
		if (getActivityFilter() != null) {
			_hashCode += getActivityFilter().hashCode();
		}
		if (getActivityNameFilter() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getActivityNameFilter()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getActivityNameFilter(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getBatchSize() != null) {
			_hashCode += getBatchSize().hashCode();
		}
		if (getLeadSelector() != null) {
			_hashCode += getLeadSelector().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParamsGetLeadChanges.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsGetLeadChanges"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startPosition");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "startPosition"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "StreamPosition"));
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
		elemField.setFieldName("activityNameFilter");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"activityNameFilter"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new javax.xml.namespace.QName("", "stringItem"));
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
		elemField.setFieldName("leadSelector");
		elemField.setXmlName(new javax.xml.namespace.QName("", "leadSelector"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadSelector"));
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
