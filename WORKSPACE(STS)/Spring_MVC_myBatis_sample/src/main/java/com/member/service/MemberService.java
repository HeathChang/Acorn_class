package com.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DetpDAO;
import com.dto.DeptDTO;

@Service////////////////////// component 스캔으로 자동 빈등록
public class MemberService {
	@Autowired
	DetpDAO dao;

	public List<DeptDTO> list(){
		return dao.list();
	}

}
