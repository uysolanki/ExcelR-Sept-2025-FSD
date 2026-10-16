package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo6 {

	public static void main(String[] args) {
		List<String> words=new ArrayList(Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten","thirteen","twenty one"));
	
		Map<Integer,List<String>> hashmap=new HashMap();
		
		for(String word:words)		//word=one
		{
			int key=word.length();
			hashmap.putIfAbsent(key, new ArrayList());
			
			hashmap.get(key).add(word);
		}
		
		System.out.println(hashmap);
	}
}

/*
{
3=[one]
}
*/
/*
3=[one,two,six,ten]
4=[four,five,nine]
5=[seven,eight,three]

[one, two, six, ten],[four, five, nine],[three, seven, eight]
*/