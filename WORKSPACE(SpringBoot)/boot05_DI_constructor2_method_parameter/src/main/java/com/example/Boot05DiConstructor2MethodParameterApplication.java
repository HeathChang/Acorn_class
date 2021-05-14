package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dao.DBOracleDAO;
import com.example.service.DBOracleService;

@SpringBootApplication
public class Boot05DiConstructor2MethodParameterApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Boot05DiConstructor2MethodParameterApplication.class, args);
		DBOracleService service = ctx.getBean("myService", DBOracleService.class);
		System.out.println(service.getList());
		DBOracleDAO dao= ctx.getBean("dao", DBOracleDAO.class);
		System.out.println(dao.getList());
		
	}

}
