package com.spring;

public class EchoBean {
	AnotherBean xxx;
	
	public String sayEcho() {
		return "hello";
	}

	public EchoBean() {
		System.out.println("기본 생성자");
		}

	public AnotherBean getXxx() {
		return xxx;
	}
	public void setXxx(AnotherBean xxx) {
		System.out.println("SetMesg(String mesg)");
		this.xxx = xxx;
	}
	
	
}
