/**
 * ResultGetImportToListStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class ResultGetImportToListStatus implements java.io.Serializable {
	private com.marketo.www.mktows.ImportToListStatusEnum status;

	private java.util.Calendar startedTime;

	private java.util.Calendar endedTime;

	private java.lang.Integer estimatedTime;

	private java.lang.Integer estimatedRows;

	private java.lang.Integer rowsImported;

	private java.lang.Integer rowsFailed;

	private java.lang.Integer rowsIgnored;

	private java.lang.String importSummary;

	public ResultGetImportToListStatus() {
	}

	public ResultGetImportToListStatus(
			com.marketo.www.mktows.ImportToListStatusEnum status,
			java.util.Calendar startedTime, java.util.Calendar endedTime,
			java.lang.Integer estimatedTime, java.lang.Integer estimatedRows,
			java.lang.Integer rowsImported, java.lang.Integer rowsFailed,
			java.lang.Integer rowsIgnored, java.lang.String importSummary) {
		this.status = status;
		this.startedTime = startedTime;
		this.endedTime = endedTime;
		this.estimatedTime = estimatedTime;
		this.estimatedRows = estimatedRows;
		this.rowsImported = rowsImported;
		this.rowsFailed = rowsFailed;
		this.rowsIgnored = rowsIgnored;
		this.importSummary = importSummary;
	}

	/**
	 * Gets the status value for this ResultGetImportToListStatus.
	 * 
	 * @return status
	 */
	public com.marketo.www.mktows.ImportToListStatusEnum getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this ResultGetImportToListStatus.
	 * 
	 * @param status
	 */
	public void setStatus(com.marketo.www.mktows.ImportToListStatusEnum status) {
		this.status = status;
	}

	/**
	 * Gets the startedTime value for this ResultGetImportToListStatus.
	 * 
	 * @return startedTime
	 */
	public java.util.Calendar getStartedTime() {
		return startedTime;
	}

	/**
	 * Sets the startedTime value for this ResultGetImportToListStatus.
	 * 
	 * @param startedTime
	 */
	public void setStartedTime(java.util.Calendar startedTime) {
		this.startedTime = startedTime;
	}

	/**
	 * Gets the endedTime value for this ResultGetImportToListStatus.
	 * 
	 * @return endedTime
	 */
	public java.util.Calendar getEndedTime() {
		return endedTime;
	}

	/**
	 * Sets the endedTime value for this ResultGetImportToListStatus.
	 * 
	 * @param endedTime
	 */
	public void setEndedTime(java.util.Calendar endedTime) {
		this.endedTime = endedTime;
	}

	/**
	 * Gets the estimatedTime value for this ResultGetImportToListStatus.
	 * 
	 * @return estimatedTime
	 */
	public java.lang.Integer getEstimatedTime() {
		return estimatedTime;
	}

	/**
	 * Sets the estimatedTime value for this ResultGetImportToListStatus.
	 * 
	 * @param estimatedTime
	 */
	public void setEstimatedTime(java.lang.Integer estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	/**
	 * Gets the estimatedRows value for this ResultGetImportToListStatus.
	 * 
	 * @return estimatedRows
	 */
	public java.lang.Integer getEstimatedRows() {
		return estimatedRows;
	}

	/**
	 * Sets the estimatedRows value for this ResultGetImportToListStatus.
	 * 
	 * @param estimatedRows
	 */
	public void setEstimatedRows(java.lang.Integer estimatedRows) {
		this.estimatedRows = estimatedRows;
	}

	/**
	 * Gets the rowsImported value for this ResultGetImportToListStatus.
	 * 
	 * @return rowsImported
	 */
	public java.lang.Integer getRowsImported() {
		return rowsImported;
	}

	/**
	 * Sets the rowsImported value for this ResultGetImportToListStatus.
	 * 
	 * @param rowsImported
	 */
	public void setRowsImported(java.lang.Integer rowsImported) {
		this.rowsImported = rowsImported;
	}

	/**
	 * Gets the rowsFailed value for this ResultGetImportToListStatus.
	 * 
	 * @return rowsFailed
	 */
	public java.lang.Integer getRowsFailed() {
		return rowsFailed;
	}

	/**
	 * Sets the rowsFailed value for this ResultGetImportToListStatus.
	 * 
	 * @param rowsFailed
	 */
	public void setRowsFailed(java.lang.Integer rowsFailed) {
		this.rowsFailed = rowsFailed;
	}

	/**
	 * Gets the rowsIgnored value for this ResultGetImportToListStatus.
	 * 
	 * @return rowsIgnored
	 */
	public java.lang.Integer getRowsIgnored() {
		return rowsIgnored;
	}

	/**
	 * Sets the rowsIgnored value for this ResultGetImportToListStatus.
	 * 
	 * @param rowsIgnored
	 */
	public void setRowsIgnored(java.lang.Integer rowsIgnored) {
		this.rowsIgnored = rowsIgnored;
	}

	/**
	 * Gets the importSummary value for this ResultGetImportToListStatus.
	 * 
	 * @return importSummary
	 */
	public java.lang.String getImportSummary() {
		return importSummary;
	}

	/**
	 * Sets the importSummary value for this ResultGetImportToListStatus.
	 * 
	 * @param importSummary
	 */
	public void setImportSummary(java.lang.String importSummary) {
		this.importSummary = importSummary;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResultGetImportToListStatus))
			return false;
		ResultGetImportToListStatus other = (ResultGetImportToListStatus) obj;
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
				&& ((this.status == null && other.getStatus() == null) || (this.status != null && this.status
						.equals(other.getStatus())))
				&& ((this.startedTime == null && other.getStartedTime() == null) || (this.startedTime != null && this.startedTime
						.equals(other.getStartedTime())))
				&& ((this.endedTime == null && other.getEndedTime() == null) || (this.endedTime != null && this.endedTime
						.equals(other.getEndedTime())))
				&& ((this.estimatedTime == null && other.getEstimatedTime() == null) || (this.estimatedTime != null && this.estimatedTime
						.equals(other.getEstimatedTime())))
				&& ((this.estimatedRows == null && other.getEstimatedRows() == null) || (this.estimatedRows != null && this.estimatedRows
						.equals(other.getEstimatedRows())))
				&& ((this.rowsImported == null && other.getRowsImported() == null) || (this.rowsImported != null && this.rowsImported
						.equals(other.getRowsImported())))
				&& ((this.rowsFailed == null && other.getRowsFailed() == null) || (this.rowsFailed != null && this.rowsFailed
						.equals(other.getRowsFailed())))
				&& ((this.rowsIgnored == null && other.getRowsIgnored() == null) || (this.rowsIgnored != null && this.rowsIgnored
						.equals(other.getRowsIgnored())))
				&& ((this.importSummary == null && other.getImportSummary() == null) || (this.importSummary != null && this.importSummary
						.equals(other.getImportSummary())));
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
		if (getStatus() != null) {
			_hashCode += getStatus().hashCode();
		}
		if (getStartedTime() != null) {
			_hashCode += getStartedTime().hashCode();
		}
		if (getEndedTime() != null) {
			_hashCode += getEndedTime().hashCode();
		}
		if (getEstimatedTime() != null) {
			_hashCode += getEstimatedTime().hashCode();
		}
		if (getEstimatedRows() != null) {
			_hashCode += getEstimatedRows().hashCode();
		}
		if (getRowsImported() != null) {
			_hashCode += getRowsImported().hashCode();
		}
		if (getRowsFailed() != null) {
			_hashCode += getRowsFailed().hashCode();
		}
		if (getRowsIgnored() != null) {
			_hashCode += getRowsIgnored().hashCode();
		}
		if (getImportSummary() != null) {
			_hashCode += getImportSummary().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ResultGetImportToListStatus.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ResultGetImportToListStatus"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("status");
		elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.marketo.com/mktows/", "ImportToListStatusEnum"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startedTime");
		elemField.setXmlName(new javax.xml.namespace.QName("", "startedTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("endedTime");
		elemField.setXmlName(new javax.xml.namespace.QName("", "endedTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("estimatedTime");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "estimatedTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("estimatedRows");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "estimatedRows"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rowsImported");
		elemField.setXmlName(new javax.xml.namespace.QName("", "rowsImported"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rowsFailed");
		elemField.setXmlName(new javax.xml.namespace.QName("", "rowsFailed"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rowsIgnored");
		elemField.setXmlName(new javax.xml.namespace.QName("", "rowsIgnored"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("importSummary");
		elemField
				.setXmlName(new javax.xml.namespace.QName("", "importSummary"));
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
