package com.spring;

public class Dog {
	String dogName;
	int dogAge;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String dogName, int dogAge) {
		super();
		this.dogName = dogName;
		this.dogAge = dogAge;
	}
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public int getDogAge() {
		return dogAge;
	}
	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}
	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + ", dogAge=" + dogAge + "]";
	}
	
	
	
}
