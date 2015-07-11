/**
 * CurseService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.view;

public interface CurseService extends javax.xml.rpc.Service {
    public java.lang.String getCurseAddress();

    public br.view.Curse getCurse() throws javax.xml.rpc.ServiceException;

    public br.view.Curse getCurse(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
