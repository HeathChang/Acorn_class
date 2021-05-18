package com.example.service;

import java.util.List;

import com.example.dto.Dept;

public interface DBService {
	public abstract List<Dept> list();
	public abstract int insert(Dept dto);
	public abstract int deleteByDeptno( int deptno);
	public abstract int update( Dept dto);
}
