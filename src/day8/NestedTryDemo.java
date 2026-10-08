package day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {												

	public static void main(String[] args) {								//	n           d		ans=2.0
		int arr[]=new int[2];		
		try																	//	0			1
		{
		Scanner sc=new Scanner(System.in);									// 10           5
		System.out.println("enter value for 0 index");  //apple
		arr[0]=sc.nextInt();
		
		System.out.println("enter value for 1 index");  //5
		arr[1]=sc.nextInt();
		
							
							try
							{
							System.out.println("Please enter index of number you want to be numerator");
							int n=sc.nextInt();  //n=3
							int numerator=arr[n];
							System.out.println("Please enter index of number you want to be denominator");
							int d=sc.nextInt(); 
							int denomanitor=arr[d];
							
							double result = numerator /denomanitor;
							System.out.println(result);
							}
							catch(ArithmeticException ex)
							{
								System.out.println("Please enter a non zero denominator");
							}
							catch(ArrayIndexOutOfBoundsException ex)
							{
								System.out.println("Please enter valid index");
							}
		
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Please enter integer values only");
		}
		
		System.out.println("Hii");
	}

}
