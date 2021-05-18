package com.example.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.DeptDAO;
import com.example.dto.DeptDTO;

@Service("deptService")
public class DeptService {

	@Autowired
	DeptDAO dao;
	// SpringBoot에서는 자동으로 TransactionManager가 활성화된다.   
	//logback에서 DEBUG 레벨로 실행하여 확인가능
	@Transactional
	public void tx() {
		dao.insert( new DeptDTO(95, "aa", "bb"));
		dao.delete(88);// 에러 발생 시킴 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public ArrayList<DeptDTO> select(){
		return (ArrayList<DeptDTO>)dao.select();
	}
	public DeptDTO selectById(int deptno){
		return dao.selectById(deptno);
	}
	public int insert(int deptno, String dname, String loc){
		DeptDTO dto = new DeptDTO(deptno, dname, loc);
		return dao.insert(dto);
	}
	public int update(int deptno, String dname, String loc){
		DeptDTO dto = new DeptDTO(deptno, dname, loc);
		return dao.update(dto);
	}
	public int delete(int deptno){
		return dao.delete(deptno);
	}
	

}
