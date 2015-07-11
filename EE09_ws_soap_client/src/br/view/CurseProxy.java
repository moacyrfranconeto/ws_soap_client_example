package br.view;

public class CurseProxy implements br.view.Curse {
  private String _endpoint = null;
  private br.view.Curse curse = null;
  
  public CurseProxy() {
    _initCurseProxy();
  }
  
  public CurseProxy(String endpoint) {
    _endpoint = endpoint;
    _initCurseProxy();
  }
  
  private void _initCurseProxy() {
    try {
      curse = (new br.view.CurseServiceLocator()).getCurse();
      if (curse != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)curse)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)curse)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (curse != null)
      ((javax.xml.rpc.Stub)curse)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.view.Curse getCurse() {
    if (curse == null)
      _initCurseProxy();
    return curse;
  }
  
  public java.lang.String getListStudentByDiscipline(java.lang.String discipline) throws java.rmi.RemoteException{
    if (curse == null)
      _initCurseProxy();
    return curse.getListStudentByDiscipline(discipline);
  }
  
  
}