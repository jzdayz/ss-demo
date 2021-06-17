package io.github.jzdayz.ssdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
public class SsDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SsDemoApplication.class, args);
		Object securityMethodInterceptor = run.getBean("securityMethodInterceptor");
	}

}
