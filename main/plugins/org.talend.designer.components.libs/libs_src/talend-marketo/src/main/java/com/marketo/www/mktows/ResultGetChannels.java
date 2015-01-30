/**
 * ResultGetChannels.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ResultGetChannels implements java.io.Serializable {
	private com.marketo.www.mktows.TagStatus[] tags;

	public ResultGetChannels() {
	}

	public ResultGetChannels(com.marketo.www.mktows.TagStatus[] tags) {
		this.tags = tags;
	}

	/**
	 * Gets the tags value for this ResultGetChannels.
	 * 
	 * @return tags
	 */
	public com.marketo.www.mktows.TagStatus[] getTags() {
		return tags;
	}

	/**
	 * Sets the tags value for this ResultGetChannels.
	 * 
	 * @param tags
	 */
	public void setTags(com.marketo.www.mktows.TagStatus[] tags) {
		this.tags = tags;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResultGetChannels))
			return false;
		ResultGetChannels other = (ResultGetChannels) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.tags == null && other.getTags() == null) || (this.tags != null && java.util.Arrays
				.equals(this.tags, other.getTags())));
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
		if (getTags() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getTags()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getTags(), i);
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
			ResultGetChannels.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ResultGetChannels"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tags");
		elemField.setXmlName(new javax.xml.namespace.QName("", "tags"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "TagStatus"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "tagStatus"));
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
