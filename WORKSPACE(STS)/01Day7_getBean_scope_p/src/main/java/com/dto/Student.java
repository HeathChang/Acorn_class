package com.dto;

import java.util.Set;

public class Student {
	String username="장덕배";
	int age=44;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String username, int age) {
		super();
		this.username = username;
		this.age = age;
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
		return "Student [username=" + username + ", age=" + age + "]";
	}

	
	

	
	
}
