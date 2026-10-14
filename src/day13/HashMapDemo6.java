package day13;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo6 {

	public static void main(String[] args) {
		//count the chars in a sentance
		String str="aaabbbccdd";
		str=str.replaceAll("\\s+", "");
	
		StringBuffer result=new StringBuffer("");            //""
		Map<Character,Integer> hashmap=new LinkedHashMap();
		for(char ch:str.toCharArray())							
			hashmap.put(ch, hashmap.getOrDefault(ch, 0)+1);
		
		System.out.println(hashmap);
		
		for(Entry<Character,Integer> entry  : hashmap.entrySet())
			result.append(entry.getKey()).append(entry.getValue());
		
		System.out.println(result);
	}

}


//a3b3c2d2
