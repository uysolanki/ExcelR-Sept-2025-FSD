package day3;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number "); //10      
		int num=sc.nextInt();
		
		int flag=0;
		int loopCounter=0;
		for(int i=2;i<num;i++)
		{
			loopCounter++;
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
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
