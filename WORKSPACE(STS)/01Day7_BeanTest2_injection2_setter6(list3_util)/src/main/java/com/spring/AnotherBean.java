package com.spring;

public class AnotherBean {
	private String name;

	@Override
	public String toString() {
		return "AnotherBean [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AnotherBean(String name) {
		super();
		this.name = name;
	}

	
	

}
