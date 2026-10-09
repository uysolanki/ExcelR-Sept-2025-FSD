package day9;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");			//10		10
		int numerator = sc.nextInt();
		System.out.println("Enter Denomintor");			//0			5
		int denominrator = sc.nextInt();
		try
		{
		System.out.println("try block entered");
		double ans=numerator/denominrator;
		System.out.println(ans);						//2.0
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());      	// / by zero
			return;
		}
		finally
		{
		System.out.println("Thank You!!!, Visit again");
		}
		
	}

}
