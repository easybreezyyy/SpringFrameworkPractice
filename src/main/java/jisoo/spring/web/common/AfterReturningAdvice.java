package jisoo.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;

import jisoo.spring.web.user.UserVO;

public class AfterReturningAdvice {
	@AfterReturning(pointcut = "PointcutCommon.getPointcut()", returning = "returnObj")
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO) returnObj;
			if(user.getRole().equals("admin")){
				System.out.println(user.getName() + "�α��� (Admin)");
			}
		}
		System.out.println("[����ó��] :" + method + "() �޼��� ���ϰ� : " + returnObj.toString());
	}
}
