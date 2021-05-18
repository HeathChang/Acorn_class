package com.example.service;

import java.util.List;

import com.example.dto.Dept;

public interface DBService {

	List<Dept> list();

	int insert(Dept dept);

	int update(Dept dept);

	int deleteByDeptno(int i);

}