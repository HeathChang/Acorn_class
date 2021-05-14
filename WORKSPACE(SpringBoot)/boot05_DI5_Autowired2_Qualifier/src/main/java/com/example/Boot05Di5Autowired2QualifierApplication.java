package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.service.DBService;

@SpringBootApplication
public class Boot05Di5Autowired2QualifierApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Boot05Di5Autowired2QualifierApplication.class, args);
		DBService service = ctx.getBean("myService", DBService.class);
		System.out.println(service.list());
	}

}
