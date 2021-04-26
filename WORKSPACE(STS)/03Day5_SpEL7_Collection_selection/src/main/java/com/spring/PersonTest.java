package com.spring;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("person.xml");
		Person person = ctx.getBean("onePerson1",Person.class);
		System.out.println("person: "+person.toString());
		
		List<Cat> list=person.getList();
		System.out.println("list: "+list);
		for (Cat c : list) {
			System.out.println(c);
		}
			
	}

}
