package day6;

import java.util.Scanner;

public class Student {

	private int rollNumber;  
	private String studentName;
	private double percentage;
	
	
	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter roll number");  //101
		rollNumber=sc.nextInt();
		
		System.out.println("Please enter Student name");  //Alice
		studentName=sc.next();
		
		System.out.println("Please enter Percentage");  //78.5
		percentage=sc.nextDouble();
	}
	
	public void displayStudent()
	{
		System.out.println("Roll Number is "+rollNumber); //Roll Number is 101
		System.out.println("Student name "+studentName);  //Student name Alice
		System.out.println("Percentage is "+percentage);  //Percentage is 78.5
	}
}
