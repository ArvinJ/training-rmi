package training.rmi.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {

	/**
	 * 练习带有参数的方法使用<br>
	 * 
	 * <pre>
	 * 说明：
	 * 如果参数是对象，那么必须使用序列化，因为是网络调用
	 * </pre>
	 * 
	 * @param name
	 * @return
	 * @throws RemoteException
	 */
	public String helloWorld(String name) throws RemoteException;

}
