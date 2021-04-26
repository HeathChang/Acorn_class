package com.dao;

import org.springframework.stereotype.Repository;

import com.entry.DeptDTO;

@Repository //이름을 명시하지않으면 기본적으로 소문자 클래스명으로 설정됨. 실제 DB접속할 애들에 사용
public class DeptDAO {

	public DeptDTO getInfo() {
		return new DeptDTO(100,"관리","서울");
	}
	 
}
