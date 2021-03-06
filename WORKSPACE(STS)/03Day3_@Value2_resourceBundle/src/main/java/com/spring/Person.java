package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	@Value("${value.name}")
	String username;
	@Value("${value.age}") //숫자도 ""로 묶어야댐 
	int age;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}
	