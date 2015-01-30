/**
 * MktMktowsApiServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public class MktMktowsApiServiceLocator extends org.apache.axis.client.Service
		implements com.marketo.www.mktows.MktMktowsApiService {

	public MktMktowsApiServiceLocator() {
	}

	public MktMktowsApiServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public MktMktowsApiServiceLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for MktowsApiSoapPort
	private java.lang.String MktowsApiSoapPort_address = "https://347-iat-677.mktoapi.com/soap/mktows/2_7";

	public java.lang.String getMktowsApiSoapPortAddress() {
		return MktowsApiSoapPort_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String MktowsApiSoapPortWSDDServiceName = "MktowsApiSoapPort";

	public java.lang.String getMktowsApiSoapPortWSDDServiceName() {
		return MktowsApiSoapPortWSDDServiceName;
	}

	public void setMktowsApiSoapPortWSDDServiceName(java.lang.String name) {
		MktowsApiSoapPortWSDDServiceName = name;
	}

	public com.marketo.www.mktows.MktowsPort getMktowsApiSoapPort()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(MktowsApiSoapPort_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getMktowsApiSoapPort(endpoint);
	}

	public com.marketo.www.mktows.MktowsPort getMktowsApiSoapPort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			com.marketo.www.mktows.MktowsApiSoapBindingStub _stub = new com.marketo.www.mktows.MktowsApiSoapBindingStub(
					portAddress, this);
			_stub.setPortName(getMktowsApiSoapPortWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setMktowsApiSoapPortEndpointAddress(java.lang.String address) {
		MktowsApiSoapPort_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (com.marketo.www.mktows.MktowsPort.class
					.isAssignableFrom(serviceEndpointInterface)) {
				com.marketo.www.mktows.MktowsApiSoapBindingStub _stub = new com.marketo.www.mktows.MktowsApiSoapBindingStub(
						new java.net.URL(MktowsApiSoapPort_address), this);
				_stub.setPortName(getMktowsApiSoapPortWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException(
				"There is no stub implementation for the interface:  "
						+ (serviceEndpointInterface == null ? "null"
								: serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName,
			Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("MktowsApiSoapPort".equals(inputPortName)) {
			return getMktowsApiSoapPort();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
				"MktMktowsApiService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
					"http://www.marketo.com/mktows/", "MktowsApiSoapPort"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("MktowsApiSoapPort".equals(portName)) {
			setMktowsApiSoapPortEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(
					" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
