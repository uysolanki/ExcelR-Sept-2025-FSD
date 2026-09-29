package day2;

import java.util.Scanner;

public class StringInputUsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);   //ctrl + shitt + O (Orange)
		
		System.out.println("Please enter your name");
		//String name=sc.next();  //entire string
		char ch=sc.next().charAt(0);
		
		System.out.println(ch);
	}

}

//c   programming scanf()
//c++ cin>>
//java scannerUmar 