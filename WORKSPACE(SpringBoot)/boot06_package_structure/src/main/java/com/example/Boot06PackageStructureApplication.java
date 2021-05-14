package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.service.DBService;

@SpringBootApplication
public class Boot06PackageStructureApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=
				SpringApplication.run(Boot06PackageStructureApplication.class, args);
		DBService service= ctx.getBean("myService", DBService.class);
		List<String> list= service.list();
		System.out.println(list);
		
	}

}
