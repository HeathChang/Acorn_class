package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("person.xml");
		Person person = ctx.getBean("one",Person.class);
		System.out.println(person.getCat().toString());
		System.out.println(person.getDog().toString());
		System.out.println(person.toString());
		
		
	}

}
