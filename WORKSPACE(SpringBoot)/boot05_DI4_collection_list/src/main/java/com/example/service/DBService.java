package com.example.service;

import java.util.List;

import com.example.dao.DBDao;
////@ 없음 => 생성등록 .JAVA 파일이 필요함 , dao주입 받아야함
public class DBService {
	List<DBDao> list; //dao 두개를 모두 담아서 main에서 사용 (타입을 interface타입으로 선언)
	
	public DBService (List<DBDao> list) { //dao를 담은 list를 주입 받음
		System.out.println("DBService 생성자");
		this.list=list;
	}
	
	
	public List<DBDao> getList(){
		return list;
	}
	
	

}
