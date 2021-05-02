package com.dto;

import java.util.Arrays;

public class LoginDTO {
	private String userid;
	private String passwd;
	String[] phone;
	String[] chk;
	
	
	

	@Override
	public String toString() {
		return "LoginDTO [userid=" + userid + ", passwd=" + passwd + ", phone=" + Arrays.toString(phone) + ", chk="
				+ Arrays.toString(chk) + "]";
	}

	public String[] getPhone() {
		return phone;
	}

	public void setPhone(String[] phone) {
		this.phone = phone;
	}

	public String[] getChk() {
		return chk;
	}

	public void setChk(String[] chk) {
		this.chk = chk;
	}

	public LoginDTO(String userid, String passwd, String[] phone, String[] chk) {
		super();
		System.out.println("생성자 3개 =========");
		this.userid = userid;
		this.passwd = passwd;
		this.phone = phone;
		this.chk = chk;
	}

	public LoginDTO() {
		super();
		System.out.println("기본생성자 호출==========");
		// TODO Auto-generated constructor stub
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	

}
