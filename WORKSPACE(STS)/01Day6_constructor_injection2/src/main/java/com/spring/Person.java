package com.spring;

public class Person {
	public Person(String x) { //매개변수 있는 생성자 overloading
		super();
		System.out.println("1. Person 생성자(x) 호출: "+x);
	}
	public Person(String x,String y) { //매개변수 있는 생성자 overloading
		super();
		System.out.println("2. Person 생성자(x,y) 호출: "+x+"\t"+y);
	}
	public Person(String xx,int yy) { //매개변수 있는 생성자 overloading
		super();
		System.out.println("3.Person 생성자(xx,yy) 호출: "+xx+"\t"+yy);
	}
	public String getInfo() {
		return "드래곤볼";
	}


}
