package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// 두개의 xml로드
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext
				("person1.xml",
				"person2.xml");

		// person 정보 찍기
		Person person = ctx.getBean("onePerson", Person.class);
		System.out.println(person);
	}

}
