package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	public DeptDAO dao;

	
	public List<String>getList(){
		return dao.getList();
	}
///////////////////////////////////////
	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
}
