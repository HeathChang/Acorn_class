package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	public DeptDAO dao;
	
	
	public DeptService(DeptDAO dao) { 
		this.dao=dao;
	}
	




	public List<String>getList(){
		return dao.getList();
	}

	
}
