package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.dao.DBMySQLDAO;
import com.example.dao.DBOracleDAO;

@Configuration

public class JavaConfig {

	@Bean(value = "yyy")
	@Profile("dev")
	public DBOracleDAO dao() {
		return new DBOracleDAO();
	}

	
	@Bean(value = "xxx")
	@Profile("prod")
	public DBMySQLDAO dao2() {
		return new DBMySQLDAO();
	}
}
