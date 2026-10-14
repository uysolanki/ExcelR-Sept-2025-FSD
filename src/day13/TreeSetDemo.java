package day13;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> names=new TreeSet();
		names.add("Alice");
		names.add("Rajesh");
		names.add("Tom");
		names.add("Jerry");
		names.add("Ben");
		names.add("Ben");
		
		System.out.println(names);   //preserve ascending order & no duplicates

	}

}
