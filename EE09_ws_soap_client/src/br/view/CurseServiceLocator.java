/**
 * CurseServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.view;

public class CurseServiceLocator extends org.apache.axis.client.Service implements br.view.CurseService {

    public CurseServiceLocator() {
    }


    public CurseServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CurseServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Curse
    private java.lang.String Curse_address = "http://127.0.0.1:8081/EE09_ws_soap_server/services/Curse";

    public java.lang.String getCurseAddress() {
        return Curse_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CurseWSDDServiceName = "Curse";

    public java.lang.String getCurseWSDDServiceName() {
        return CurseWSDDServiceName;
    }

    public void setCurseWSDDServiceName(java.lang.String name) {
        CurseWSDDServiceName = name;
    }

    public br.view.Curse getCurse() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Curse_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCurse(endpoint);
    }

    public br.view.Curse getCurse(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.view.CurseSoapBindingStub _stub = new br.view.CurseSoapBindingStub(portAddress, this);
            _stub.setPortName(getCurseWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCurseEndpointAddress(java.lang.String address) {
        Curse_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.view.Curse.class.isAssignableFrom(serviceEndpointInterface)) {
                br.view.CurseSoapBindingStub _stub = new br.view.CurseSoapBindingStub(new java.net.URL(Curse_address), this);
                _stub.setPortName(getCurseWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Curse".equals(inputPortName)) {
            return getCurse();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://view.br", "CurseService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://view.br", "Curse"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Curse".equals(portName)) {
            setCurseEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
