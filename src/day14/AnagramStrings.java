package day14;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
//		String s1="listen";
//		String s2="silent";
		
		String s1="apple";
		String s2="mango";
		
		char arr1[]=s1.toCharArray();  // ['l','i','s','t','e','n']
		char arr2[]=s2.toCharArray();  // ['s','i','l','e','n','t']
		
		Arrays.sort(arr1);             // ['e','i','l','n','s','t']
		Arrays.sort(arr2);             // ['e','i','l','n','s','t']
		
		String s3=new String(arr1);     //"eilnst"
		String s4=new String(arr2);     //"eilnst"
		
		if(s3.equals(s4))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}
	
	
	
}
