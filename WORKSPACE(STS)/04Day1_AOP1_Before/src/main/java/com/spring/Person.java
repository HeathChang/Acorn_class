package com.spring;

public class Person {
	public void getInfo() {
		System.out.println("getInfo() 호출됨==========");
	}
	//main 핵심 기능 - advisor 를 필요하는 함수 
	public void mesg() {
		//main -> mesg 호출: advisor 코두+ 핵심기능 구현 
		//advisor 함수는 따로 구현해 aspect에서 자동 호출
		//mesg는 핵심 기능 구현 
		System.out.println("Person.mesg()============");
	}
}
