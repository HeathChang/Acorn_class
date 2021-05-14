package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DBDao;

@Service("myService")  ///////////////  main에서 사용하기 위한  id설정 
public class DBOracleService implements DBService{////////////////
	
	@Autowired
	DBDao dao;    //interface타입 선언 
	
	@Override
	public List<String> list(){
		return dao.list();
	}

}
