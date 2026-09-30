/*
 * percentage >= 75   DIST
 * percentage >= 60   First Class
 * percentage >= 50   Second Class
 * percentage >= 40   Pass Class
 * percentage < 40    Not Pass
 */
package day2;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) 
	{
		Scanner    sc          = new Scanner(System.in);   
	
		System.out.println("1. English");       //AdultAndMinor     age>=18
		System.out.println("2. Hindi");
		System.out.println("3. Marathi");
		
		System.out.println("Enter Choice");   //choice=3
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("Call routed to London"); break; 
		
		case 2: System.out.println("Call routed to Delhi");  break; 
		
		case 3: System.out.println("Call routed to Mumbai"); break;   

		default : System.out.println("Invalid Input");
		}
		

		
		System.out.println("Have a nice day ahead!!!");  //display" Thank You!!!
	}

}
