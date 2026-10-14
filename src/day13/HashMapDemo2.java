package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		//count of odd Numbers & count of Even Numbers
		//oddCount=3, evenCount=2
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		
		int oddCount=0, evenCount=0;
		for(int n:numbers)
		{
			if(n%2==0)
				evenCount++;
			else
				oddCount++;
		}
		
		System.out.println("Count of Even Numbers is "+evenCount);
		System.out.println("Count of Odd Numbers is "+oddCount);
		
		
		//using hashmap
		Map<String,Integer> hashmap=new HashMap();
		hashmap.put("oddCount",  0);
		hashmap.put("evenCount", 0);
		
		for(int n:numbers)
		{
			if(n%2==0)
				hashmap.put("evenCount", hashmap.get("evenCount")+1);
			else
				hashmap.put("oddCount", hashmap.get("oddCount")+1);
		}
		
		System.out.println(hashmap);
		System.out.println("Count of Even Numbers is "+hashmap.get("evenCount"));
		System.out.println("Count of Odd Numbers is "+hashmap.get("oddCount"));
	}

}
/*
{
"oddCount" = 0
"evenCount"= 0
}
*/
