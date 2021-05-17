package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.dao.DBOracleDAO;

@Configuration
@Profile("dev")

public class JavaConfig {

	
	
	@Bean(value = "yyy")
	public DBOracleDAO dao() {
		return new DBOracleDAO();
	}
}
