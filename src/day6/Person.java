package day6;

import java.util.Scanner;

public class Person {

	protected String name;												//total attributes : 3
	protected int age;	
	protected String address;
	
	public Person() {}
	public Person(String name, int age, String address) 
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void acceptPerson()										    //total methods : 4
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter person name"); 
		name=sc.next();
		
		System.out.println("Please enter person age");  
		age=sc.nextInt();
		
		System.out.println("Please enter person address");  
		address=sc.next();
	}
	
	public void displayPerson()
	{
		System.out.println("Name is "+name); 
		System.out.println("Age is "+age);  
		System.out.println("Address is "+address);  
	}
}
