package jisoo.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;

public class AfterThrowingAdvice {
	@AfterThrowing(pointcut = "PointcutCommon.allpointcut()", throwing = "e")
	public void exceptionLog(JoinPoint jp,Exception e) {
		System.out.println("[예외처리] : 비즈니스 로직 수행 중 예외 발생");
	}
}
