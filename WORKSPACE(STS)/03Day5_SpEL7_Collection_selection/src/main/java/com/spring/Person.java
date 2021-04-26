package com.spring;

import java.util.List;

public class Person {
	String username;
	int age;
	List<Cat> list;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, int age, List<Cat> list) {
		super();
		this.username = username;
		this.age = age;
		this.list = list;
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
	public List<Cat> getList() {
		return list;
	}
	public void setList(List<Cat> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", list=" + list + "]";
	}
	
	
}