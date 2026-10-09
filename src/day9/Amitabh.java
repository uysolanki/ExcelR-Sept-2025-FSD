package day9;

import java.io.IOException;

public class Amitabh {
	
	public void home()   throws IOException
	{
		System.out.println("Jalsa");
	}
	
	public final void act() {
		System.out.println("Amitabh acting");
	}

}



//final in java 3 context

//prefixed before a variable : variable cannot be re initialised
//prefixed before a function name : function cannot be overriden
//prefixed before a class name : class cannot be inherited