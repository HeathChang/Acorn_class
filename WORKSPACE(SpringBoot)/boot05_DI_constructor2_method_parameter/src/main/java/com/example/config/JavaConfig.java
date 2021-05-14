package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.dao.DBOracleDAO;
import com.example.service.DBOracleService;

@Configuration // configuration.xml 역할
public class JavaConfig {

	@Bean
	@Scope("prototype")
	public DBOracleDAO dao() {
		return new DBOracleDAO();
	}

	@Bean("myService") // id
	public DBOracleService service() {// 자동 주입. 매개 변수로 @Autowired
		DBOracleService service = new DBOracleService(dao()); // 생성자를 통한 주입
		return service;
	}


}
