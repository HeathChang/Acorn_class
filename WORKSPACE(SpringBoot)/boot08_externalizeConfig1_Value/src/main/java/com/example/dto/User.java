package com.example.dto;

import org.springframework.beans.factory.annotation.Value;

public class User { //application.properties에서 설정
	@Value("${user.username}")
	String username;
	
	@Value("${user.age}")
	int age;

	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + "]";
	}
	

}
