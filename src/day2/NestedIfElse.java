/*
 * percentage >= 75   DIST
 * percentage >= 60   First Class
 * percentage >= 50   Second Class
 * percentage >= 40   Pass Class
 * percentage < 40    Not Pass
 */
package day2;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) 
	{
		Scanner    sc          = new Scanner(System.in);   //how to make an object in java
	//  classname  objectnamec = new classname();
		System.out.println("Enter your percentage");       //AdultAndMinor     age>=18
		
		double percentage=sc.nextDouble();  //percentage=25.0
		
		
		if(percentage>=75.0)  //  is 25.0>=75.0  false   if will be skipped
		{					  
			System.out.println("DIST");   
		}
		else if(percentage>=60.0)  //  is 25.0>=60.0   false   if will be skipped
		{					  
			System.out.println("First Class");   
		}
		else if(percentage>=40.0)  //  is 25.0>=40.0  true   if will be skipped
		{					  
			System.out.println("Pass Class");   
		}
		else
		{
			System.out.println("Not Pass");
		}
		

		
		System.out.println("Thank You!!!");  //display" Thank You!!!
	}

}
