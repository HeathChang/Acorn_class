package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("echo.xml");
		DeptService service1 =ctx.getBean("deptService",DeptService.class); 
		DeptService service2 =ctx.getBean(DeptService.class); 
	
		System.out.println(service1.getInfo());
		System.out.println(service2.getInfo());
	}

}
