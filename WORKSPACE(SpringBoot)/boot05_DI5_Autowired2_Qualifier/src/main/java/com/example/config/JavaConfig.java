package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.dao.DBMySQLDAO;
import com.example.dao.DBOracleDAO;
import com.example.service.DBService;

@Configuration // configuration.xml 역할
public class JavaConfig {
	@Bean("xxx")
	public DBOracleDAO dao1() {
		return new DBOracleDAO();
	}
	@Bean("yyy")
	public DBMySQLDAO dao2() {
		return new DBMySQLDAO();
	}

	@Bean("myService")
	public DBService service() {
		DBService service = new DBService();
		return service;
	}
}
