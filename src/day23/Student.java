package day23;

public class Student 
{
	private int rollNumber;       
	private String studentName;	   
	private double percentage;	   
	
	
		public Student()   
		{					
			rollNumber=101;
			studentName="Rohit";
			percentage=50.0;
			
		}
		
		public Student(int a, String b, double c)		
		{
			rollNumber=a;
			studentName=b;
			percentage=c;
		}
		
	
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

	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", percentage=" + percentage
				+ "]";
	}
}
