package com.spring;

public class Person {
	String username;
	int age;

	public Person(String username, int age) { // 매개변수 있는 생성자 overloading
		super();
		System.out.println("1. Person 생성자 호출: " + username + "\t" + age);
		this.username = username;
		this.age = age;
	}

	public String getInfo() {
		return "드래곤볼";
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + "]";
	}

}
