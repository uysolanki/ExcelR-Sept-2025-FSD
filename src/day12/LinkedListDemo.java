package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> mh=new LinkedList(Arrays.asList("Pune","Mumbai","Nagpur")); //length=5
		
		mh.addFirst("Nashik");
		mh.addLast("Lonavla");
		//System.out.println(mh.peekFirst());   //will just check and let us know which ele is there at first pos
											  //without removing the element
		
		System.out.println(mh.removeFirst());  //will just remove ele at first pos from the list
		
		System.out.println(mh);
	}

}
