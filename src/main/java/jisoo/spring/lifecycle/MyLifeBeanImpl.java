package jisoo.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyLifeBeanImpl implements MyLifeBean, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

	private String greeting;
	private String beanName;
	private BeanFactory beanFactory;
	
	
	public MyLifeBeanImpl() {
		System.out.println("1. 빈 생성자 실행");
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("2. 빈의 setter 메서드 실행");
	}
	
	@Override
	public void sayHello() {
		System.out.println(greeting + beanName + "!!!");
	}
	
	@Override
	public void setBeanName(String name) {
		System.out.println("3. 빈 이름 설정");
		this.beanName = name;
		System.out.println("---> " + this.beanName);
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. set the beanFactory");
		this.beanFactory = beanFactory;
		System.out.println("---> " + this.beanFactory);
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6. Complete Setting Property");
		
	}
	
	public void init() {
		System.out.println("7. Conduct initializing method");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Finish");
	}

}
