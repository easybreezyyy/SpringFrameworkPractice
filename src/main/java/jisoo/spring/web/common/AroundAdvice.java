package jisoo.spring.web.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class AroundAdvice {
	@Around("PointcutCommon.allPointcut()")
	public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("[Around-Before] : ����Ͻ� �޼��� ���� �� ó��");
		Object returnObj = joinPoint.proceed(); // �ٽɷ����� �����ض�
		System.out.println("[Around-After] : ����Ͻ� �޼��� ���� �� ó��");
		return returnObj;
	}
}
