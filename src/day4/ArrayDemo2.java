package day4;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) 
		{ 														 // 0 1 2 3 4
			System.out.println("Enter age of person " + (i + 1));// 23 18 25 40 29
			arr[i] = sc.nextInt();
		}

		// display all numbers from array
		System.out.println("Display all numbers from array ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// display odd numbers from array
		System.out.println("\nDisplay ODD numbers from array ");
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] % 2 == 1)
				System.out.print(arr[i] + "\t");
		}

		// display sum of odd numbers from array
		System.out.println("\nDisplay ODD numbers from array ");
		int sum=0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 1)
				sum=sum+arr[i];
		}
		
		System.out.println("Sum of odd numbers is "+sum);
	}

}
