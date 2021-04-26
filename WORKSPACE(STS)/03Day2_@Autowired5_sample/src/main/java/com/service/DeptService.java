package com.service;

import java.util.List;

import com.dao.DBDAO;

public interface DeptService {
	public DBDAO getDao();
	public void setDao(DBDAO dao);
	public List<String> getList();
}