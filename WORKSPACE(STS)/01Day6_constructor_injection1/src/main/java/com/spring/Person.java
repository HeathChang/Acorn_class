package com.spring;

public class Person {
	public Person(String x) { //매개변수 있는 생성자 overloading
		super();
		System.out.println("Person 생성자 호출: "+x);
	}

	public String getName() {
		return "드래곤볼";
	}
}
