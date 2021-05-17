package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.config.ServerConnector;

@SpringBootApplication
public class Boot09Profile4ExternalizeConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=
				SpringApplication.run(Boot09Profile4ExternalizeConfigurationApplication.class, args);
		ServerConnector server= ctx.getBean("getServer", ServerConnector.class);
		System.out.println(server);
		
	}

}
