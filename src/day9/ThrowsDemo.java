package day9;

import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");			//10		10
		int numerator = sc.nextInt();
		System.out.println("Enter Denomintor");			//0			5
		int denominrator = sc.nextInt();
		try
		{
		double ans=divide(numerator,denominrator);
		System.out.println(ans);						//2.0
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());      	// / by zero
		}
		
		System.out.println("Thank You!!!");
		

	}

	private static double divide(int numerator,int denominrator) throws ArithmeticException
	{
		double result=numerator/denominrator;   //function body will focus on business loic   
		return result;							//delegate the EH to the caller
	}	

}
