package com.example.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller // Servlet-context.xml 24번째 줄때문에 사용 가능 
public class TestController {
	
	@RequestMapping("/kkk") //http://localhost:포트번호/test/kkk && "/" 라고만 치면 바로 들어가짐 
	public String xxx() {
		System.out.println("xxx메소드 ===========");
		//리턴값은 .jsp 정보, -viewResolver 사용안하는 경우 페이지 경로/파일이름.jsp까지 작성
		return "/WEB-INF/views/home.jsp"; //뷰페이지 정보
		//return home.jsp → InternalResourceViewResolver 필요함. 
		
	}
	@RequestMapping("/kkk2") //http://localhost:포트번호/test/kkk && "/" 라고만 치면 바로 들어가짐 
	public String xxx2() {
		System.out.println("yyy메소드 ===========");
		//리턴값은 .jsp 정보, -viewResolver 사용안하는 경우 페이지 경로/파일이름.jsp까지 작성
		return "/WEB-INF/views/home2.jsp"; //뷰페이지 정보
		//return home.jsp → InternalResourceViewResolver 필요함. 
		
	}
	
}
