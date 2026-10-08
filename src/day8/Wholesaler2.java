package day8;

import java.util.Scanner;

public class Wholesaler2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quantity");
		int qty=sc.nextInt();
		
		try
		{
		if(qty>=50)
			System.out.println("Order accepted");
		else
			throw new LowQuantityException("Please contact retailer"); 
		}
		catch(LowQuantityException ex)
		{
			System.out.println(ex.getMessage());
		}
	
	}
}
