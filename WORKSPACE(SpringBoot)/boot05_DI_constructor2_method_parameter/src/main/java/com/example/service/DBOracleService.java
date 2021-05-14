package com.example.service;

import java.util.List;

import com.example.dao.DBOracleDAO;
////@ 없음 => 생성등록 .JAVA 파일이 필요함 , dao주입 받아야함
public class DBOracleService {
	DBOracleDAO dao;   //@Autowired 없음 주입 받아야함
	
	public DBOracleService(DBOracleDAO dao) {//생성자를 통해서 주입받도록 구현 
		this.dao= dao;
	}
	
	public List<String> getList(){
		return dao.getList();
	}

	public DBOracleDAO getDao() {
		return dao;
	}

	public void setDao(DBOracleDAO dao) {
		this.dao = dao;
	}
	

}
