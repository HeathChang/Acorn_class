package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	//servlet-context.xml에서 /main처리함 
	/*
	 * @RequestMapping public String main() { return "main"; //main.jsp
	 * servlet-context.xml에 등록 }
	 */
	// /main요청은 serlvet-context.xml에 view-controller에서  직접 main.jsp로 지정
	// controller에 작성 안함. 
	
	  @RequestMapping("/aaa")
	  public String main() { 
		  return "main";  
		  }
	 
	

}
