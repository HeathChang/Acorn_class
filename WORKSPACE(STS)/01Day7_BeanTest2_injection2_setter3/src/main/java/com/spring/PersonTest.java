package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("person.xml");
		Cat cat = ctx.getBean("one",Person.class).getCat();
		System.out.println(cat.toString());
	}

}
