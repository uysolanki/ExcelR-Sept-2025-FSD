package day21;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringEncoding {
public static void main(String[] args) {
	//String str="aaaabbbccd";   //sorted string
	//String str=""; 
	//String str=null; 
	//String str="      "; 
	String str="aaaaa   bbb  ccd"; 
	if(str==null || str.trim().length()==0)
		System.out.println("Invalid Input");
	else
	{
	str=str.replaceAll("\\s+", "");
	String result=stringEncoding(str);
	System.out.println(result);
	}
}

private static String stringEncoding(String str) {
Map<Character,Integer> hashmap=new HashMap();
	
	for(char ch:str.toCharArray())
		hashmap.put(ch, hashmap.getOrDefault(ch, 0)+1);
	
	System.out.println(hashmap);
	
	StringBuilder sb=new StringBuilder();
	
	for(Entry<Character,Integer> entry:hashmap.entrySet())
	{
		sb.append(entry.getKey()).append(entry.getValue());
	}
	return sb.toString();
}
}


//"a4b3c2d1"
