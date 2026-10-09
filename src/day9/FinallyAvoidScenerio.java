package day9;

import java.util.Scanner;

public class FinallyAvoidScenerio {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");			//10		10
		int numerator = sc.nextInt();
		System.out.println("Enter Denomintor");			//0			5
		int denominrator = sc.nextInt();
		try
		{
		double ans=numerator/denominrator;
		System.out.println(ans);						//2.0
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());      	// / by zero
			System.exit(0);
		}
		finally
		{
		System.out.println("Thank You!!!");
		}

	}

}
