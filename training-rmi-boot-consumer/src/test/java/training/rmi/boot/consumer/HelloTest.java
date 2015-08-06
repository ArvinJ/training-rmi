package training.rmi.boot.consumer;

import java.rmi.RemoteException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import training.rmi.api.Hello;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TrainingBootApplication.class)
public class HelloTest {
	@Autowired
	private Hello hello;
	
	@Test
	public void test() {
		System.out.println("====================:" + (hello == null));
		try {
			System.out.println("====================:" + hello.helloWorld("Percy"));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
