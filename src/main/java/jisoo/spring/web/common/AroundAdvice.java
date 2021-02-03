package jisoo.spring.web.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class AroundAdvice {
	@Around("PointcutCommon.allPointcut()")
	public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("[Around-Before] : 비즈니스 메서드 수행 전 처리");
		Object returnObj = joinPoint.proceed(); // 핵심로직을 수행해라
		System.out.println("[Around-After] : 비즈니스 메서드 수행 후 처리");
		return returnObj;
	}
}
