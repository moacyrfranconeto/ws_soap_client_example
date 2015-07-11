package br.call;

import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import br.view.Curse;
import br.view.CurseServiceLocator;

public class Call {

	public static void main(String[] args) throws ServiceException, RemoteException {
		// TODO Auto-generated method stub
		
		String parametro = new String("EES00");
		CurseServiceLocator cs = new CurseServiceLocator();
		Curse c = cs.getCurse();
		
		
		String ret = c.getListStudentByDiscipline(parametro);
		
		System.out.println("Ws client Entrada: " +parametro);
		System.out.println("ws client Retorno: " +ret);
		
	}

}
