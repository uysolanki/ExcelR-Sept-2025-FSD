package day5;

public class BiggestWordInSentance {
	public static void main(String[] args) {		//   0          1      2
	String name="Mahendra Singh Dhoni";				//["Mahendra" "Singh" "Dhoni"]
	String words[]=name.split(" ");		
	
	
	int max=0;  //max = stone in hand  10,16
	String maxWord="";
	
	for(int i=0;i<words.length;i++)
	{
		if(words[i].length()>max)
		{
			max=words[i].length();
			maxWord=words[i];
		}
	}
	
	System.out.println("Biggest word in sentance is "+maxWord);
}
}
