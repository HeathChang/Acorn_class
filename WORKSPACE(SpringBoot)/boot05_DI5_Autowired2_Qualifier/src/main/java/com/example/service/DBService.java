package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.dao.DBDao;

////@ 없음 => 생성등록 .JAVA 파일이 필요함 , dao주입 받아야함
public class DBService {
	@Autowired
	@Qualifier("xxx") //빈중에서 yyy id를 이용해서 선택적 자동 주입
	DBDao dao;

	public List<String> list() {
		return dao.list();
	}

}
