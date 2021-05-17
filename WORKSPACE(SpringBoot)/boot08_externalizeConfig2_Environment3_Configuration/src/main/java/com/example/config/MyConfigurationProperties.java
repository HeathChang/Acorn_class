package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="user")
public class MyConfigurationProperties { //user.username =tester // age=20 
	String username;
	int age;
	public MyConfigurationProperties() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyConfigurationProperties(String username, int age) {
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
		return "MyConfigurationProperties [username=" + username + ", age=" + age + "]";
	}
	
}
