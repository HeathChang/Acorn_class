package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	TestService service;
	Person person;
	
	@RequestMapping(value="/xxx")
	public String sayEcho() {
		System.out.println(service.xx() +"\t"+ person.toString());
		return "login";
	}

	public TestService getService() {
		return service;
	}

	public void setService(TestService service) {
		this.service = service;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public TestController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestController(TestService service, Person person) {
		super();
		this.service = service;
		this.person = person;
	}

	@Override
	public String toString() {
		return "TestController [service=" + service + ", person=" + person + "]";
	}
	
}
