/**
 * ProgressionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ProgressionStatus implements java.io.Serializable {
	private com.marketo.www.mktows.Attrib[] progressionStatus;

	public ProgressionStatus() {
	}

	public ProgressionStatus(com.marketo.www.mktows.Attrib[] progressionStatus) {
		this.progressionStatus = progressionStatus;
	}

	/**
	 * Gets the progressionStatus value for this ProgressionStatus.
	 * 
	 * @return progressionStatus
	 */
	public com.marketo.www.mktows.Attrib[] getProgressionStatus() {
		return progressionStatus;
	}

	/**
	 * Sets the progressionStatus value for this ProgressionStatus.
	 * 
	 * @param progressionStatus
	 */
	public void setProgressionStatus(
			com.marketo.www.mktows.Attrib[] progressionStatus) {
		this.progressionStatus = progressionStatus;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ProgressionStatus))
			return false;
		ProgressionStatus other = (ProgressionStatus) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.progressionStatus == null && other
				.getProgressionStatus() == null) || (this.progressionStatus != null && java.util.Arrays
				.equals(this.progressionStatus, other.getProgressionStatus())));
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
		if (getProgressionStatus() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getProgressionStatus()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getProgressionStatus(), i);
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
			ProgressionStatus.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ProgressionStatus"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("progressionStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"progressionStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "Attrib"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "attrib"));
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
