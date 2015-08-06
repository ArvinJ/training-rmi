package training.rmi.consumer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import training.rmi.api.Hello;

/**
 * 启动RMI客户端
 * 
 * @author Percy
 * 
 */
public class HelloClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// 在RMI服务注册表中查找名称为RHello的对象，并调用其上的方法
			Hello hello = (Hello) Naming.lookup("rmi://localhost:8888/Hello");
			System.out.println(hello.helloWorld("Percy"));
		} catch (NotBoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
