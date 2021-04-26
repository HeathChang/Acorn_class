package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect //핵심기능에 필요한 advisor 기능을 구현한 클래스 
public class PersonBeforeAspect {
	
	//advice와 pointCut 분리: advisor코드, + 핵심기능 해야되는데
	//advisor함수는 따로 구현해 aspect에서 자동 호출하고 mesg
	@Pointcut("execution(* mesg(..))") //*mesg(..리턴타입 함수이름(매개변수 상관없음 )
	public void xx() {} //xx이름으로 등록 
	
	@Before("xx()")//pointcut xx()가 실행되기전에 advisor 실행
	public void mesgBefore(JoinPoint x) {//핵심 기능클래스 정보
		Signature s =(Signature) x.getSignature();
		System.out.println("mesgBefore살행 targetClass 함수이름 == "+s.getName());
		//targer 클래스 메소드명
	}
	
	//advice와 pointcut 같이
	@Before("execution(* getInfo(..))") //표현식을 @Before 어노테이션으로 직접 적용
	public void getInfoBefore() {
		System.out.println("getInfoBefore============");
	}
	
}
