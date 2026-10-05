package day4;

import java.util.Scanner;

public class FunctionScenerio1 				//Ratio 1 : 3
{

	public static void main(String[] args)  //Ambani
	{
			areaRect();													//call
	}

	//we write void before the function when function does not return any value
	private static void areaRect() 			    //5* Hotel
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length ");	//mutter      
		int length=sc.nextInt();
		
		System.out.println("Enter Breadth "); 	//Paneer     
		int breadth=sc.nextInt();										//accepting the value - buying
		
		int area=length*breadth;										//applying the formula - cooking
		
		System.out.println("Area of Rectangle is "+ area);				//displaying the result - serving
		
	}

}
