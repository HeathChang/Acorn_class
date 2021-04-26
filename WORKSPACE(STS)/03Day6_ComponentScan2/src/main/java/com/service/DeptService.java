package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.entry.DeptDTO;

@Service // id= service 소문자ㅏ 클래스 이름 사용
@Scope(value = "singleton")
public class DeptService { // deptService가 id가 된다.
	@Autowired
	DeptDAO dao;

	public DeptDAO getDao() {
		System.out.println("getDAO 실행");
		return dao;
	}

	public void setDao(DeptDAO dao) {
		System.out.println("setDAO 실행");
		this.dao = dao;
	}


	public DeptService(DeptDAO dao) {
		super();
		this.dao = dao;
	}

	public DeptService() {
		super();
		System.out.println("기본 생성자 출력");
	}

	public DeptDTO getInfo() {
		return dao.getInfo();
	}
}
