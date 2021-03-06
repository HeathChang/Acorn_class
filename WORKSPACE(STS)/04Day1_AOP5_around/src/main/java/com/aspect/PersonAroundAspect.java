package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect // 핵심기능에 필요한 advisor 기능을 구현한 클래스
public class PersonAroundAspect {

	@Around("execution( * getInfo(..))")
	public Object getInfoAround(ProceedingJoinPoint pjp) throws Throwable { // 리턴 주입
		// before
		System.out.println("before=====");
		Object retVal = pjp.proceed();
		//after
		System.out.println("after=====" +retVal);
		return retVal;
	}
}