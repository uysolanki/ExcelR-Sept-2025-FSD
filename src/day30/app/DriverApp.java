package day30.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import day30.model.Engine;

public class DriverApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		Engine eng1=(Engine)beanFactory.getBean("e1");
		System.out.println(eng1);
		
		Engine eng2=(Engine)beanFactory.getBean("e2");
		System.out.println(eng2);
	}

}
