package day30.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import day30.model.Car;
import day30.model.Engine;
import day30.model.Gear;

public class DriverAppForAutowire {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		
		
		Car car2=beanFactory.getBean("c3",Car.class);
		System.out.println(car2);
	}

}
