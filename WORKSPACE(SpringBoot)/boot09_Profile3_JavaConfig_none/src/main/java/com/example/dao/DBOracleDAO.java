package com.example.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;


@Repository
@Profile("dev")
public class DBOracleDAO implements DBDao{

	@Override
	public List<String> list(){
		return Arrays.asList("OracleDAO","홍길동","이순신");
	}
}
