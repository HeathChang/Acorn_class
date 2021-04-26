package com.spring;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	String username;
	int age;
	Cat cat;
	
	public Cat getCat() {
		return cat;
	}
	
	@Required //injection 필수 요청, 반드시 설정 되어야함. -set 함수에 설정
	public void setCat(Cat cat) {
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
