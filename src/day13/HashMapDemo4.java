package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo4 {

	public static void main(String[] args) {
		//count the occurance of each word in a sentance
		String sentance="one two one three four one five four five six six six seven seven";
		
		String words[]=sentance.split(" "); //[one, two, one, three, four, one, five, four, five, six, six, six, seven, seven]
		
		Map<String,Integer> hashmap=new HashMap();
		for(String word:words)							//word="one"
			hashmap.put(word, hashmap.getOrDefault(word, 0)+1);
		
		System.out.println(hashmap);
		
	}

}
/*
{
one=2
two=1
}
*/
