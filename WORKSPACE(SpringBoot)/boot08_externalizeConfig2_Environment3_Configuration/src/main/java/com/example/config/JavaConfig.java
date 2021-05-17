package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.example.dto.User;

@Configuration
@PropertySource(value = "classpath:jdbc.properties")
@EnableConfigurationProperties(MyConfigurationProperties.class) //변수를 읽어와서 자동 생성
public class JavaConfig {

	@Autowired
	MyConfigurationProperties p;
	
	
	@Bean(value = "myUser")
	public User service() {
		return new User(p.getUsername(), p.getAge());
	}
}
