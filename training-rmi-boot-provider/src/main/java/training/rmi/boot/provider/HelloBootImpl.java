package training.rmi.boot.provider;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import training.rmi.api.Hello;

@Service
public class HelloBootImpl implements Hello {

	@Override
	public String helloWorld(String name) throws RemoteException {
		return "Hello Boot " + name;
	}

}
