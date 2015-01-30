/**
 * MktMktowsApiService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public interface MktMktowsApiService extends javax.xml.rpc.Service {
	public java.lang.String getMktowsApiSoapPortAddress();

	public com.marketo.www.mktows.MktowsPort getMktowsApiSoapPort()
			throws javax.xml.rpc.ServiceException;

	public com.marketo.www.mktows.MktowsPort getMktowsApiSoapPort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
