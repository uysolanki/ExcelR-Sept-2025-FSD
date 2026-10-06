package day6;

public class DriverApp {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
//		s1.acceptStudent();
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
		
		Student s4=new Student(18,"Virat",78.5);
		s4.displayStudent();

	}

}
