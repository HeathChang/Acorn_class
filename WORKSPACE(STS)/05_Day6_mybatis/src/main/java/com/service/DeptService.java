package com.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptService {
	@Autowired
	DeptDAO dao;
	@Autowired
	SqlSessionTemplate session;
	
	public List<DeptDTO> select(){
		return dao.select(session);
	}
	/*
	 * public int add(DeptDTO dto) { return dao.insert(dto); } public int
	 * update(DeptDTO dto) { return dao.update(dto); } public int delete(int deptno)
	 * { return dao.delete(deptno); }
	 */

	
}
