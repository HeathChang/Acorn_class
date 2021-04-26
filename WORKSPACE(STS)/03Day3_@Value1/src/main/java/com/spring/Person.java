package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	@Value("Value에서 나온 이름")
	String username;
	@Value("12") //숫자도 ""로 묶어야댐 
	int age;
	//만약 xml에서 property로 값들어갈시,(우선순위) property > value 임. 없을경우, value 뜸 
	
	
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
	