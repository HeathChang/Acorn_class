package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	String username;
	int age;
	boolean isMarried;
	double weight;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String username, int age, boolean isMarried, double weight) {
		super();
		this.username = username;
		this.age = age;
		this.isMarried = isMarried;
		this.weight = weight;
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

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", isMarried=" + isMarried + ", weight=" + weight
				+ "]";
	}

}
