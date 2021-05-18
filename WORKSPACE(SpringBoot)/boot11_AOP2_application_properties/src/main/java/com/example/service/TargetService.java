package com.example.service;

import org.springframework.stereotype.Service;

@Service("myService")
public class TargetService {
	//주의점 : Spring Aop는 proxy기반으로 메소드는 public, static(x)
	public String sayEcho(String name, int s) {
		System.out.println("sayEcho메소드 호출==================");
		return "Hi!  " + name;
	}
	
	
	
	public void aaa() {
		System.out.println("aaa()");
	}
}
