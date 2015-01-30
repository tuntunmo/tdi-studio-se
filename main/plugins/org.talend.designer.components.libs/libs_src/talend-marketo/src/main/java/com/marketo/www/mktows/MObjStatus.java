/**
 * MObjStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class MObjStatus implements java.io.Serializable {
	private java.lang.Integer id;

	private com.marketo.www.mktows.Attrib externalKey;

	private com.marketo.www.mktows.MObjStatusEnum status;

	private java.lang.String error;

	public MObjStatus() {
	}

	public MObjStatus(java.lang.Integer id,
			com.marketo.www.mktows.Attrib externalKey,
			com.marketo.www.mktows.MObjStatusEnum status, java.lang.String error) {
		this.id = id;
		this.externalKey = externalKey;
		this.status = status;
		this.error = error;
	}

	/**
	 * Gets the id value for this MObjStatus.
	 * 
	 * @return id
	 */
	public java.lang.Integer getId() {
		return id;
	}

	/**
	 * Sets the id value for this MObjStatus.
	 * 
	 * @param id
	 */
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	/**
	 * Gets the externalKey value for this MObjStatus.
	 * 
	 * @return externalKey
	 */
	public com.marketo.www.mktows.Attrib getExternalKey() {
		return externalKey;
	}

	/**
	 * Sets the externalKey value for this MObjStatus.
	 * 
	 * @param externalKey
	 */
	public void setExternalKey(com.marketo.www.mktows.Attrib externalKey) {
		this.externalKey = externalKey;
	}

	/**
	 * Gets the status value for this MObjStatus.
	 * 
	 * @return status
	 */
	public com.marketo.www.mktows.MObjStatusEnum getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this MObjStatus.
	 * 
	 * @param status
	 */
	public void setStatus(com.marketo.www.mktows.MObjStatusEnum status) {
		this.status = status;
	}

	/**
	 * Gets the error value for this MObjStatus.
	 * 
	 * @return error
	 */
	public java.lang.String getError() {
		return error;
	}

	/**
	 * Sets the error value for this MObjStatus.
	 * 
	 * @param error
	 */
	public void setError(java.lang.String error) {
		this.error = error;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MObjStatus))
			return false;
		MObjStatus other = (MObjStatus) obj;
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
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& ((this.externalKey == null && other.getExternalKey() == null) || (this.externalKey != null && this.externalKey
						.equals(other.getExternalKey())))
				&& ((this.status == null && other.getStatus() == null) || (this.status != null && this.status
						.equals(other.getStatus())))
				&& ((this.error == null && other.getError() == null) || (this.error != null && this.error
						.equals(other.getError())));
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
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getExternalKey() != null) {
			_hashCode += getExternalKey().hashCode();
		}
		if (getStatus() != null) {
			_hashCode += getStatus().hashCode();
		}
		if (getError() != null) {
			_hashCode += getError().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			MObjStatus.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObjStatus"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("externalKey");
		elemField.setXmlName(new javax.xml.namespace.QName("", "externalKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "Attrib"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("status");
		elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MObjStatusEnum"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("error");
		elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
