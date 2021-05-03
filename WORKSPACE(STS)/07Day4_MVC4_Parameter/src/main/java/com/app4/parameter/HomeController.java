package com.app4.parameter;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("/main")
	public String xx() {
		System.out.println("main()=======");
		return "main";
	}

	@RequestMapping("/aaa")
	public ModelAndView xx2() { //전달 데이터 + 뷰페이지 정보를 모두 가진  객체 mav
		System.out.println("/aaa===========");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username","홍길동");
		mav.addObject("age","20");
		mav.setViewName("main2"); //뷰페이지 이름,  main2.jsp
		return mav;
	}
	
}
