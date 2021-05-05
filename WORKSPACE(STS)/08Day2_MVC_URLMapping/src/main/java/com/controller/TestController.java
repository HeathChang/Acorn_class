package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		return "main";
	}

	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String aaa() { // 매개변수로 세션 직접 받음
		System.out.println("aaa호출==============");
		return "main";
	}
	//2. /aaa2 && /aaa3 두개다 사용 가능 
	@RequestMapping(value = {"/aaa2","/aaa3"}, method = RequestMethod.GET)
	public String aaa2() { // 매개변수로 세션 직접 받음
		System.out.println("aaa호출==============");
		return "main";
	}
	//3. /bbb* 앞이 bbb로 시작하면 모두가능
	@RequestMapping(value = {"/bbb*"}, method = RequestMethod.GET)
	public String aaa3() { // 매개변수로 세션 직접 받음
		System.out.println("bbb호출==============");
		return "main";
	}
	
	//4. /ccc/* 뒤에 아무거나 와도 가능 /ccc/aa  && ccc/bsdf 가능
	@RequestMapping(value = {"/ccc/*"}, method = RequestMethod.GET)
	public String aaa4() { // 매개변수로 세션 직접 받음
		System.out.println("aaa4호출==============");
		return "main";
	}
	//5. ddd/dasd/eqwe/ 가능
	@RequestMapping(value = {"/ddd/**"}, method = RequestMethod.GET)
	public String aaa5() { // 매개변수로 세션 직접 받음
		System.out.println("aaa5호출==============");
		return "main";
	}
	//6. eee/dasd/eqwe/aaa 가능
	@RequestMapping(value = {"/eee/**/aaa"}, method = RequestMethod.GET)
	public String aaa6() { // 매개변수로 세션 직접 받음
		System.out.println("aaa6호출==============");
		return "main";
	}
	//6. hhh/abcd/xxx/1234 가능: 적은 값이 userid와 passwd가 된다. 
	@RequestMapping(value = {"/hhh/{userid}/xxx/{passwd}"}, method = RequestMethod.GET)
	public String aaa7(@PathVariable("userid") String userid, @PathVariable("passwd") String passwd) { // 매개변수로 세션 직접 받음
		System.out.println("aaa7호출==============");
		System.out.println(userid+"\t"+passwd);
		return "main";
	}

}
