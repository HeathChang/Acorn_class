package com.dto;

public class LoginDTO {
	private String userid;
	private String passwd;
	public LoginDTO() {
		super();
		System.out.println("기본생성자 호출==========");
		// TODO Auto-generated constructor stub
	}
	public LoginDTO(String userid, String passwd) {
		super();
		System.out.println("LoginDTO(String userid, String passwd)=======");
		this.userid = userid;
		this.passwd = passwd;
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
	@Override
	public String toString() {
		return "LoginDTO [userid=" + userid + ", passwd=" + passwd + "]";
	}
	

}
