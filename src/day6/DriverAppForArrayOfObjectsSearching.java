package day6;

import java.util.Scanner;

public class DriverAppForArrayOfObjectsSearching {

	public static void main(String[] args) {
		
		Student fsdBatch[]=new Student[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<fsdBatch.length;i++)
		{
			
			System.out.println("Please enter roll number");   //101   102   103
			int a=sc.nextInt();
			
			System.out.println("Please enter Student name");  //Alice Ben   Chris
			String b=sc.next(); 
			
			System.out.println("Please enter Percentage");     //78.5 88.5   98.5
			double c=sc.nextDouble();
			
			fsdBatch[i]=new Student(a,b,c);
		}
			
		
		for(int i=0;i<fsdBatch.length;i++)
			fsdBatch[i].displayStudent();
		
		System.out.println("Enter rollnumber to search");
		int searchedRno=sc.nextInt();
		
		int flag=0;
		for(int i=0;i<fsdBatch.length;i++)
		{
			boolean result=fsdBatch[i].search(searchedRno);
			if(result==true)
			{
				System.out.println("Student Found");
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Student not found");
		
		
		
		
		System.out.println("Enter student name to search");
		String searchedName=sc.next();
		
		int flag1=0;
		for(int i=0;i<fsdBatch.length;i++)
		{
			boolean result=fsdBatch[i].search(searchedName);
			if(result==true)
			{
				System.out.println("Student Found");
				flag1=1;
				break;
			}
		}
		
		if(flag1==0)
			System.out.println("Student not found");

	}

}
