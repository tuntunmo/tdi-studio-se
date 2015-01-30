/**
 * ActivityTypeFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ActivityTypeFilter implements java.io.Serializable {
	private com.marketo.www.mktows.ActivityType[] includeTypes;

	private com.marketo.www.mktows.ActivityType[] excludeTypes;

	public ActivityTypeFilter() {
	}

	public ActivityTypeFilter(com.marketo.www.mktows.ActivityType[] includeTypes,
			com.marketo.www.mktows.ActivityType[] excludeTypes) {
		this.includeTypes = includeTypes;
		this.excludeTypes = excludeTypes;
	}

	/**
	 * Gets the includeTypes value for this ActivityTypeFilter.
	 * 
	 * @return includeTypes
	 */
	public com.marketo.www.mktows.ActivityType[] getIncludeTypes() {
		return includeTypes;
	}

	/**
	 * Sets the includeTypes value for this ActivityTypeFilter.
	 * 
	 * @param includeTypes
	 */
	public void setIncludeTypes(com.marketo.www.mktows.ActivityType[] includeTypes) {
		this.includeTypes = includeTypes;
	}

	/**
	 * Gets the excludeTypes value for this ActivityTypeFilter.
	 * 
	 * @return excludeTypes
	 */
	public com.marketo.www.mktows.ActivityType[] getExcludeTypes() {
		return excludeTypes;
	}

	/**
	 * Sets the excludeTypes value for this ActivityTypeFilter.
	 * 
	 * @param excludeTypes
	 */
	public void setExcludeTypes(com.marketo.www.mktows.ActivityType[] excludeTypes) {
		this.excludeTypes = excludeTypes;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ActivityTypeFilter))
			return false;
		ActivityTypeFilter other = (ActivityTypeFilter) obj;
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
				&& ((this.includeTypes == null && other.getIncludeTypes() == null) || (this.includeTypes != null && java.util.Arrays
						.equals(this.includeTypes, other.getIncludeTypes())))
				&& ((this.excludeTypes == null && other.getExcludeTypes() == null) || (this.excludeTypes != null && java.util.Arrays
						.equals(this.excludeTypes, other.getExcludeTypes())));
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
		if (getIncludeTypes() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getIncludeTypes()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getIncludeTypes(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getExcludeTypes() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getExcludeTypes()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getExcludeTypes(), i);
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
			ActivityTypeFilter.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ActivityTypeFilter"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("includeTypes");
		elemField.setXmlName(new javax.xml.namespace.QName("", "includeTypes"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ActivityType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField
				.setItemQName(new javax.xml.namespace.QName("", "activityType"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("excludeTypes");
		elemField.setXmlName(new javax.xml.namespace.QName("", "excludeTypes"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ActivityType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField
				.setItemQName(new javax.xml.namespace.QName("", "activityType"));
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
