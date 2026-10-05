package day5;

public class CountOccuranceOfWordInASentance {
	public static void main(String[] args) {
		// 						         			                       54
//	String sentance="i am studying java in fsd java is a prog lang and java is good";				//["Mahendra" "Singh" "Dhoni"]
		String sentance="one two one three four one five one six one seven";	
//		String search="java";
		String search="one";
	
	int searchStart=0;
	int index=0;
	int occuranceCounter=0;   //0,1
	do
	{
	index=sentance.indexOf(search,searchStart);  //index=50
		if(index!=-1)											//50!=-1  true
		{
		occuranceCounter++;										//occuranceCount=0,1,2,3
		}
	searchStart=index+search.length();
	
	}while(index!=-1);
	System.out.println(occuranceCounter);
	
}
}
