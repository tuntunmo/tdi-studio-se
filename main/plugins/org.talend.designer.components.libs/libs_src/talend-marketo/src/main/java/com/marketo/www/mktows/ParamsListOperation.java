/**
 * ParamsListOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsListOperation implements java.io.Serializable {
	private com.marketo.www.mktows.ListOperationType listOperation;

	private com.marketo.www.mktows.ListKey listKey;

	private com.marketo.www.mktows.LeadKey[] listMemberList;

	private java.lang.Boolean strict;

	public ParamsListOperation() {
	}

	public ParamsListOperation(
			com.marketo.www.mktows.ListOperationType listOperation,
			com.marketo.www.mktows.ListKey listKey,
			com.marketo.www.mktows.LeadKey[] listMemberList,
			java.lang.Boolean strict) {
		this.listOperation = listOperation;
		this.listKey = listKey;
		this.listMemberList = listMemberList;
		this.strict = strict;
	}

	/**
	 * Gets the listOperation value for this ParamsListOperation.
	 * 
	 * @return listOperation
	 */
	public com.marketo.www.mktows.ListOperationType getListOperation() {
		return listOperation;
	}

	/**
	 * Sets the listOperation value for this ParamsListOperation.
	 * 
	 * @param listOperation
	 */
	public void setListOperation(
			com.marketo.www.mktows.ListOperationType listOperation) {
		this.listOperation = listOperation;
	}

	/**
	 * Gets the listKey value for this ParamsListOperation.
	 * 
	 * @return listKey
	 */
	public com.marketo.www.mktows.ListKey getListKey() {
		return listKey;
	}

	/**
	 * Sets the listKey value for this ParamsListOperation.
	 * 
	 * @param listKey
	 */
	public void setListKey(com.marketo.www.mktows.ListKey listKey) {
		this.listKey = listKey;
	}

	/**
	 * Gets the listMemberList value for this ParamsListOperation.
	 * 
	 * @return listMemberList
	 */
	public com.marketo.www.mktows.LeadKey[] getListMemberList() {
		return listMemberList;
	}

	/**
	 * Sets the listMemberList value for this ParamsListOperation.
	 * 
	 * @param listMemberList
	 */
	public void setListMemberList(com.marketo.www.mktows.LeadKey[] listMemberList) {
		this.listMemberList = listMemberList;
	}

	/**
	 * Gets the strict value for this ParamsListOperation.
	 * 
	 * @return strict
	 */
	public java.lang.Boolean getStrict() {
		return strict;
	}

	/**
	 * Sets the strict value for this ParamsListOperation.
	 * 
	 * @param strict
	 */
	public void setStrict(java.lang.Boolean strict) {
		this.strict = strict;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsListOperation))
			return false;
		ParamsListOperation other = (ParamsListOperation) obj;
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
				&& ((this.listOperation == null && other.getListOperation() == null) || (this.listOperation != null && this.listOperation
						.equals(other.getListOperation())))
				&& ((this.listKey == null && other.getListKey() == null) || (this.listKey != null && this.listKey
						.equals(other.getListKey())))
				&& ((this.listMemberList == null && other.getListMemberList() == null) || (this.listMemberList != null && java.util.Arrays
						.equals(this.listMemberList, other.getListMemberList())))
				&& ((this.strict == null && other.getStrict() == null) || (this.strict != null && this.strict
						.equals(other.getStrict())));
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
		if (getListOperation() != null) {
			_hashCode += getListOperation().hashCode();
		}
		if (getListKey() != null) {
			_hashCode += getListKey().hashCode();
		}
		if (getListMemberList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getListMemberList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getListMemberList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getStrict() != null) {
			_hashCode += getStrict().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParamsListOperation.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsListOperation"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("listOperation");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "listOperation"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ListOperationType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("listKey");
		elemField.setXmlName(new javax.xml.namespace.QName("", "listKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ListKey"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("listMemberList");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "listMemberList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "LeadKey"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "leadKey"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("strict");
		elemField.setXmlName(new javax.xml.namespace.QName("", "strict"));
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
