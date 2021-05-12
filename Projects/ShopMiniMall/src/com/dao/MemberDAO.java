package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.GoodsDTO;
import com.dto.MemberDTO;

public class MemberDAO {

	public int memberAdd(SqlSession session, MemberDTO dto) {

		int n = session.insert("MemberMapper.memberAdd", dto);

		return n;
	}

	public int idCheck(SqlSession session, String userid) {
		// TODO Auto-generated method stub
		int n = session.selectOne("MemberMapper.idCheck", userid);

		return n;
	}

	public MemberDTO login(SqlSession session, HashMap<String, String> map) {
		MemberDTO dto = session.selectOne("MemberMapper.login", map);
		return dto;
	}

	public MemberDTO mypage(SqlSession session, String id) {
		MemberDTO dto = session.selectOne("MemberMapper.mypage", id);
		return dto;
	}

	public int memberUpdate(SqlSession session, MemberDTO dto2) {
		int r = session.update("MemberMapper.memberUpdate", dto2);
		return r;
	}

	public String idSearch(SqlSession session, MemberDTO dto) {
		String uid=session.selectOne("MemberMapper.idSearch",dto);
		return uid;
	}


}
