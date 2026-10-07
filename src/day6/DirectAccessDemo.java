package day6;

public class DirectAccessDemo {

	public static void main(String[] args)    //Java Virtual Machine (JVM) it calls the main method
	{
	Student s1=new Student();
	
	s1.acceptStudent();
	
	s1.displayStudent();
	
	s1.search(0);
	
	s1.search("Alice");
	
	s1.setRollNumber(333);	//setter to write the private variables
	
	System.out.println("RollNumber is "+s1.getRollNumber()); //getter to read the private variables

	}

}

//DirectAccessDemo s1=new DirectAccessDemo()
//s1.main();