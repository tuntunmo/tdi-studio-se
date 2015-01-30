/**
 * ResultImportToList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ResultImportToList implements java.io.Serializable {
	private com.marketo.www.mktows.ImportToListStatusEnum importStatus;

	public ResultImportToList() {
	}

	public ResultImportToList(
			com.marketo.www.mktows.ImportToListStatusEnum importStatus) {
		this.importStatus = importStatus;
	}

	/**
	 * Gets the importStatus value for this ResultImportToList.
	 * 
	 * @return importStatus
	 */
	public com.marketo.www.mktows.ImportToListStatusEnum getImportStatus() {
		return importStatus;
	}

	/**
	 * Sets the importStatus value for this ResultImportToList.
	 * 
	 * @param importStatus
	 */
	public void setImportStatus(
			com.marketo.www.mktows.ImportToListStatusEnum importStatus) {
		this.importStatus = importStatus;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResultImportToList))
			return false;
		ResultImportToList other = (ResultImportToList) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.importStatus == null && other
				.getImportStatus() == null) || (this.importStatus != null && this.importStatus
				.equals(other.getImportStatus())));
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
		if (getImportStatus() != null) {
			_hashCode += getImportStatus().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ResultImportToList.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ResultImportToList"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("importStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("", "importStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ImportToListStatusEnum"));
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
