package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DBDAO;

public class DeptMySqlService implements DeptService {
	@Autowired
	DBDAO dao;

	public DeptMySqlService(DBDAO dao) {
		System.out.println("DeptService DAO 생성자 호출됨");
		this.dao = dao;
	}

	public DBDAO getDao() {
		return dao;
	}

	public DeptMySqlService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setDao(DBDAO dao) {
		System.out.println("DeptService DAO set함수 호출됨");
		this.dao = dao;
	}

	@Override
	public List<String> getList() {
		System.out.println("Hi from DeptMySqlService");
		return dao.getList();
	}


}
