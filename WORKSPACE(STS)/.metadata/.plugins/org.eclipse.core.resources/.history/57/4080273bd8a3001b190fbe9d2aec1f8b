package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect //핵심기능에 필요한 advisor 기능을 구현한 클래스 
public class PersonAfterThrowingAspect {
	
	@AfterThrowing(pointcut = "execution( * getInfo(..))",	throwing ="x")
	public void getInforAfterReturning(JoinPoint point, Object x) {
		System.out.println("aspect.getInfoAfterThrowing   "+point.getTarget().getClass()+"\t"+ x);
	}
}
