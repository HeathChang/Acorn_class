package com.service;

import org.springframework.stereotype.Component;

@Component //Component-Scan으로 자동 bean 등록이 됨. id는 소문자로 시작하는 클래스 이름 
public class DeptService { //deptService가 id가 된다. 
	public DeptService() {
		super();
		System.out.println("기본 생성자 출력");
		}

	public String getService() {
		return "DeptService.getService() 호출됨";
	}
}
