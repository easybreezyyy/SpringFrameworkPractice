package jisoo.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//@SuppressWarnings("deprecation")
public class MyLifeBeanMain {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		MyLifeBean bean = (MyLifeBean) factory.getBean("myLifeBean");
		bean.sayHello();
		factory.close();
		
		/*
		FileSystemResource resource = 
				new FileSystemResource("src/main/resources/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		factory.addBeanPostProcessor(new CustomBeanPostProccessor());
		MyLifeBean bean = (MyLifeBean) factory.getBean("myLifeBean");
		bean.sayHello();
		factory.destroyBean(bean);
		*/
	}

}
