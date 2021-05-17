package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.service.DBService;

@SpringBootApplication
public class Boot08ExternalizeConfig1ValueApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx=
				SpringApplication.run(Boot08ExternalizeConfig1ValueApplication.class, args);
		DBService service= ctx.getBean("myService", DBService.class);
		System.out.println(service.list());
		
	}

}
