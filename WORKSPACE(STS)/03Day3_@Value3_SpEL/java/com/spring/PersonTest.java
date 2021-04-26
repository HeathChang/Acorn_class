package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("com/spring/person.xml");
		 Person person=ctx.getBean("xxx",Person.class);
		 System.out.println(person.toString());
	}

}
