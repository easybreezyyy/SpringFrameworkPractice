package jisoo.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;

public class AfterThrowingAdvice {
	@AfterThrowing(pointcut = "PointcutCommon.allpointcut()", throwing = "e")
	public void exceptionLog(JoinPoint jp,Exception e) {
		System.out.println("[����ó��] : ����Ͻ� ���� ���� �� ���� �߻�");
	}
}
