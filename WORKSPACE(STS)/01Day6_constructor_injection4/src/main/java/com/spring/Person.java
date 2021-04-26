package com.spring;

public class Person {
	String username;
	int age;
	Cat cat;

	public Person(String username, int age, Cat cat) { // 매개변수 있는 생성자 overloading
		super();
		System.out.println("1. Person 생성자 호출: " + username + "\t" + age);
		this.username = username;
		this.age = age;
		this.cat=cat;
	}

	public String getInfo() {
		return "원피스";
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", cat=" + cat + "]";
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

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	
	

}
