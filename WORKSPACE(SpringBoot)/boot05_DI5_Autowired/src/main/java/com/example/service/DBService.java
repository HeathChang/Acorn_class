package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.DBDao;

////@ 없음 => 생성등록 .JAVA 파일이 필요함 , dao주입 받아야함
public class DBService {
	@Autowired
	DBDao dao;

	public List<String> list() {
		return dao.list();
	}

}
