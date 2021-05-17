package com.example.service;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DBService implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposalBean.destory()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("IniitalizingBean.afterPropertiesSet()");
	}

	// callback
	public void xxx() {
		System.out.println("initMethod.xxx()");
	}

	public void yyy() {
		System.out.println("destroyMethod.yyy()");
	}

	@PostConstruct
	public void init() {
		System.out.println("@PostConstruct.init()");
	}

	@PreDestroy
	public void dest() {
		System.out.println("@PreDestroy.dest()");
	}

	public List<String> getList() {
		return Arrays.asList("홍길동", "이순신");
	}

}
