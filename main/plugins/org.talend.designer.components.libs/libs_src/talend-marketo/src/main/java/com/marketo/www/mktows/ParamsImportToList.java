/**
 * ParamsImportToList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ParamsImportToList implements java.io.Serializable {
	private java.lang.String programName;

	private java.lang.String importFileHeader;

	private java.lang.String[] importFileRows;

	private com.marketo.www.mktows.ImportToListModeEnum importListMode;

	private java.lang.String listName;

	private boolean clearList;

	private java.lang.String campaignName;

	public ParamsImportToList() {
	}

	public ParamsImportToList(java.lang.String programName,
			java.lang.String importFileHeader,
			java.lang.String[] importFileRows,
			com.marketo.www.mktows.ImportToListModeEnum importListMode,
			java.lang.String listName, boolean clearList,
			java.lang.String campaignName) {
		this.programName = programName;
		this.importFileHeader = importFileHeader;
		this.importFileRows = importFileRows;
		this.importListMode = importListMode;
		this.listName = listName;
		this.clearList = clearList;
		this.campaignName = campaignName;
	}

	/**
	 * Gets the programName value for this ParamsImportToList.
	 * 
	 * @return programName
	 */
	public java.lang.String getProgramName() {
		return programName;
	}

	/**
	 * Sets the programName value for this ParamsImportToList.
	 * 
	 * @param programName
	 */
	public void setProgramName(java.lang.String programName) {
		this.programName = programName;
	}

	/**
	 * Gets the importFileHeader value for this ParamsImportToList.
	 * 
	 * @return importFileHeader
	 */
	public java.lang.String getImportFileHeader() {
		return importFileHeader;
	}

	/**
	 * Sets the importFileHeader value for this ParamsImportToList.
	 * 
	 * @param importFileHeader
	 */
	public void setImportFileHeader(java.lang.String importFileHeader) {
		this.importFileHeader = importFileHeader;
	}

	/**
	 * Gets the importFileRows value for this ParamsImportToList.
	 * 
	 * @return importFileRows
	 */
	public java.lang.String[] getImportFileRows() {
		return importFileRows;
	}

	/**
	 * Sets the importFileRows value for this ParamsImportToList.
	 * 
	 * @param importFileRows
	 */
	public void setImportFileRows(java.lang.String[] importFileRows) {
		this.importFileRows = importFileRows;
	}

	/**
	 * Gets the importListMode value for this ParamsImportToList.
	 * 
	 * @return importListMode
	 */
	public com.marketo.www.mktows.ImportToListModeEnum getImportListMode() {
		return importListMode;
	}

	/**
	 * Sets the importListMode value for this ParamsImportToList.
	 * 
	 * @param importListMode
	 */
	public void setImportListMode(
			com.marketo.www.mktows.ImportToListModeEnum importListMode) {
		this.importListMode = importListMode;
	}

	/**
	 * Gets the listName value for this ParamsImportToList.
	 * 
	 * @return listName
	 */
	public java.lang.String getListName() {
		return listName;
	}

	/**
	 * Sets the listName value for this ParamsImportToList.
	 * 
	 * @param listName
	 */
	public void setListName(java.lang.String listName) {
		this.listName = listName;
	}

	/**
	 * Gets the clearList value for this ParamsImportToList.
	 * 
	 * @return clearList
	 */
	public boolean isClearList() {
		return clearList;
	}

	/**
	 * Sets the clearList value for this ParamsImportToList.
	 * 
	 * @param clearList
	 */
	public void setClearList(boolean clearList) {
		this.clearList = clearList;
	}

	/**
	 * Gets the campaignName value for this ParamsImportToList.
	 * 
	 * @return campaignName
	 */
	public java.lang.String getCampaignName() {
		return campaignName;
	}

	/**
	 * Sets the campaignName value for this ParamsImportToList.
	 * 
	 * @param campaignName
	 */
	public void setCampaignName(java.lang.String campaignName) {
		this.campaignName = campaignName;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParamsImportToList))
			return false;
		ParamsImportToList other = (ParamsImportToList) obj;
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
				&& ((this.importFileHeader == null && other
						.getImportFileHeader() == null) || (this.importFileHeader != null && this.importFileHeader
						.equals(other.getImportFileHeader())))
				&& ((this.importFileRows == null && other.getImportFileRows() == null) || (this.importFileRows != null && java.util.Arrays
						.equals(this.importFileRows, other.getImportFileRows())))
				&& ((this.importListMode == null && other.getImportListMode() == null) || (this.importListMode != null && this.importListMode
						.equals(other.getImportListMode())))
				&& ((this.listName == null && other.getListName() == null) || (this.listName != null && this.listName
						.equals(other.getListName())))
				&& this.clearList == other.isClearList()
				&& ((this.campaignName == null && other.getCampaignName() == null) || (this.campaignName != null && this.campaignName
						.equals(other.getCampaignName())));
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
		if (getImportFileHeader() != null) {
			_hashCode += getImportFileHeader().hashCode();
		}
		if (getImportFileRows() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getImportFileRows()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getImportFileRows(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getImportListMode() != null) {
			_hashCode += getImportListMode().hashCode();
		}
		if (getListName() != null) {
			_hashCode += getListName().hashCode();
		}
		_hashCode += (isClearList() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getCampaignName() != null) {
			_hashCode += getCampaignName().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParamsImportToList.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ParamsImportToList"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("programName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "programName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("importFileHeader");
		elemField.setXmlName(new javax.xml.namespace.QName("",
				"importFileHeader"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("importFileRows");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "importFileRows"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("", "stringItem"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("importListMode");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "importListMode"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ImportToListModeEnum"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("listName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "listName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("clearList");
		elemField.setXmlName(new javax.xml.namespace.QName("", "clearList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("campaignName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "campaignName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
