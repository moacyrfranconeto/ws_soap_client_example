package br.call;

import java.net.MalformedURLException;
import java.net.URL;

import br.view.Curse;
import br.view.CurseProxy;
import br.view.CurseService;
import br.view.CurseServiceLocator;
import br.view.CurseSoapBindingStub;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class MCall {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		URL url = new URL("http://127.0.0.1:8081/EE09_ws_soap_server/services/Curse?wsdl");
		QName qname = new QName("http://view.br", "CurseService");
		
		Service ws = Service.create(url, qname);
		
	
	}

}
