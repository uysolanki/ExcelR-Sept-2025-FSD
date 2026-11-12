package day30.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import day30.model.Car;
import day30.model.Engine;
import day30.model.Gear;

public class DriverApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		Engine eng1=(Engine)beanFactory.getBean("e1");
		System.out.println(eng1);
		
		Engine eng2=(Engine)beanFactory.getBean("e2");
		System.out.println(eng2);
		
		Gear gear1=beanFactory.getBean("g1",Gear.class);
		System.out.println(gear1);
		
		Gear gear2=beanFactory.getBean("g2",Gear.class);
		System.out.println(gear2);
		
		Car car1=beanFactory.getBean("c1",Car.class);
		System.out.println(car1);
		
		Car car2=beanFactory.getBean("c2",Car.class);
		System.out.println(car2);
	}

}
