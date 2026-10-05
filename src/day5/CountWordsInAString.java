package day5;

public class CountWordsInAString {
	public static void main(String[] args) {
	String name="Mahendra Singh Dhoni";
	
	int wordCounter=0;
	for(int i=0;i<name.length();i++)
	{
		if(name.charAt(i)==' ')
			wordCounter++;
	}
	
	System.out.println("Number of words are "+ (wordCounter+1));
	
	
}
}
