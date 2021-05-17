package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.dao.DBMySQLDAO;
import com.example.dao.DBOracleDAO;

@Configuration
@Profile("prod")

public class JavaConfig2 {

	@Bean(value = "xxx")
	public DBMySQLDAO dao() {
		return new DBMySQLDAO();
	}
}
