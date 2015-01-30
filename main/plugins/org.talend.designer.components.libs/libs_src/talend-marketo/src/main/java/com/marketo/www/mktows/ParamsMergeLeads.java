/**
 * ParamsMergeLeads.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsMergeLeads implements java.io.Serializable {
	private com.marketo.www.mktows.Attribute[] winningLeadKeyList;

	private com.marketo.www.mktows.Attribute[][] losingLeadKeyLists;

	private java.lang.Boolean mergeInSales;

	public ParamsMergeLeads() {
	}

	public ParamsMergeLeads(com.marketo.www.mktows.Attribute[] winningLeadKeyList,
			com.marketo.www.mktows.Attribute[][] losingLeadKeyLists,
			java.lang.Boolean mergeInSales) {
		this.winningLeadKeyList = winningLeadKeyList;
		this.losingLeadKeyLists = losingLeadKeyLists;
		this.mergeInSales = mergeInSales;
	}

	/**
	 * Gets the winningLeadKeyList value for this ParamsMergeLeads.
	 * 
	 * @return winningLeadKeyList
	 */
	public com.marketo.www.mktows.Attribute[] getWinningLeadKeyList() {
		return winningLeadKeyList;
	}

	/**
	 * Sets the winningLeadKeyList value for this ParamsMergeLeads.
	 * 
	 * @param winningLeadKeyList
	 */
	public void setWinningLeadKeyList(
			com.marketo.www.mktows.Attribute[] winningLeadKeyList) {
		this.winningLeadKeyList = winningLeadKeyList;
	}

	/**
	 * Gets the losingLeadKeyLists value for this ParamsMergeLeads.
	 * 
	 * @return losingLeadKeyLists
	 */
	public com.marketo.www.mktows.Attribute[][] getLosingLeadKeyLists() {
		return losingLeadKeyLists;
	}

	/**
	 * Sets the losingLeadKeyLists value for this ParamsMergeLeads.
	 * 
	 * @param losingLeadKeyLists
	 */
	public void setLosingLeadKeyLists(
			com.marketo.www.mktows.Attribute[][] losingLeadKeyLists) {
		this.losingLeadKeyLists = losingLeadKeyLists;
	}

	/**
	 * Gets the mergeInSales value for this ParamsMergeLeads.
	 * 
	 * @return mergeInSales
	 */
	public java.lang.Boolean getMergeInSales() {
		return mergeInSales;
	}

	/**
	 * Sets the mergeInSales value for this ParamsMergeLeads.
	 * 
	 * @param mergeInSales
	 */
	public void setMergeInSales(java.lang.Boolean mergeInSales) {
		this.mergeInSales = mergeInSales;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsMergeLeads))
			return false;
		ParamsMergeLeads other = (ParamsMergeLeads) obj;
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
				&& ((this.winningLeadKeyList == null && other
						.getWinningLeadKeyList() == null) || (this.winningLeadKeyList != null && java.util.Arrays
						.equals(this.winningLeadKeyList,
								other.getWinningLeadKeyList())))
				&& ((this.losingLeadKeyLists == null && other
						.getLosingLeadKeyLists() == null) || (this.losingLeadKeyLists != null && java.util.Arrays
						.equals(this.losingLeadKeyLists,
								other.getLosingLeadKeyLists())))
				&& ((this.mergeInSales == null && other.getMergeInSales() == null) || (this.mergeInSales != null && this.mergeInSales
						.equals(other.getMergeInSales())));
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
		if (getWinningLeadKeyList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getWinningLeadKeyList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getWinningLeadKeyList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getLosingLeadKeyLists() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getLosingLeadKeyLists()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLosingLeadKeyLists(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getMergeInSales() != null) {
			_hashCode += getMergeInSales().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParamsMergeLeads.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsMergeLeads"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("winningLeadKeyList");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"winningLeadKeyList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "Attribute"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("losingLeadKeyLists");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"losingLeadKeyLists"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ArrayOfAttribute"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "keyList"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mergeInSales");
		elemField.setXmlName(new javax.xml.namespace.QName("", "mergeInSales"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
