package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo3 {

	public static void main(String[] args) {
		//count the occurance of each word in a sentance
		String sentance="one two one three four one five four five six six six seven seven";
		
		String words[]=sentance.split(" "); //[one, two, one, three, four, one, five, four, five, six, six, six, seven, seven]
		
		Map<String,Integer> hashmap=new HashMap();
		for(String word:words)							//word="one"
		{
			if(hashmap.containsKey(word))
			{
				hashmap.put(word, hashmap.get(word)+1);
			}
			else
			{
				hashmap.put(word, 1);
			}
		}
		System.out.println(hashmap);
		
	}

}
/*
{
one=3
two=1
three=1
four=2
five=2
six=3
seven=2
}
*/
