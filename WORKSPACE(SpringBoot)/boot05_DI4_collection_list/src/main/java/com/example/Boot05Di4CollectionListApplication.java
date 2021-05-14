package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dao.DBDao;
import com.example.service.DBService;

@SpringBootApplication
public class Boot05Di4CollectionListApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Boot05Di4CollectionListApplication.class, args);
		DBService service = ctx.getBean("myService", DBService.class);
		List<DBDao> list=service.getList();
		for (DBDao s : list) {
			System.out.println(s.getList());
		}
		System.out.println("=================");
		System.out.println(service.getList().get(0).getList());
		System.out.println(service.getList().get(1).getList());
		
		
	
	
	}

}
