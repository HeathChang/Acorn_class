package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String aaa() {
		return "main";
	}

	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public ModelAndView bbb(LoginDTO dto, HttpSession session) { // 매개변수로 세션 직접 받음
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "홍길동");
		mav.setViewName("main2");
		return mav;
	}

	// 3. 리턴타입 DTO-> 모델만 알려줌. view는 유추,: url이 뷰페이지의 이름이 됨
	@RequestMapping(value = "/ccc", method = RequestMethod.GET)
	public LoginDTO xxx() { // 매개변수로 세션 직접 받음
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto; //
	}

	// 3-2. 리턴타입 DTO-> 모델만 알려줌. view는 유추,: url이 뷰페이지의 이름이 됨
	@RequestMapping(value = "/ddd", method = RequestMethod.GET)
	@ModelAttribute("xxx")
	public LoginDTO xxx2() { // 매개변수로 세션 직접 받음
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto; // ddd.jsp 키값은 @ModelAttribute("xxx")//키 값은 xxx가 됨.
	}

	// 4. 리턴타입 DTO-> 모델만 알려줌. view는 유추,: url이 뷰페이지의 이름이 됨 eee.jsp
	@RequestMapping(value = "/eee", method = RequestMethod.GET)
	@ModelAttribute("yyy")
	public ArrayList<String> eee() { // 매개변수로 세션 직접 받음
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동01");
		list.add("홍길동02");
		list.add("홍길동03");
		return list; // ddd.jsp 키값은 @ModelAttribute("xxx")//키 값은 xxx가 됨.
	}
	// 5. void -> 모델과 뷰를 전부 모름 
	@RequestMapping(value = "/fff", method = RequestMethod.GET)
	public void fff(HttpServletRequest request) { // 매개변수로 세션 직접 받음
		request.setAttribute("username", "홍길동");
	}
	// 6. void -> 모델과 뷰를 전부 모름 -> ggg.jsp
	@RequestMapping(value = "/ggg", method = RequestMethod.GET)
	public void ggg(Model m) { // 매개변수로 세션 직접 받음
		m.addAttribute("username","홍길동");
	}

}
