package day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numerator");
		int numerator = sc.nextInt();			 //new InputMismatchException
		System.out.println("Enter denominator");
		int denominrator = sc.nextInt();
		
		double result=numerator/denominrator;    //new ArithmaticException()
		System.out.println(result);
		
		String name=null;
		System.out.println(name.length());       //new NullPointerException
		}
		catch(ArithmeticException | InputMismatchException ex)
		{
			System.out.println("Please enter valid input");
		}
		
		catch(Exception ex)
		{
			System.out.println("some issue occured");
		}
		
		System.out.println("Thank You!!!");
		
		
	}

}
