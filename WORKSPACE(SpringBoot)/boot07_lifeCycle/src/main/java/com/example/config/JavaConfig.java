package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.DBService;

@Configuration
public class JavaConfig {
	@Bean(value="myService",initMethod="xxx",destroyMethod = "yyy")
	public DBService service() {
		return new DBService();
	}
	
}
