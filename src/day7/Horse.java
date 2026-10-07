package day7;

				   //signing a contract
				   //overide all the methods
public class Horse implements Animal{

	@Override
	public void eat() {
		System.out.println("Horse eating..");
	}

	@Override
	public void sleep() {
		System.out.println("Horse sleeping..");
	}

	@Override
	public void run() {
		System.out.println("Horse running..");
	}
}


//concrete class - is a class which has implemented all the methods of the interface
//concrete class can be instantiated - i.e object can be created