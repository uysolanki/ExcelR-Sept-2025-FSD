package day4;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args)  //heart of the program
	{										//all the burden in coming on main
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length "); //10      
		int length=sc.nextInt();
		
		System.out.println("Enter Breadth "); //10      
		int breadth=sc.nextInt();										//accepting the value - main
		
		int area=length*breadth;										//applying the formula - main
		
		System.out.println("Area of Rectangle is "+ area);				//displaying the result - mainUmar 
		

	}

}
