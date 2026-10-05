package day4;

import java.util.Scanner;

public class FunctionScenerio3 				//Ratio 3 : 1
{

	public static void main(String[] args)  //Common man       ---> Caller Function
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Length ");	//mutter      
			int length=sc.nextInt();
		
			System.out.println("Enter Breadth "); 	//Paneer     
			int breadth=sc.nextInt();									//buying
		
			int result=areaRect(length,breadth);//actual parameter						//call - parameter passing
			System.out.println("Area of Rectangle is "+ result);		//displaying the result - serving
	}

//while calling the function the arguements passed
//are known as actual parameters
	
	
//	private static int areaRect(int length,int breadth) 			    //Dishonest caterer - count & datatype
//	{
//												
//		int area=length*breadth;										//applying the formula - cooking
//		return area;
//	}
															//---> Callee Function
	
								//formal parameter
	private static int areaRect(int l,int b) 			    //Dishonest caterer - count & datatype
	{										
		int area=l*b;										//applying the formula - cooking
		return area;
	}

}
