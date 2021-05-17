package com.example.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;


@Repository
@Profile("prod")
public class DBMySQLDAO implements DBDao {

	@Override
	public List<String> list() {
		return Arrays.asList("홍길동2", "이순신2");
	}

}
