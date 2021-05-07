package com.service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.config.MySqlSessionFactory;
import com.dao.MemberDAO;
import com.dto.MemberDTO;

@Service //////////////////// componenet-scan

public class MemberService {

	@Autowired
	MemberDAO dao;

	public void memberAdd(MemberDTO m) {
		dao.memberAdd(m);

	}

}
