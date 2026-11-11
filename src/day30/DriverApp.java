package day30;

public class DriverApp {
	
	public static void main(String[] args) {
		Engine e1=new Engine("Toyota","Petrol", 2500, 2.5);
		Engine e2=new Engine("Honda","Diesel", 3000, 3.0);
		
		Gear g1=new Gear("Tata", "Automatic", 8);
		Gear g2=new Gear("Volvo", "Manual", 12);
		
		Car c1=new Car("Innova", "Toyota", "White", 300.0, e1, g1);
		System.out.println(c1);
		
		Car c2=new Car();
		c2.setCarColor("Black");
		c2.setCarMfg("Honda");
		c2.setCarModel("City");
		c2.setCarPrice(200.0);
		c2.setEngine(e2);
		c2.setGear(g2);
		
		System.out.println(c2);
	}
	
}
