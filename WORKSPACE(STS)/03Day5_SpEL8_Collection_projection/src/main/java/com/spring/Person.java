package com.spring;

import java.util.List;

public class Person {
	String username;
	int age;
	List<Cat> list;
	
	List<String> catNames;
	List<String> catAges;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, int age, List<Cat> list, List<String> catNames, List<String> catAges) {
		super();
		this.username = username;
		this.age = age;
		this.list = list;
		this.catNames = catNames;
		this.catAges = catAges;
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
	public List<String> getCatNames() {
		return catNames;
	}
	public void setCatNames(List<String> catNames) {
		this.catNames = catNames;
	}
	public List<String> getCatAges() {
		return catAges;
	}
	public void setCatAges(List<String> catAges) {
		this.catAges = catAges;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", list=" + list + ", catNames=" + catNames
				+ ", catAges=" + catAges + "]";
	}
	
	
}