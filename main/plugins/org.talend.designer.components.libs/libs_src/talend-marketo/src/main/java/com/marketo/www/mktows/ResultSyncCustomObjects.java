/**
 * ResultSyncCustomObjects.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ResultSyncCustomObjects implements java.io.Serializable {
	private com.marketo.www.mktows.SyncCustomObjStatus[] syncCustomObjStatusList;

	public ResultSyncCustomObjects() {
	}

	public ResultSyncCustomObjects(
			com.marketo.www.mktows.SyncCustomObjStatus[] syncCustomObjStatusList) {
		this.syncCustomObjStatusList = syncCustomObjStatusList;
	}

	/**
	 * Gets the syncCustomObjStatusList value for this ResultSyncCustomObjects.
	 * 
	 * @return syncCustomObjStatusList
	 */
	public com.marketo.www.mktows.SyncCustomObjStatus[] getSyncCustomObjStatusList() {
		return syncCustomObjStatusList;
	}

	/**
	 * Sets the syncCustomObjStatusList value for this ResultSyncCustomObjects.
	 * 
	 * @param syncCustomObjStatusList
	 */
	public void setSyncCustomObjStatusList(
			com.marketo.www.mktows.SyncCustomObjStatus[] syncCustomObjStatusList) {
		this.syncCustomObjStatusList = syncCustomObjStatusList;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResultSyncCustomObjects))
			return false;
		ResultSyncCustomObjects other = (ResultSyncCustomObjects) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.syncCustomObjStatusList == null && other
				.getSyncCustomObjStatusList() == null) || (this.syncCustomObjStatusList != null && java.util.Arrays
				.equals(this.syncCustomObjStatusList,
						other.getSyncCustomObjStatusList())));
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
		if (getSyncCustomObjStatusList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSyncCustomObjStatusList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSyncCustomObjStatusList(), i);
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
			ResultSyncCustomObjects.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ResultSyncCustomObjects"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("syncCustomObjStatusList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"syncCustomObjStatusList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SyncCustomObjStatus"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("",
				"syncCustomObjStatus"));
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
