package day12;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();   //heterogenous
		
		
		list1.add(10);
		list1.add(10.5);
		list1.add("Alice");
		list1.add(true);
		list1.add('A');
		list1.add(new Student());
		
		System.out.println(list1);
		
		int n=(int) list1.get(0);		//typecasting overhead expense will be there if we use in heterogenous mode
										//to reduce/eliminate this overhead, we always prefer to use
										//collections as a homogenous also known as Generics
		
		
		ArrayList<String> list2=new ArrayList();   //homogenous
		
								//	  0		1     2     3      4
		list2.add("Alice");    	//  [Alice]
		list2.add("Ben");		//	[Alice, Ben, ]
		list2.add("Tom");		//	[Alice, Ben, Tom, ]
		list2.add("Jerry");		// 	[Alice, Ben, Tom, Jerry,]
		list2.add("Frank");		//	[Alice, Ben, Tom, Jerry, Frank]
		
	
		
		System.out.println(list2);
		System.out.println(list2.get(2));
		
		

	}

}
