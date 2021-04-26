package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	public DeptDAO dao;
	public DeptService(DeptDAO dao) { //dao 주입받음: new 없음 
		this.dao=dao;
	}
	public List<String>getList(){
		return dao.getList();
	}

	
}
