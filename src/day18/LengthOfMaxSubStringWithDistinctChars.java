package day18;

import java.util.HashSet;
import java.util.Set;

public class LengthOfMaxSubStringWithDistinctChars {

	public static void main(String[] args) {
	//              l
	//			      r
	String str="abcbbcbdab";
	int max=findMaxSubString(str);
	System.out.println(max);

	}

	private static int findMaxSubString(String str) {					//[c,b]
		
		int left=0;
		int max=0;	//0,1,2,3
		
		Set<Character> hashset=new HashSet();
		for(int right=0;right<str.length();right++)
		{
				while(hashset.contains(str.charAt(right)))
				{
					hashset.remove(str.charAt(left));
					left++;
				}
				hashset.add(str.charAt(right));
				int distance=(right-left)+1;
				max=Math.max(max, distance);
		}
		return max;
	}

}
