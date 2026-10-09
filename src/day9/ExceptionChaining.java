package day9;

import java.util.Scanner;

public class ExceptionChaining {
	
	public static void main(String[] args) {
		try
		{
		int carpetCost=costOFCarpet();
		System.out.println(carpetCost);  //15,000
		}
		catch(RuntimeException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("Message to Developer, "+ex.getCause());
		}
		
	}

	private static int costOFCarpet() throws RuntimeException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter per squarefeet cost of carpet");
		int perSquareFeetCarpetCost=sc.nextInt();
		
		System.out.println("Please enter length of room");
		int length=sc.nextInt();
		
		System.out.println("Please enter width of room");
		int width=sc.nextInt();
		Rectangle r1=new Rectangle(length, width);
		try
		{
		return calculateCost(perSquareFeetCarpetCost,null);
		}
		catch(NullPointerException ex)
		{
			throw new RuntimeException("Message to the Customer : Invalid Data",ex);
		}
		
	}

	private static int calculateCost(int perSquareFeetCarpetCost, Rectangle r1) throws NullPointerException {
		return perSquareFeetCarpetCost*r1.calculateArea();
	}

}
