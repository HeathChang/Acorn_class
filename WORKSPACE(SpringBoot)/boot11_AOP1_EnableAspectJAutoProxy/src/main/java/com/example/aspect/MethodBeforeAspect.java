package com.example.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MethodBeforeAspect {
	public MethodBeforeAspect() {
		System.out.println("기본생성자===========");
	}

	@Pointcut("execution(public*say*(..))")
	public void say() {
	}
	
	@Before("say()")
	public void beforeLoggin (Joinpoint joinPoint) {
		String methodName=joinPoint.getsi //여기까지함.. 
	}
}
