package day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo3 {

	public static void main(String[] args) {
//		String name="rajesh";
		String name="apple";
		char ch=findFirstRepeatedChar(name);
		System.out.println(ch=='0'? "No Repeated char found":ch);
		
	}

	private static char findFirstRepeatedChar(String name) {
		Set<Character> hashset=new HashSet();	//['v','i','r','a','t',' ','k','o','h','l']
		for(char ch:name.toCharArray())			//ch='p'
		{
			if(hashset.contains(ch))
			{
				return ch;
			}
			else
				hashset.add(ch);
		}
		return '0';
	}

}
