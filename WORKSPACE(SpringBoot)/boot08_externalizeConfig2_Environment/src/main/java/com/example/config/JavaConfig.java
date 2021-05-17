package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.example.dto.User;

@Configuration
public class JavaConfig {

	
	
		@Autowired
		Environment env; //application.properties 변수를 읽어서 key/value로 저장하는 객체
	
		@Bean(value="myUser")
		public User service() {
			return new User(env.getProperty("user.username"),Integer.parseInt(env.getProperty("user.age")));
		}
}
