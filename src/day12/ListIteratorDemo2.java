package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIteratorDemo2 {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		List<Integer> oddNumbers=new ArrayList();
		
		for(int n:numbers)  			//numbers=[1,2,3,4,5]  => [2,4]
		{
			if(n%2==1)
			{
				oddNumbers.add(n);		//oddNumbers[1,3,5]
			}							
		}
		
		numbers.removeAll(oddNumbers);
		System.out.println(numbers);

	}

}
