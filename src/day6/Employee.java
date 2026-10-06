package day6;

import java.util.Scanner;

public class Employee extends Person
{
																		//total attributes 3 + 3 =6
	protected int eno;
	protected String desg;
	protected double salary;
	
	public Employee() {}
	public Employee(int eno, String desg, double salary) {
		super();
		this.eno = eno;
		this.desg = desg;
		this.salary = salary;
	}
	
	
	public void acceptEmployee()										  //total methods : 8
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter employee ID"); 
		eno=sc.nextInt();
		
		System.out.println("Please enter designation");  
		desg=sc.next();
		
		System.out.println("Please enter salary");  
		salary=sc.nextDouble();
	}
	
	public void displayEmployee()
	{
		System.out.println("Employee ID is "+eno); 
		System.out.println("Designation is "+desg);  
		System.out.println("Salary is "+salary);  
	}
}
