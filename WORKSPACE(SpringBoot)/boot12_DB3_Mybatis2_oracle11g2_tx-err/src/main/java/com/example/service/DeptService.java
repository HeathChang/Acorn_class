package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.DeptDAO;
import com.example.dto.DeptDTO;

@Service("deptService")
public class DeptService {
	@Autowired
	DeptDAO dao;

	@Transactional
	public void tx() {
		dao.insert(new DeptDTO(65, "aa", "bb"));
		System.out.println("insert완료=======================================");
		dao.delete(88); // 에러발생시킴
	}
}
