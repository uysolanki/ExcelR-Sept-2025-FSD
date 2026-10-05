package day4;

import java.util.Scanner;

public class FunctionScenerio2 				//Ratio 2 : 2
{

	public static void main(String[] args)  //Ambani
	{
			int result=areaRect();										//call
			System.out.println("Area of Rectangle is "+ result);		//displaying the result - serving
	}

	//we write void before the function when function does not return any value
	private static int areaRect() 			    //5* Hotel
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length ");	//mutter      
		int length=sc.nextInt();
		
		System.out.println("Enter Breadth "); 	//Paneer     
		int breadth=sc.nextInt();										//accepting the value - buying
		
		int area=length*breadth;										//applying the formula - cooking
		
		return area;
		
	}

}
