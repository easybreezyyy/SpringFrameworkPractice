package jisoo.spring.web.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * ������̼� ��� aop ���� - '@Service' & xml���� auto-proxy ����
 * ����Ʈ�� ���� - '@Pointcut'
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
		System.out.println("[���� �α�] : ����Ͻ� ���� ���� �� ����");
	}
}
