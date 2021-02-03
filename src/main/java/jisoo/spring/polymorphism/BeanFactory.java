package jisoo.spring.polymorphism;

public class BeanFactory {
	
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		}else if(beanName.equals("lg")) {
			return new LgTV();
		}/*
		여기다 얼마든지 확장을 할 수가 있다.
		*/
		return null;
	}
	
}
