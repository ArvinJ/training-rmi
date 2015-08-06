package training.rmi.provider;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import training.rmi.api.Hello;

public class HelloImpl extends UnicastRemoteObject implements Hello {

	private static final long serialVersionUID = 1L;
	
	public HelloImpl() throws RemoteException {
		super();
	}

	@Override
	public String helloWorld(String name) throws RemoteException {
		return "Hello " + name;
	}

}
