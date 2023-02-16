package jfc.engine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import jfc.service.Impl.ServiceImpl;
import jfc.service.Interfaces.IService;

@Configuration
public class PortalConfiguration {

	@Bean
	public IService cServices() {
		return new ServiceImpl();
	}

}