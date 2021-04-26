package com.dto;
import java.util.Map;
import java.util.Properties;

public class Student {
	String username;
	int age;
	Map<String,Cat> mapCat;
	Properties phones; //Map<String,Object> && Properties<String,String>처럼 K,V 둘다 String 인 친구
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String username, int age, Map<String, Cat> mapCat, Properties phones) {
		super();
		this.username = username;
		this.age = age;
		this.mapCat = mapCat;
		this.phones = phones;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<String, Cat> getMapCat() {
		return mapCat;
	}
	public void setMapCat(Map<String, Cat> mapCat) {
		this.mapCat = mapCat;
	}
	public Properties getPhones() {
		return phones;
	}
	public void setPhones(Properties phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", age=" + age + ", mapCat=" + mapCat + ", phones=" + phones + "]";
	}

	
	
}
