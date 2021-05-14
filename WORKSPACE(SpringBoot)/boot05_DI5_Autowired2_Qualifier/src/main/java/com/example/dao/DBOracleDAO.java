package com.example.dao;

import java.util.Arrays;
import java.util.List;

////  @ 없음 => 생성등록 .JAVA 파일이 필요함 
public class DBOracleDAO implements DBDao {

	@Override
	public List<String> list() {
		return Arrays.asList("홍길동", "이순신");
	}

}
