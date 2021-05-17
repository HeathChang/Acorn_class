package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;



@Configuration

public class JavaConfig {

	@Autowired
	Environment env;
	
	@Bean
	public ServerConnector getServer() {
		return new ServerConnector(env.getProperty("environments.url"),env.getProperty("environments.name"));

	}
}
