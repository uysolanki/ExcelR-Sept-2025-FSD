package day30.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day30.config.MyApplicationContext;
import day30.model.Car;
import day30.model.Engine;
import day30.model.Gear;

public class DriverAppForJavaBasedBeans {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyApplicationContext.class);
		
		
		Engine eng1=beanFactory.getBean("e1",Engine.class);
		System.out.println(eng1);
		
		Engine eng2=beanFactory.getBean("e2",Engine.class);
		System.out.println(eng2);
		
		Gear gear1=beanFactory.getBean("g1",Gear.class);
		System.out.println(gear1);
		
		Gear gear2=beanFactory.getBean("g2",Gear.class);
		System.out.println(gear2);
		
		Car car1=beanFactory.getBean("c1",Car.class);
		System.out.println(car1);
	}

}
