package training.rmi.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import training.rmi.api.Hello;

@Configuration
public class RmiConfig {
	@Bean
	public RmiServiceExporter registerService(Hello  hello) {
		RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
		rmiServiceExporter.setServiceName("Hello");
		rmiServiceExporter.setService(hello);
		rmiServiceExporter.setServiceInterface(Hello.class);
		rmiServiceExporter.setRegistryPort(5000);
		return rmiServiceExporter;
	}
}
