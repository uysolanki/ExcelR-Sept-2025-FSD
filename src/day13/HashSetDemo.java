package day13;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> names=new HashSet();
		names.add("Alice");
		names.add("Rajesh");
		names.add("Tom");
		names.add("Jerry");
		names.add("Ben");
		names.add("Ben");
		
		System.out.println(names);   //random order & no duplicates

	}

}
