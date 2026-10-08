package day8;

public class Example1 {

	public static void main(String[] args) {
		String s1="my name is Alice I have 2 brothers and 1 sister i am 9 years old";
		//count the number of integers in this sentance
		
		String words[]=s1.split(" ");//["my", "name", is, Alice, I, have, 2, brothers, and, 1, sister, i, am, 9, years' old]
	
		int intCounter=0;
		
		for(String word:words)		//word : "2"
		{
			try
			{
			int n1=Integer.parseInt(word);        //will throw NumberFormatException
			intCounter++;
			}
			catch(NumberFormatException ex)
			{
				
			}
		}
		
		System.out.println("there are "+intCounter+ " integers in this sentance");
	}

}


// there are 3 integers in this sentance
//InvalidNameException

//accept name from user if the name contains a space Vi rat  , Ro hit
//String name=sc.nextLine()