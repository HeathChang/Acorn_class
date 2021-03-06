package com.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.MemberDTO;

@Repository /////////////////////////////////////
public class MemberDAO {
	@Autowired
	SqlSessionTemplate template;// μλμ£Όμ , root-context.xml

	public void memberAdd(MemberDTO m) {
		System.out.println("template" + template);
		int n = template.insert("MemberMapper.memberAdd", m);
	}

	public MemberDTO login(Map<String, String> map) {
		MemberDTO dto = template.selectOne("MemberMapper.login", map);
		return dto;
	}
}