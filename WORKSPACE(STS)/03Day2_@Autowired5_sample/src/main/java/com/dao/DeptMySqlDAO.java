package com.dao;

import java.util.Arrays;
import java.util.List;

public class DeptMySqlDAO implements DBDAO{

	
	
	public List<String> getList() {

		return Arrays.asList("d", "e", "f");
	}

}
