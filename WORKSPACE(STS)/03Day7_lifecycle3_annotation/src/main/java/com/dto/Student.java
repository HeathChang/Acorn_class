package com.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	String name;
	int age;

	public void getInfo() {
		System.out.println("getInfo()=============");
	}

	// init-method: 초기화 작업
	@PostConstruct
	public void aaa() {
		System.out.println("init-method.aaa");
	}

	@PreDestroy
	public void bbb() {
		System.out.println("desotry-method.bbb");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
