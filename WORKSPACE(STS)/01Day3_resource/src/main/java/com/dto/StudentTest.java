package com.dto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("stu.xml");
		Student stu1= ctx.getBean("xxx",Student.class);
		System.out.println(stu1.getName());
		
		Student stu2=(Student)ctx.getBean("xxx");
		System.out.println(stu2.getName());
	}

}
