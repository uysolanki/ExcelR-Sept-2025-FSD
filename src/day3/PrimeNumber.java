package day3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number "); //10      
		int num=sc.nextInt();
		
		int counter=0;
		int loopCounter=0;
		for(int i=1;i<=num;i++)
		{
			loopCounter++;
			if(num%i==0)
			{
				counter++;
			}
		}
		
		if(counter==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}

		System.out.println("Iteration Count "+loopCounter);
	}

}
