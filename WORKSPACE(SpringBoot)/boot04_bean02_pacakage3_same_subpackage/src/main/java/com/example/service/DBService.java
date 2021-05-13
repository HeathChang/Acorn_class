package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

//부트에서 프로젝트 생성시 , 지정한 패키지 경로가 같을시, com.example로 패키지를 구성하면 자동으로 componentScan을 하고 빈으로 등록함. 
//@ComponentScan 필요없음. 
@Service("myService")

public class DBService {
	public List<String> getList(){
		return Arrays.asList("홍길동","이순신");
	}
}