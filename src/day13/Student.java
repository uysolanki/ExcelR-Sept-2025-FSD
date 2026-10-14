package day13;

public class Student // implements Comparable<Student>{
{
	private int rollNumber;        //instance scope
	private String studentName;	   //instance scope
	private double percentage;	   //instance scope
	
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

//	@Override
//	public int compareTo(Student s1)   //compare it on rollNumber attribute in Asc order
//	{
//		if(this.rollNumber>s1.rollNumber)
//			return 1;
//		else if(this.rollNumber<s1.rollNumber)
//			return -1;
//		else 
//			return 0;
//	}
	
//	@Override
//	public int compareTo(Student s1)   //compare it on percentage attribute in Dsc order
//	{
//		if(this.percentage>s1.percentage)
//			return -1;
//		else if(this.percentage<s1.percentage)
//			return 1;
//		else 
//			return 0;
//	}
}
