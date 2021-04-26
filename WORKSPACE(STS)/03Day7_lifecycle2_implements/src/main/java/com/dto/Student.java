package com.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	String name;
	int age;

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposavleBean.destory()====================");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitalizingBean.afterPropertiesSet=============");
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

	public void getInfo() {
		System.out.println("getInfo()=============");
	}

}
