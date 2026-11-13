package day30.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import day30.model.Car;
import day30.model.Engine;
import day30.model.Gear;

@Configuration
public class MyApplicationContext {
	
	@Bean(name="e1")
	public Engine getEngineUsingCDI()
	{
		Engine e1=new Engine("BMW","Hybrid", 2500, 2.5);
		return e1;
	}
	
	@Bean(name="e2")
	public Engine getEngineUsingSDI()
	{
		Engine e1=new Engine();
		e1.setEngineCC(3000);
		e1.setEngineLitres(3.0);
		e1.setEngineMfg("Tesla");
		e1.setEngineType("Electric");
		return e1;
	}
	
	
	@Bean(name="g1")
	public Gear getGearUsingCDI()
	{
		Gear g1=new Gear("Tata", "Automatic", 8);
		return g1;
	}
	
	@Bean(name="g2")
	public Gear getGearUsingSDI()
	{
		Gear g1=new Gear();
		g1.setGearlever(16);
		g1.setGearMfg("Mahindra");
		g1.setGearType("Automatic");
		return g1;
	}
	
	@Bean(name="c1")
	public Car getCarUsingSDI()
	{
		Car c1=new Car();
		c1.setCarColor("Red");
		c1.setCarMfg("Mahindra");
		c1.setCarModel("Thar");
		c1.setCarPrice(150.0);
		return c1;
	}

}
