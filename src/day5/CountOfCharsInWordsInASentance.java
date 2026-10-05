package day5;

public class CountOfCharsInWordsInASentance {
	public static void main(String[] args) {		//   0          1      2
	String name="Mahendra Singh Dhoni";				//["Mahendra" "Singh" "Dhoni"]
	String words[]=name.split(" ");		
	
	for(String word:words)												//word
	System.out.println(word + " " + word.length());			//Mahendra
	
	
}
}

//Mahendra 8
//Singh 5
//Dhoni	5