package com.spring;

public class Dog {
	String catName;
	int catAge;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String catName, int catAge) {
		super();
		this.catName = catName;
		this.catAge = catAge;
	}
	
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public int getCatAge() {
		return catAge;
	}
	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
	@Override
	public String toString() {
		return "Cat [catName=" + catName + ", catAge=" + catAge + "]";
	}
	
	
}
