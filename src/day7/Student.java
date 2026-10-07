package day7;

import java.util.Scanner;

public class Student {

	private int rollNumber;        //instance scope
	private String studentName;	   //instance scope
	private double percentage;	   //instance scope
	
	private static String principalName="Roberts";   //static scope
	private static int schoolYearOfEstablishment=1869;
	
	
	public int getRollNumber() {
		return this.rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getPercentage() {
		return this.percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	//NoArgsConstructor
	public Student()   	//this is a constructor
	{					// it s a special type of method whose name is same as the class name
						//it does not have any return type
		this.rollNumber=101;
		this.studentName="Rohit";
		this.percentage=50.0;
		
	}
	
	public Student(int a, String b, double c)		//AllArgsConsructor
	{
		this.rollNumber=a;
		this.studentName=b;
		this.percentage=c;
	}
	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter roll number");  //101
		this.rollNumber=sc.nextInt();
		
		System.out.println("Please enter Student name");  //Alice
		this.studentName=sc.next();
		
		System.out.println("Please enter Percentage");  //78.5
		this.percentage=sc.nextDouble();
	}
	
	public void displayStudent()
	{
		System.out.println("Roll Number is "+this.rollNumber); //Roll Number is 101
		System.out.println("Student name "+this.studentName);  //Student name Alice
		System.out.println("Percentage is "+this.percentage);  //Percentage is 78.5
	}
	
														//function overloading
	public boolean search(int rno)           			//same name
	{
		if(this.rollNumber==rno)
			return true;
		else
			return false;
	}
	
	public boolean search(String searchedstudName)		//diff parameters
	{
		if(this.studentName.equalsIgnoreCase(searchedstudName))
			return true;
		else
			return false;
	}
	
	public static void displayPrincipalName()   //static method can access only static data
	{											//staffroom can be accessed only by the staff
												//student cannot have access to staffroom
		System.out.println("Principal name is " + Student.principalName);
		displayYearOfSchoolEstablishment();
	}
	
	public static void displayYearOfSchoolEstablishment()   //static method can access only static data
	{											//staffroom can be accessed only by the staff
												//student cannot have access to staffroom
		System.out.println("School Est year " + Student.schoolYearOfEstablishment);
	}
	
}
