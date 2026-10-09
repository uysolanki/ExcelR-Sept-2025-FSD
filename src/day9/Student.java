package day9;

public class Student {

	private int rollNumber;        //instance scope
	private String studentName;	   //instance scope
	private double percentage;	   //instance scope
	
	
	
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

						
	public Student()   	
	{					
		this.rollNumber=101;
		this.studentName="Rohit";
		this.percentage=50.0;
		
	}
	
	public Student(int rollNumber, String studentName, double percentage)		//AllArgsConsructor
	{
		try
		{
		this.rollNumber=rollNumber;
		if(studentName==null)
			throw new NullPointerException();
		this.studentName=studentName;
		this.percentage=percentage;
		}
		catch(NullPointerException ex)
		{
			System.out.println("Invalid details to create object");
		}
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", percentage=" + percentage
				+ "]";
	}
		
	
}
