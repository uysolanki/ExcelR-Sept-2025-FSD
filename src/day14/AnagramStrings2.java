package day14;

import java.util.Arrays;

public class AnagramStrings2 {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		
		String s3=getSortedString(s1);     //"eilnst"
		String s4=getSortedString(s2);      //"eilnst"
		
		if(s3.equals(s4))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}
	
	
	public static String getSortedString(String str)
	{
		char arr1[]=str.toCharArray();  // ['l','i','s','t','e','n']
		Arrays.sort(arr1);             // ['e','i','l','n','s','t']
		String s3=new String(arr1);     //"eilnst"
		return s3;
	}
}
