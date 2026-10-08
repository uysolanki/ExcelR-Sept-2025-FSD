package day8;

public class ExceptionDemo {

	public static void main(String[] args) {
		int numerator = 10;
		int denominrator = 0;
		try
		{
		double result=numerator/denominrator;    //throw new ArithmaticException()
		System.out.println(result);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Thank You!!!");
		
		
	}

}
