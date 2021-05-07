package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.MemberDTO;

@Repository ////////////////////////////////////
public class MemberDAO {
	@Autowired
	SqlSessionTemplate template;

	public void memberAdd(MemberDTO m) {
		int n = template.insert("MemberMapper.memberAdd", m);
		System.out.println("성공여부: "+n);
	}

}
