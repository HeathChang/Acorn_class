package com.example.dao;

import java.util.Arrays;
import java.util.List;

public class DBOracleDAO implements DBDao{

	@Override
	public List<String> list(){
		return Arrays.asList("OracleDAO","홍길동","이순신");
	}
}
