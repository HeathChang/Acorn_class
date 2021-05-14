package com.example.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository   ///////////////////////////////////////
public class DBOralceDao implements DBDao {  //////////////////
	@Override
	public List<String> list(){
		return Arrays.asList("홍길동","이순신");
	}
}
