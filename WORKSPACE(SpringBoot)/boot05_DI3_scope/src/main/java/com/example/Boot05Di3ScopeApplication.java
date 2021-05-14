package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dao.DBOracleDAO;
import com.example.service.DBOracleService;

@SpringBootApplication
public class Boot05Di3ScopeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Boot05Di3ScopeApplication.class, args);
		DBOracleService service = ctx.getBean("myService", DBOracleService.class);
		DBOracleService service2 = ctx.getBean("myService2", DBOracleService.class);

		System.out.println(service.getDao().hashCode() + "==?" + service2.getDao().hashCode());
		System.out.println(service.getDao() == service2.getDao());
		System.out.println(service.hashCode() == service2.hashCode());
		System.out.println(service.hashCode() == service.hashCode());
	}

}
