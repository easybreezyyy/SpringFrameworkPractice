package jisoo.spring.web.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * 어노테이션 기반 aop 설정 - '@Service' & xml에서 auto-proxy 설정
 * 포인트컷 설정 - '@Pointcut'
 */
@Service
@Aspect
public class LogAdvice {
	@Pointcut("execution(* jisoo.spring.web..*Impl.*(..))")
	public void allPointcut() {
	}
		
	@Pointcut("execution(* jisoo.spring.web..*Impl.get*(..))")
	public void getPointcut() {
	}
	
	@Before("allPointcut()")
	public void printLog() {
		System.out.println("[공통 로그] : 비즈니스 로직 수행 전 동작");
	}
}
