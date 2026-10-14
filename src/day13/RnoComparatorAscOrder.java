package day13;

import java.util.Comparator;

public class RnoComparatorAscOrder implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getRollNumber()>s2.getRollNumber())
			return 1;
		else if(s1.getRollNumber()<s2.getRollNumber())
			return -1;
		else 
			return 0;
	}

}
