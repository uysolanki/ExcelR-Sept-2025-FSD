package day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
//		Set<String> names=new HashSet();
//		names.add("Jan");
//		names.add("Feb");
//		names.add("March");
//		names.add("March");
//		names.add(null);
//		names.add(null);
//		System.out.println(names);

		Set<Integer> set1=new HashSet(Arrays.asList(1,2,3,4,5));
		
		Set<Integer> set2=new HashSet(Arrays.asList(4,5,6,7,8));
		
		
		//set1 U set 2  [1,2,3,4,5,6,7,8]
		
//		set1.addAll(set2);  //
//		
//		System.out.println("set1 U set 2 " + set1);
		
		
		//set1 n set 2  [4,5]
		
		set1.retainAll(set2);
		System.out.println("set1 n set 2 " + set1);

	}

}
