package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
						//before the loop modCount=5
		for(int n:numbers)  			//which collection object am i iterating?
		{
			if(n%2==1)
			{
				numbers.remove(n);		//we r modifying the size of the same iteration which we r iterating
			}							//ConcurrentModificationException
		}
						//after the loop modCount=2
		System.out.println(numbers);

	}

}
