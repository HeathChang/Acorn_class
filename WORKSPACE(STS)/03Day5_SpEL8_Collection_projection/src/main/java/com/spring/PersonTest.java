package com.spring;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("person.xml");
		Person person = ctx.getBean("onePerson3",Person.class);
		System.out.println("person: "+person.toString());
		System.out.println(person.getUsername());
		System.out.println(person.getUsername());
		
		
		List<String> names=person.getCatNames();
		for (String x : names) {
			System.out.println("고양이 이름: "+x);
		}
		List<String> ages=person.getCatAges();
		for (String x : ages) {
			System.out.println("고양이 나이: "+x);
		}
		
		
			
	}

}
