/**
 * LeadActivityList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class LeadActivityList implements java.io.Serializable {
	private int returnCount;

	private int remainingCount;

	private com.marketo.www.mktows.StreamPosition newStartPosition;

	private com.marketo.www.mktows.ActivityRecord[] activityRecordList;

	public LeadActivityList() {
	}

	public LeadActivityList(int returnCount, int remainingCount,
			com.marketo.www.mktows.StreamPosition newStartPosition,
			com.marketo.www.mktows.ActivityRecord[] activityRecordList) {
		this.returnCount = returnCount;
		this.remainingCount = remainingCount;
		this.newStartPosition = newStartPosition;
		this.activityRecordList = activityRecordList;
	}

	/**
	 * Gets the returnCount value for this LeadActivityList.
	 * 
	 * @return returnCount
	 */
	public int getReturnCount() {
		return returnCount;
	}

	/**
	 * Sets the returnCount value for this LeadActivityList.
	 * 
	 * @param returnCount
	 */
	public void setReturnCount(int returnCount) {
		this.returnCount = returnCount;
	}

	/**
	 * Gets the remainingCount value for this LeadActivityList.
	 * 
	 * @return remainingCount
	 */
	public int getRemainingCount() {
		return remainingCount;
	}

	/**
	 * Sets the remainingCount value for this LeadActivityList.
	 * 
	 * @param remainingCount
	 */
	public void setRemainingCount(int remainingCount) {
		this.remainingCount = remainingCount;
	}

	/**
	 * Gets the newStartPosition value for this LeadActivityList.
	 * 
	 * @return newStartPosition
	 */
	public com.marketo.www.mktows.StreamPosition getNewStartPosition() {
		return newStartPosition;
	}

	/**
	 * Sets the newStartPosition value for this LeadActivityList.
	 * 
	 * @param newStartPosition
	 */
	public void setNewStartPosition(
			com.marketo.www.mktows.StreamPosition newStartPosition) {
		this.newStartPosition = newStartPosition;
	}

	/**
	 * Gets the activityRecordList value for this LeadActivityList.
	 * 
	 * @return activityRecordList
	 */
	public com.marketo.www.mktows.ActivityRecord[] getActivityRecordList() {
		return activityRecordList;
	}

	/**
	 * Sets the activityRecordList value for this LeadActivityList.
	 * 
	 * @param activityRecordList
	 */
	public void setActivityRecordList(
			com.marketo.www.mktows.ActivityRecord[] activityRecordList) {
		this.activityRecordList = activityRecordList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LeadActivityList))
			return false;
		LeadActivityList other = (LeadActivityList) obj;
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
				&& ((this.activityRecordList == null && other
						.getActivityRecordList() == null) || (this.activityRecordList != null && java.util.Arrays
						.equals(this.activityRecordList,
								other.getActivityRecordList())));
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
		if (getActivityRecordList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getActivityRecordList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getActivityRecordList(), i);
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
			LeadActivityList.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadActivityList"));
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
		elemField.setFieldName("activityRecordList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"activityRecordList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ActivityRecord"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new javax.xml.namespace.QName("",
				"activityRecord"));
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
