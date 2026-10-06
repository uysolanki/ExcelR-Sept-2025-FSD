package day6;

import java.util.Scanner;

public class Student {

	private int rollNumber;  
	private String studentName;
	private double percentage;
	
	
	
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	//NoArgsConstructor
	public Student()   	//this is a constructor
	{					// it s a special type of method whose name is same as the class name
						//it does not have any return type
		rollNumber=101;
		studentName="Rohit";
		percentage=50.0;
		
	}
	
	public Student(int a, String b, double c)		//AllArgsConsructor
	{
		rollNumber=a;
		studentName=b;
		percentage=c;
	}
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
	
														//function overloading
	public boolean search(int rno)           			//same name
	{
		if(rollNumber==rno)
			return true;
		else
			return false;
	}
	
	public boolean search(String searchedstudName)		//diff parameters
	{
		if(studentName.equalsIgnoreCase(searchedstudName))
			return true;
		else
			return false;
	}
	
	
}
