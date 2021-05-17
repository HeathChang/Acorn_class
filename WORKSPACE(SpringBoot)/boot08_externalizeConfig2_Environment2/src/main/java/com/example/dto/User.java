package com.example.dto;

public class User { // application.properties에서 설정

	String username;

	int age;

	

	public User(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}



	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + "]";
	}

}
