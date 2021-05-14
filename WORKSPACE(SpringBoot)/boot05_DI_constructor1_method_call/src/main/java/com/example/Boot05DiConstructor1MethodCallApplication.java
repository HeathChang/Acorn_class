package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dao.DBOracleDAO;
import com.example.service.DBOracleService;

@SpringBootApplication//서브패키지 밑 @Configuration 자동 등록 사용가능함. 
public class Boot05DiConstructor1MethodCallApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Boot05DiConstructor1MethodCallApplication.class, args);
		DBOracleService service = ctx.getBean("myService", DBOracleService.class);
		System.out.println(service.getList());
		DBOracleDAO dao= ctx.getBean("dao", DBOracleDAO.class);
		System.out.println(dao.getList());
		
	}

}
