package com.dto;

import java.util.Set;

public class Student {
	String username;
	int age;
	Set<Cat> cats;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String username, int age, Set<Cat> cats) {
		super();
		this.username = username;
		this.age = age;
		this.cats = cats;
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
	public Set<Cat> getCats() {
		return cats;
	}
	public void setCats(Set<Cat> cats) {
		this.cats = cats;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", age=" + age + "]";
	}
	
	
	
	

	
	
}
