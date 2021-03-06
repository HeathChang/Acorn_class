package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Person {
	String username;
	int age;
	@Autowired //생성자 변수, set함수위 사용 가능:자동주입
	Cat cat;
	
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
