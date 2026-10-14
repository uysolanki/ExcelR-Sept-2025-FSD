package day13;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		System.out.println("**** FSD Attendance Order ****");
		Set<Student> fsdStudentsAttendance=new TreeSet(new RnoComparatorAscOrder());
		fsdStudentsAttendance.add(new Student(18,"Virat",  78.5));
		fsdStudentsAttendance.add(new Student(45,"Rohit",  88.5));
		fsdStudentsAttendance.add(new Student(33,"Hardik", 58.5));
		fsdStudentsAttendance.add(new Student(77,"Shubman",68.5));
		fsdStudentsAttendance.add(new Student(1, "Rahul",  98.5));
		
		//System.out.println(fsdStudentsAttendance);   //preserve ascending order & no duplicates
		
		for(Student s:fsdStudentsAttendance)
			System.out.println(s);
		
		System.out.println("**** FSD Exam Results ****");
		Set<Student> fsdStudentsExamResults=new TreeSet(new PerComparatorDescOrder());
		fsdStudentsExamResults.add(new Student(18,"Virat",  78.5));
		fsdStudentsExamResults.add(new Student(45,"Rohit",  88.5));
		fsdStudentsExamResults.add(new Student(33,"Hardik", 88.5));
		fsdStudentsExamResults.add(new Student(77,"Shubman",68.5));
		fsdStudentsExamResults.add(new Student(1, "Rahul",  98.5));
		
		for(Student s:fsdStudentsExamResults)
			System.out.println(s);
	}

}
