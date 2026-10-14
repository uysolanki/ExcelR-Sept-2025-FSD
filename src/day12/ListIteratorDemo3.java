package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo3 {
                                                     //               itr
	public static void main(String[] args) {		//-1   0  1  2  3  4
		List<Integer> numbers=new ArrayList(Arrays.asList(10,21,31,50,40));
		ListIterator<Integer> itr=numbers.listIterator();
		
		while(itr.hasNext())
		{
			Integer value=itr.next();
			if(value%2==1)
			{
				itr.remove();
			}
		}
		
		System.out.println(numbers);
	

	}

}
