/**
 * ParamsSyncCustomObjects.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsSyncCustomObjects implements java.io.Serializable {
	private java.lang.String objTypeName;

	private com.marketo.www.mktows.CustomObj[] customObjList;

	private com.marketo.www.mktows.SyncOperationEnum operation;

	public ParamsSyncCustomObjects() {
	}

	public ParamsSyncCustomObjects(java.lang.String objTypeName,
			com.marketo.www.mktows.CustomObj[] customObjList,
			com.marketo.www.mktows.SyncOperationEnum operation) {
		this.objTypeName = objTypeName;
		this.customObjList = customObjList;
		this.operation = operation;
	}

	/**
	 * Gets the objTypeName value for this ParamsSyncCustomObjects.
	 * 
	 * @return objTypeName
	 */
	public java.lang.String getObjTypeName() {
		return objTypeName;
	}

	/**
	 * Sets the objTypeName value for this ParamsSyncCustomObjects.
	 * 
	 * @param objTypeName
	 */
	public void setObjTypeName(java.lang.String objTypeName) {
		this.objTypeName = objTypeName;
	}

	/**
	 * Gets the customObjList value for this ParamsSyncCustomObjects.
	 * 
	 * @return customObjList
	 */
	public com.marketo.www.mktows.CustomObj[] getCustomObjList() {
		return customObjList;
	}

	/**
	 * Sets the customObjList value for this ParamsSyncCustomObjects.
	 * 
	 * @param customObjList
	 */
	public void setCustomObjList(com.marketo.www.mktows.CustomObj[] customObjList) {
		this.customObjList = customObjList;
	}

	/**
	 * Gets the operation value for this ParamsSyncCustomObjects.
	 * 
	 * @return operation
	 */
	public com.marketo.www.mktows.SyncOperationEnum getOperation() {
		return operation;
	}

	/**
	 * Sets the operation value for this ParamsSyncCustomObjects.
	 * 
	 * @param operation
	 */
	public void setOperation(com.marketo.www.mktows.SyncOperationEnum operation) {
		this.operation = operation;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsSyncCustomObjects))
			return false;
		ParamsSyncCustomObjects other = (ParamsSyncCustomObjects) obj;
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
				&& ((this.objTypeName == null && other.getObjTypeName() == null) || (this.objTypeName != null && this.objTypeName
						.equals(other.getObjTypeName())))
				&& ((this.customObjList == null && other.getCustomObjList() == null) || (this.customObjList != null && java.util.Arrays
						.equals(this.customObjList, other.getCustomObjList())))
				&& ((this.operation == null && other.getOperation() == null) || (this.operation != null && this.operation
						.equals(other.getOperation())));
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
		if (getObjTypeName() != null) {
			_hashCode += getObjTypeName().hashCode();
		}
		if (getCustomObjList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCustomObjList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCustomObjList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getOperation() != null) {
			_hashCode += getOperation().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParamsSyncCustomObjects.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsSyncCustomObjects"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("objTypeName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "objTypeName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customObjList");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "customObjList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "CustomObj"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "customObj"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("operation");
		elemField.setXmlName(new javax.xml.namespace.QName("", "operation"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "SyncOperationEnum"));
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
