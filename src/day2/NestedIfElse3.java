/*
 * percentage >= 75   DIST
 * percentage >= 60   First Class
 * percentage >= 50   Second Class
 * percentage >= 40   Pass Class
 * percentage < 40    Not Pass
 */
package day2;

import java.util.Scanner;

public class NestedIfElse3 {

	public static void main(String[] args) 
	{
		Scanner    sc          = new Scanner(System.in);   
	
		System.out.println("1. English");       //AdultAndMinor     age>=18
		System.out.println("2. Hindi");
		System.out.println("3. Marathi");
		
		System.out.println("Enter Choice");   //choice=4
		int choice = sc.nextInt();
		
		// = assignemtn
		// a = 10;   assiging value 10 to variable a
		
		//== comparison 
		
		if(choice==1)  //  is 4==1 false
		{					  
			System.out.println("Call routed to London");   
		}
		else if(choice ==2)  //  is 4==2 false
		{					  
			System.out.println("Call routed to Delhi");  
		}
		else if(choice==3)  //  is 4==3 false
		{					  
			System.out.println("Call routed to Mumbai");   
		}
		else
		{
			System.out.println("Invalid Input");
		}
		

		
		System.out.println("Have anice day ahead!!!");  //display" Thank You!!!
	}

}
