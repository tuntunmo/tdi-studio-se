/**
 * ParamsGetImportToListStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsGetImportToListStatus implements java.io.Serializable {
	private java.lang.String programName;

	private java.lang.String listName;

	public ParamsGetImportToListStatus() {
	}

	public ParamsGetImportToListStatus(java.lang.String programName,
			java.lang.String listName) {
		this.programName = programName;
		this.listName = listName;
	}

	/**
	 * Gets the programName value for this ParamsGetImportToListStatus.
	 * 
	 * @return programName
	 */
	public java.lang.String getProgramName() {
		return programName;
	}

	/**
	 * Sets the programName value for this ParamsGetImportToListStatus.
	 * 
	 * @param programName
	 */
	public void setProgramName(java.lang.String programName) {
		this.programName = programName;
	}

	/**
	 * Gets the listName value for this ParamsGetImportToListStatus.
	 * 
	 * @return listName
	 */
	public java.lang.String getListName() {
		return listName;
	}

	/**
	 * Sets the listName value for this ParamsGetImportToListStatus.
	 * 
	 * @param listName
	 */
	public void setListName(java.lang.String listName) {
		this.listName = listName;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsGetImportToListStatus))
			return false;
		ParamsGetImportToListStatus other = (ParamsGetImportToListStatus) obj;
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
				&& ((this.programName == null && other.getProgramName() == null) || (this.programName != null && this.programName
						.equals(other.getProgramName())))
				&& ((this.listName == null && other.getListName() == null) || (this.listName != null && this.listName
						.equals(other.getListName())));
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
		if (getProgramName() != null) {
			_hashCode += getProgramName().hashCode();
		}
		if (getListName() != null) {
			_hashCode += getListName().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParamsGetImportToListStatus.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsGetImportToListStatus"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("programName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "programName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("listName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "listName"));
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
