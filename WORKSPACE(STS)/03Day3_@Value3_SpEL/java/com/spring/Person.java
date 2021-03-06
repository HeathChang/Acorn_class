package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	@Value("#{yyy.username}")
	String username;
	@Value("#{yyy.age}") //숫자도 ""로 묶어야댐 
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
		System.out.println("get함수에서의 UserName: "+username);

		return username;
	}
	public void setUsername(String username) {
		System.out.println("set함수에서의 UserName: "+username);
		this.username = username;
	}
	public int getAge() {
		System.out.println("get함수에서의 age: "+age);

		return age;
	}
	public void setAge(int age) {
		System.out.println("set함수에서의 age: "+age);

		this.age = age;
	}

	
	
}
	