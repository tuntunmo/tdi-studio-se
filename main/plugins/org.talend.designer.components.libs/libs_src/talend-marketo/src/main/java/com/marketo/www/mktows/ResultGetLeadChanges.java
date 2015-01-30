/**
 * ResultGetLeadChanges.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ResultGetLeadChanges implements java.io.Serializable {
	private int returnCount;

	private int remainingCount;

	private com.marketo.www.mktows.StreamPosition newStartPosition;

	private com.marketo.www.mktows.LeadChangeRecord[] leadChangeRecordList;

	public ResultGetLeadChanges() {
	}

	public ResultGetLeadChanges(int returnCount, int remainingCount,
			com.marketo.www.mktows.StreamPosition newStartPosition,
			com.marketo.www.mktows.LeadChangeRecord[] leadChangeRecordList) {
		this.returnCount = returnCount;
		this.remainingCount = remainingCount;
		this.newStartPosition = newStartPosition;
		this.leadChangeRecordList = leadChangeRecordList;
	}

	/**
	 * Gets the returnCount value for this ResultGetLeadChanges.
	 * 
	 * @return returnCount
	 */
	public int getReturnCount() {
		return returnCount;
	}

	/**
	 * Sets the returnCount value for this ResultGetLeadChanges.
	 * 
	 * @param returnCount
	 */
	public void setReturnCount(int returnCount) {
		this.returnCount = returnCount;
	}

	/**
	 * Gets the remainingCount value for this ResultGetLeadChanges.
	 * 
	 * @return remainingCount
	 */
	public int getRemainingCount() {
		return remainingCount;
	}

	/**
	 * Sets the remainingCount value for this ResultGetLeadChanges.
	 * 
	 * @param remainingCount
	 */
	public void setRemainingCount(int remainingCount) {
		this.remainingCount = remainingCount;
	}

	/**
	 * Gets the newStartPosition value for this ResultGetLeadChanges.
	 * 
	 * @return newStartPosition
	 */
	public com.marketo.www.mktows.StreamPosition getNewStartPosition() {
		return newStartPosition;
	}

	/**
	 * Sets the newStartPosition value for this ResultGetLeadChanges.
	 * 
	 * @param newStartPosition
	 */
	public void setNewStartPosition(
			com.marketo.www.mktows.StreamPosition newStartPosition) {
		this.newStartPosition = newStartPosition;
	}

	/**
	 * Gets the leadChangeRecordList value for this ResultGetLeadChanges.
	 * 
	 * @return leadChangeRecordList
	 */
	public com.marketo.www.mktows.LeadChangeRecord[] getLeadChangeRecordList() {
		return leadChangeRecordList;
	}

	/**
	 * Sets the leadChangeRecordList value for this ResultGetLeadChanges.
	 * 
	 * @param leadChangeRecordList
	 */
	public void setLeadChangeRecordList(
			com.marketo.www.mktows.LeadChangeRecord[] leadChangeRecordList) {
		this.leadChangeRecordList = leadChangeRecordList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResultGetLeadChanges))
			return false;
		ResultGetLeadChanges other = (ResultGetLeadChanges) obj;
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
				&& this.returnCount == other.getReturnCount()
				&& this.remainingCount == other.getRemainingCount()
				&& ((this.newStartPosition == null && other
						.getNewStartPosition() == null) || (this.newStartPosition != null && this.newStartPosition
						.equals(other.getNewStartPosition())))
				&& ((this.leadChangeRecordList == null && other
						.getLeadChangeRecordList() == null) || (this.leadChangeRecordList != null && java.util.Arrays
						.equals(this.leadChangeRecordList,
								other.getLeadChangeRecordList())));
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
		_hashCode += getReturnCount();
		_hashCode += getRemainingCount();
		if (getNewStartPosition() != null) {
			_hashCode += getNewStartPosition().hashCode();
		}
		if (getLeadChangeRecordList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getLeadChangeRecordList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLeadChangeRecordList(), i);
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
			ResultGetLeadChanges.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ResultGetLeadChanges"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("returnCount");
		elemField.setXmlName(new javax.xml.namespace.QName("", "returnCount"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("remainingCount");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "remainingCount"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("newStartPosition");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"newStartPosition"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "StreamPosition"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leadChangeRecordList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"leadChangeRecordList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadChangeRecord"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new javax.xml.namespace.QName("",
				"leadChangeRecord"));
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
