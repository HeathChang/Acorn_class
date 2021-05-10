package com.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MemberDAO;
import com.dto.MemberDTO;

@Service
public class MemberSerivce {
	@Autowired
	MemberDAO dao;
	
	public void memberAdd(MemberDTO m) {
		dao.memberAdd(m);
	}

	public MemberDTO login(Map<String, String> map) {
		MemberDTO dto = dao.login(map); 
		return dto;
	}

	

	public MemberDTO myPage(String userid) {
		// TODO Auto-generated method stub
		MemberDTO dto= dao.myPage(userid);
		return dto;
	}
}
