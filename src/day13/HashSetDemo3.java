package day13;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo3 {

	public static void main(String[] args) {
		Set<String> names=new LinkedHashSet();
		names.add("Alice");
		names.add("Rajesh");
		names.add("Tom");
		names.add("Jerry");
		names.add("Ben");
		names.add("Ben");
		
		System.out.println(names);   //preserve order(like List) & no duplicates

	}

}
