/**
 * ParamsGetCampaignsForSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsGetCampaignsForSource implements java.io.Serializable {
	private com.marketo.www.mktows.ReqCampSourceType source;

	private java.lang.String name;

	private java.lang.Boolean exactName;

	public ParamsGetCampaignsForSource() {
	}

	public ParamsGetCampaignsForSource(
			com.marketo.www.mktows.ReqCampSourceType source, java.lang.String name,
			java.lang.Boolean exactName) {
		this.source = source;
		this.name = name;
		this.exactName = exactName;
	}

	/**
	 * Gets the source value for this ParamsGetCampaignsForSource.
	 * 
	 * @return source
	 */
	public com.marketo.www.mktows.ReqCampSourceType getSource() {
		return source;
	}

	/**
	 * Sets the source value for this ParamsGetCampaignsForSource.
	 * 
	 * @param source
	 */
	public void setSource(com.marketo.www.mktows.ReqCampSourceType source) {
		this.source = source;
	}

	/**
	 * Gets the name value for this ParamsGetCampaignsForSource.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this ParamsGetCampaignsForSource.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the exactName value for this ParamsGetCampaignsForSource.
	 * 
	 * @return exactName
	 */
	public java.lang.Boolean getExactName() {
		return exactName;
	}

	/**
	 * Sets the exactName value for this ParamsGetCampaignsForSource.
	 * 
	 * @param exactName
	 */
	public void setExactName(java.lang.Boolean exactName) {
		this.exactName = exactName;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsGetCampaignsForSource))
			return false;
		ParamsGetCampaignsForSource other = (ParamsGetCampaignsForSource) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.exactName == null && other.getExactName() == null) || (this.exactName != null && this.exactName
						.equals(other.getExactName())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getExactName() != null) {
			_hashCode += getExactName().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParamsGetCampaignsForSource.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsGetCampaignsForSource"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("source");
		elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ReqCampSourceType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("exactName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "exactName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
