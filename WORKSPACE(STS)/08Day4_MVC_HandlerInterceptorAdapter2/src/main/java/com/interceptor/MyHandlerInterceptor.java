package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.controller.TestController;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter{///////////////// 1. 
//모든 url 요청에 먼저 동작 => controller 를 진행 , 멈추거나 선택 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//url 요청 먼저 실행  -
	System.out.println("preHandle======================"+handler);
	HttpSession session = request.getSession();
	if(session.getAttribute("login")==null) { //세션정보가 없을 경우, 로그인 폼으로 이동, 주의) 모든 주소에 대한 처리가 이루어짐 
		//response.sendRedirect("loginForm"); //최초 loginForm 호출시, handler 호출 문제 발생 -> 무한반복 
	}
	return true; //controller 계속 실행 
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle==================="+handler);
		HandlerMethod method= (HandlerMethod) handler;
		if(method.getBean() instanceof TestController) { //사용중인 controller 객체 얻기 --TestController를 사용한 경우, postHandler를 사용해 부페이지를 바꾸고 데이터 전달가능.  
			modelAndView.setViewName("login"); //login.jsp view 페이지 지정
			modelAndView.addObject("data", "홍길동"); //데이ㅓ 지정 
		}
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion==============");
	}
	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("afterConcurrentHandlingStarted============");
	}
	
}
