package day6;

public class DriverAppForArrayOfObjects {

	public static void main(String[] args) {
		
		Student fsdBatch[]=new Student[3];
		
		for(int i=0;i<fsdBatch.length;i++)
			fsdBatch[i]=new Student();
		
		for(int i=0;i<fsdBatch.length;i++)
			fsdBatch[i].displayStudent();

	}

}
