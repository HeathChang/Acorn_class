package com.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MemberDAO;
import com.dto.MemberDTO;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;
	
	public int register(MemberDTO dto) {
		
		return dao.insert(dto);
	}

	public MemberDTO login(String id) {
		// TODO Auto-generated method stub
		return dao.login(id);
	}

}
