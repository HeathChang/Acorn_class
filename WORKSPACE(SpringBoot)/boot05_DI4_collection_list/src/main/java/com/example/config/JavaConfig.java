package com.example.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.dao.DBDao;
import com.example.dao.DBMySQLDAO;
import com.example.dao.DBOracleDAO;
import com.example.service.DBService;

@Configuration//configuration.xml 역할 
public class JavaConfig {
	@Bean   
	public DBOracleDAO dao1() {
		return new DBOracleDAO();
	}
	@Bean
	public DBMySQLDAO dao2() {
		return new DBMySQLDAO();
	}

	@Bean ("myService")
	public DBService service(List<DBDao> list) {
		DBService service = new DBService(list); 
		return service;
	}
}
