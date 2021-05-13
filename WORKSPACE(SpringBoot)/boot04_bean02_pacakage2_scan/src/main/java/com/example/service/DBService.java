package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("myService")
//configuration 필요없이 component-scan을 이용해 @Service, @Repository 등 검색 자동 빈등록
//id=myService
public class DBService {
	public List<String> getList(){
		return Arrays.asList("홍길동","이순신");
	}
}