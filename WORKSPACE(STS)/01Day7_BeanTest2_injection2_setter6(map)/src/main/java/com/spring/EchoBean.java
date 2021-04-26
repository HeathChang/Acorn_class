package com.spring;

import java.util.Map;

public class EchoBean {

	Map<String,AnotherBean> map;

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoBean(Map<String, AnotherBean> valueList) {
		super();
		this.map = valueList;
	}

	public Map<String, AnotherBean> getValueList() {
		return map;
	}

	public void setValueList(Map<String, AnotherBean> valueList) {
		this.map = valueList;
	}

	@Override
	public String toString() {
		return "EchoBean []";
	}

	public Map<String, AnotherBean> getMap() {
		return map;
	}

	public void setMap(Map<String, AnotherBean> map) {
		this.map = map;
	}

	
	

}
