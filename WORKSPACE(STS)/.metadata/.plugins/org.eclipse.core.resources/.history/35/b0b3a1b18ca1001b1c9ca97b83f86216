package com.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	String username;
	int age;
	//@Resource(name="pet02") // set함수를 통해 하나의 객체를 주입받음, 여러개 객체의 경우 에러
	//여러개 bean 중 id 지정 주입 (원래 두개 있으면, error)
	@Autowired(required=false)
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
