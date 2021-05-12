package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;



public class MyEncodingFilter implements Filter {

   
    public MyEncodingFilter() {
    }

	
	public void destroy() {
		System.out.println("destory");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response); //체인 연결 
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init");
	}

}
