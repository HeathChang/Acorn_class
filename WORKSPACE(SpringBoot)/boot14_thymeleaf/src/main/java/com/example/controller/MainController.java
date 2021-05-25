package com.example.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dto.User;

@Controller
public class MainController {

	@Autowired
	ServletContext application;

	// 1. 기본
	@GetMapping("/")
	public String m() {
		return "main";  //main.html 
	}
	
	// 2. 바인딩 - ${...}
	@GetMapping("/a2")
	public String a2(Model m, HttpSession session) {
		m.addAttribute("username", "홍길동1");
		session.setAttribute("username", "홍길동2");
		application.setAttribute("username", "홍길동3");//ServletContext
		return "main2";//main2.html 
	}
	
	// 3. I18N - #{....}
	@GetMapping("/a3")
	public String a3(Locale xxx) {
		System.out.println("current locale:" + xxx);
		return "main3";
	}

	// 4. 객체속성 - *{....}
	@GetMapping("/a4")
	public String a4(Model m) {
		m.addAttribute("user", new User("홍길동", 20));
		return "main4";//main4.html 
	}	
	
	// 5. 링크 - @{...}
	@GetMapping("/a5")
	public String a5() {
		return "main5";//main5.html 
	}	
	
	@GetMapping("/a55")
	public String a55(@RequestParam String username, @RequestParam int age) {
		System.out.println(username + "\t" + age);
		return "main5_1";//main5_1.html 
	}
	

	// 6. 리터럴 - ${...}
	@GetMapping("/a6")
	public String a6(Model m) {
		m.addAttribute("user", new User("홍길동", 20));
		return "main6";//main6.html 
	}

	// 7. 조건 (if, 3항, switch) 및 반복
	@GetMapping("/a7")
	public String a7(Model m) {
		m.addAttribute("user", new User("홍길동", 20));
		m.addAttribute("user2", new User("hong", 20));

		List<User> list = 
				Arrays.asList(new User("홍길동1", 20), 
						new User("홍길동2", 30),
						new User("홍길동3", 40));
		m.addAttribute("userList", list);
		return "main7";
	}

	// 8. 속성값 변경 및 static 파일 적용 : th:attr
	@GetMapping("/a8")
	public String a8(Model m) {
		m.addAttribute("user", new User("홍길동", 20));
		m.addAttribute("imgWidth", 100);/////
		m.addAttribute("imgHeight", 200);/////////
		m.addAttribute("xyz", "kkk2");

		return "main8";
	}

	// 9. 조각 포함 - th:fragment,  th:insert, th:replace
	@GetMapping("/a9")
	public String a9() {
		return "main9";//main9.html 
	}
}
