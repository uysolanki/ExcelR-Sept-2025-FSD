package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<String> list2=new ArrayList(Arrays.asList("Alice","Ben","Chris","David","Frank")); //length=5
		
		System.out.println(list2.size());
		list2.add("Raj");
		System.out.println(list2);
		
		String search="Tom";  //found
		
//		int flag=0;
//		for(String s:list2)
//		{
//			if(s.equalsIgnoreCase(search))
//			{
//				flag=1;
//				System.out.println("Found");
//				break;
//			}
//		}
//		
//		if(flag==0)
//			System.out.println("Not Found");
		
		if(list2.contains(search))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		int index=list2.indexOf(search);
		if(index==-1)
			System.out.println("Not Found");
		else
			System.out.println("Found at index "+index);
		
		

	}

}
