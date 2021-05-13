package com.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.MemberDTO;


@Repository
public class MemberDAO {
	@Autowired
	SqlSessionTemplate session;
	
	public int insert(MemberDTO dto) {
		return session.insert("MemberMapper.insert",dto);
	}

	public MemberDTO login(String id) {
		// TODO Auto-generated method stub
		return session.selectOne("MemberMapper.login",id);
	}

}
