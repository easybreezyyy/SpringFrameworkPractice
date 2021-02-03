package jisoo.spring.web.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
	@Pointcut("execution(* jisoo.spring.web..*Impl.*(..))")
	public void allPointcut() {
		
	}
	@Pointcut("execution(* jisoo.spring.web..*Impl.get*(..))")
	public void getPointcut() {
		
	}
}
