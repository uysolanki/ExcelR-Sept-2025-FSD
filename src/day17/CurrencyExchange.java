package day17;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyExchange {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter amount to exchnage");
	int amount =sc.nextInt();								//5570
	
	System.out.println("Enter number of currency notes denominations in your country");   //6
	int size=sc.nextInt();
	
	System.out.println("enter  the "+size+ " currency denominations");
	
	int currency[]=new int[size];														//100  10 50 500 20 200
	int notes[]=new int[size];
	
	for(int i=0;i<size;i++)
		currency[i]=sc.nextInt();														//500  200 100 50 20 10
																						//11   0   0   1   1 0
	SelectionSort.selectionSortDESC(currency);
	System.out.println(Arrays.toString(currency));
	
	for(int i=0;i<currency.length;i++)
	{
			notes[i]=amount/currency[i];
			amount=amount%currency[i];	
	}
	
	System.out.println(Arrays.toString(notes));
	
	for(int i=0;i<currency.length;i++)
	{
		if(notes[i]!=0)
			System.out.println(currency[i] + " x " + notes[i] );
	}
	
}
}
