/**
 * MergeStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class MergeStatus implements java.io.Serializable {
	private java.lang.Integer winningLeadId;

	private int[] losingLeadIdList;

	private com.marketo.www.mktows.LeadMergeStatusEnum status;

	private java.lang.String error;

	public MergeStatus() {
	}

	public MergeStatus(java.lang.Integer winningLeadId, int[] losingLeadIdList,
			com.marketo.www.mktows.LeadMergeStatusEnum status,
			java.lang.String error) {
		this.winningLeadId = winningLeadId;
		this.losingLeadIdList = losingLeadIdList;
		this.status = status;
		this.error = error;
	}

	/**
	 * Gets the winningLeadId value for this MergeStatus.
	 * 
	 * @return winningLeadId
	 */
	public java.lang.Integer getWinningLeadId() {
		return winningLeadId;
	}

	/**
	 * Sets the winningLeadId value for this MergeStatus.
	 * 
	 * @param winningLeadId
	 */
	public void setWinningLeadId(java.lang.Integer winningLeadId) {
		this.winningLeadId = winningLeadId;
	}

	/**
	 * Gets the losingLeadIdList value for this MergeStatus.
	 * 
	 * @return losingLeadIdList
	 */
	public int[] getLosingLeadIdList() {
		return losingLeadIdList;
	}

	/**
	 * Sets the losingLeadIdList value for this MergeStatus.
	 * 
	 * @param losingLeadIdList
	 */
	public void setLosingLeadIdList(int[] losingLeadIdList) {
		this.losingLeadIdList = losingLeadIdList;
	}

	/**
	 * Gets the status value for this MergeStatus.
	 * 
	 * @return status
	 */
	public com.marketo.www.mktows.LeadMergeStatusEnum getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this MergeStatus.
	 * 
	 * @param status
	 */
	public void setStatus(com.marketo.www.mktows.LeadMergeStatusEnum status) {
		this.status = status;
	}

	/**
	 * Gets the error value for this MergeStatus.
	 * 
	 * @return error
	 */
	public java.lang.String getError() {
		return error;
	}

	/**
	 * Sets the error value for this MergeStatus.
	 * 
	 * @param error
	 */
	public void setError(java.lang.String error) {
		this.error = error;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MergeStatus))
			return false;
		MergeStatus other = (MergeStatus) obj;
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
				&& ((this.winningLeadId == null && other.getWinningLeadId() == null) || (this.winningLeadId != null && this.winningLeadId
						.equals(other.getWinningLeadId())))
				&& ((this.losingLeadIdList == null && other
						.getLosingLeadIdList() == null) || (this.losingLeadIdList != null && java.util.Arrays
						.equals(this.losingLeadIdList,
								other.getLosingLeadIdList())))
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
		if (getWinningLeadId() != null) {
			_hashCode += getWinningLeadId().hashCode();
		}
		if (getLosingLeadIdList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getLosingLeadIdList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLosingLeadIdList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
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
			MergeStatus.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "MergeStatus"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("winningLeadId");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "winningLeadId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("losingLeadIdList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"losingLeadIdList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField
				.setItemQName(new javax.xml.namespace.QName("", "integerItem"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("status");
		elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadMergeStatusEnum"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("error");
		elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
