package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("myService")
public class TargetService {

	public String sayEcho(String name, int s) {
		System.out.println("sayEcho 호출");
		return "hi " + name;

	}

	public void aaa() {
		System.out.println("aaa()");
	}

}
