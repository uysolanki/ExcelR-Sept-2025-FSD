package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo5 {

	public static void main(String[] args) {
		//count the chars in a sentance
		String str="virat kohli";
		str=str.replaceAll("\\s+", "");
	
		Map<Character,Integer> hashmap=new HashMap();
		for(char ch:str.toCharArray())							
			hashmap.put(ch, hashmap.getOrDefault(ch, 0)+1);
		
		System.out.println(hashmap);
	}

}
/*
{
v=1
}
*/
