package com.service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MemberDAO;
import com.dto.MemberDTO;

public class MemberService {

	public int memberAdd(MemberDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		System.out.println(session);
		int n = 0;
		try {
			MemberDAO dao = new MemberDAO();
			n = dao.memberAdd(session, dto);
			session.commit();
		} finally {
			session.close();
		}

		return n;

	}

	public int idCheck(String userid) {
		SqlSession session = MySqlSessionFactory.getSession();
		System.out.println(session);
		int count = 0;
		try {
			MemberDAO dao = new MemberDAO();
			count = dao.idCheck(session, userid);
			System.out.println("Service count: "+count);
			
		} catch (Exception e) {
			e.printStackTrace();
	
		}finally {
			session.close();
		}

		return count;

	}

	public MemberDTO login(HashMap<String, String> map) {
		SqlSession session = MySqlSessionFactory.getSession();
		MemberDTO dto=null;
		
		try {
			MemberDAO dao = new MemberDAO();
			dto= dao.login(session, map);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
	
		}finally {
			session.close();
		}

		return dto;

	}

	public MemberDTO mypage(String id) {
		SqlSession session = MySqlSessionFactory.getSession();
		MemberDTO dto=null;
		
		try {
			MemberDAO dao = new MemberDAO();
			dto= dao.mypage(session, id);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
	
		}finally {
			session.close();
		}

		return dto;
	}

	public int memberUpdate(MemberDTO dto2) {
		SqlSession session = MySqlSessionFactory.getSession();
		System.out.println(session);
		int r= 0;
		try {
			MemberDAO dao = new MemberDAO();
			r = dao.memberUpdate(session, dto2);
			session.commit();
			System.out.println("Update result: "+r);
		} catch (Exception e) {
			e.printStackTrace();
	
		}finally {
			session.close();
		}

		return r;

	}

	public String idSearch(MemberDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		String uid=null;
		
		try {
			MemberDAO dao = new MemberDAO();
			uid= dao.idSearch(session, dto);
		} catch (Exception e) {
			e.printStackTrace();
	
		}finally {
			session.close();
		}

		return uid;
	}


}
