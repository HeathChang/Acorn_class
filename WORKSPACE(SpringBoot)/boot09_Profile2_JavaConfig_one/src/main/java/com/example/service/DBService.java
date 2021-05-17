package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DBDao;

@Service("myService")
public class DBService {

	@Autowired
	DBDao dao;
	
	public List<String> list(){
		return dao.list();
	}


	public DBService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBService(DBDao dao) {
		super();
		this.dao = dao;
	}

	public DBDao getDao() {
		return dao;
	}

	public void setDao(DBDao dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "DBService [dao=" + dao + "]";
	}

	
	

}
