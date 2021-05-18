package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component //////////////////////////
@Aspect ///////////////////////
public class MethodBeforeAspect {
	public MethodBeforeAspect() {
		System.out.println("MethodBeforeAspect 기본생성자====");
	}

	@Pointcut("execution(public * say*(..))")
	public void say() {
	}// 리턴타입은 반드시 void로

	
	  @Before("say()") 
	  public void beforeLogging(JoinPoint joinPoint) { 
		  String methodName= joinPoint.getSignature().getName();//함수이름 리턴
	  System.out.println("beforeLogging>>>>>>>>>    "+methodName); 
	  }
	 

	/*
	 * @AfterReturning(pointcut = "execution(public * say*(..))", returning = "ret")
	 * public void returinngLogging(JoinPoint joinPoint, Object ret) { String
	 * methodName= joinPoint.getSignature().getName();
	 * System.out.println("메소드가 실행된 결과값을 얻을 수 있음 : "+ methodName+ " returns "+ ret);
	 * }
	 */
	// @After("say()")
	/*
	 * @After("execution(public * say*(..))") public void afterLogging(JoinPoint
	 * joinPoint) { String methodName= joinPoint.getSignature().getName();
	 * System.out.println("메소드가 정상/예외인지 무시하고 항상 실행 후 :"+ methodName); }
	 */

	/*
	 * @Around("execution(public * say*(..))") public Object
	 * aroundLogging(ProceedingJoinPoint joinPoint) {//주의
	 * System.out.println("around 선처리======="); Object obj= null;
	 * 
	 * try { obj= joinPoint.proceed(); System.out.println("around 후처리========"); }
	 * catch (Throwable e) { // TODO Auto-generated catch block e.printStackTrace();
	 * System.out.println("around 예외 처리=========="); } return obj; }
	 */
}
