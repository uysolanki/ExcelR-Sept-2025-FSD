package day7;

public class Abhishek extends Amitabh{

	@Override
	public void home()  //function in child class with same name & same parameter as that of the parent class
	{					//is called as function overriding
		System.out.println("new Jalsa");
	}
	
	public void car()
	{
		System.out.println("Audi");
	}
	
//	@Override
//	public void act()
//	{
//		System.out.println("Abhishek Acting");
//	}
}
