package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.controller.TestController;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
// /main, /home만 동작 
	System.out.println("preHandle====="+handler);
	HttpSession session= request.getSession();
	//servelt-context.xml에서 /main /home만 처리하도록 설정
	if(session.getAttribute("login")==null) {  //session 검사 
		//세션정보가 없으면 loginForm으로 이동 
		System.out.println("로그인이 안되어있어서, loginForm으로 이동");
		response.sendRedirect("loginForm");  //servelt-context.xml에서 /main /home만 처리하도록 설정	
	}
	return true; // true계속 진행  
	//return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {	
		/*
		 * System.out.println("PostHandler================");
		 * modelAndView.setViewName("main"); //login.jsp로 view 페이지 지정
		 * modelAndView.addObject("data", "홍길동"); //데이터 지정
		 */		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion=====");
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("afterConcurrentHandlingStarted=====");
	}
	
}
