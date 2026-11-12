package day30.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import day30.model.Engine;
import day30.model.Gear;

public class DriverAppForBeanScope {

	public static void main(String[] args) {
		//IoC container is loaded
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		
		System.out.println("Hi");
		Engine eng1=(Engine)beanFactory.getBean("e1");
		System.out.println(eng1);
		
		Engine eng2=(Engine)beanFactory.getBean("e1");
		System.out.println(eng2);
		
		System.out.println(eng1==eng2);   //address comparison
	}

}

//Hi
//In Engine All Args Constructor 
//Engine []
//In Engine All Args Constructor 
//Engine []
//false