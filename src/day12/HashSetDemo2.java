package day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		Set<String> names=new HashSet();
		
		System.out.println(names.add("Alice")); //true		["Alice"]
		System.out.println(names.add("Ben"));	//true      ["Alice","Ben"]
		System.out.println(names.add("Ben"));   //false
		
		
		//can you give the 1st repeated char    //input ="viratkohli" 	=>output = 'i'
		 										//input ="apple"  		=>output = 'p'
		
		//String name="apple";
		//String name="virat kohli";
		String name="rajesh";
		Set<Character> hashset=new HashSet();	//['v','i','r','a','t',' ','k','o','h','l']
		for(char ch:name.toCharArray())			//ch='p'
		{
			if(hashset.contains(ch))
			{
				System.out.println("First repeated char is "+ch);
				break;
			}
			else
				hashset.add(ch);
		}
	}

}
