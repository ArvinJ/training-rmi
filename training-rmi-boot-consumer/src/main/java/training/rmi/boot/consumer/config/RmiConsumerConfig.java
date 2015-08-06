package training.rmi.boot.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import training.rmi.api.Hello;

@Configuration
public class RmiConsumerConfig {
	
	@Bean
	public Hello hello() {
	    RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
	    rmiProxyFactoryBean.setServiceUrl("rmi://localhost:5000/Hello");
	    rmiProxyFactoryBean.setServiceInterface(Hello.class);
	    rmiProxyFactoryBean.afterPropertiesSet();
	    return (Hello) rmiProxyFactoryBean.getObject();
	}

}
