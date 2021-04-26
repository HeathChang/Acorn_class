package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("file:\\C:\\upload\\person.xml");
		// [\\] 을 사용해야한다	
		Person p1 =ctx.getBean("xxx",Person.class);
		System.out.println(p1.getInfo());
	}

}
