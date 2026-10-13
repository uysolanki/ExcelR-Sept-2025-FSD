package day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo4 {

	public static void main(String[] args) {
//		String name="rajesh";
		String name="apple";
		char ch=findFirstRepeatedChar(name);
		System.out.println(ch=='0'? "No Repeated char found":ch);
		
	}

	private static char findFirstRepeatedChar(String name) {
		Set<Character> hashset=new HashSet();	//['a','p']
		for(char ch:name.toCharArray())			//ch='p'
		{
			if(!hashset.add(ch))
				return ch;
		}
		return '0';
	}

}
