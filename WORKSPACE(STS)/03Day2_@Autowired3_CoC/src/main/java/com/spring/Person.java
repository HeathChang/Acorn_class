package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Person {
	String username;
	int age;
	@Autowired(required=false) //Autowired 만 있을경우, 해당 빈 없으면 error && 이때, required=false는 필수가 아님 
	Cat cat;
	//CoC개념: 생성된 bean이 여러개인 경우 변수명이 같은 ref 주입
	
	
	public Cat getCat() {
		return cat;
	}
	
	
	public void setCat(Cat cat) {
		System.out.println("set");
		this.cat = cat;
	}	
	
	public Person() {
		super();
		System.out.println("기본 생성자===================");
	}
	public Person(String username, int age, Cat cat) {
		super();
		this.username = username;
		this.age = age;
		this.cat = cat;
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

	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", cat=" + cat + "]";
	}


}
