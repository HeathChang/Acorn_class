package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.dto.User;

@Configuration
public class JavaConfig {

	
		@Bean(value="myUser")
		public User user() {
			return new User();
		}
}
