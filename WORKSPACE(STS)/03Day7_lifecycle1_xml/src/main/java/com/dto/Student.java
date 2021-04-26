package com.dto;

public class Student {
	String name;
	int age;
	public Student() {
		super();
		System.out.println("기본 생성자 호출");
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public void getInfo() {
		System.out.println("getInfo()=============");
	}
	
	//init-method: 초기화 작업
	public void aaa() {
		System.out.println("init-method.aaa");
	}
	//destory-method: 자원 반납 
	public void bbb() {
		System.out.println("desotry-method.bbb");
	}
	
	
	
	
}
