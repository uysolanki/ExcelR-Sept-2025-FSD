package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamingAPIDemo {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		System.out.println("**** Imperative Style");
		//display the square of all odd numbers
		//Imperative style
		List<Integer> oddNumbers=new ArrayList();
		for(int n:numbers)
		{
			if(n%2==1)
				oddNumbers.add(n);
		}
		
		List<Integer> oddNumberSquares=new ArrayList();
		for(int n:oddNumbers)
		{
			int square=n*n;
			oddNumberSquares.add(square);
		}
		
		for(int n:oddNumberSquares)
		{
			System.out.println(n);
		}
		
		System.out.println("**** Funcitonal Style");
		numbers.stream()
		.filter(n->n%2==1)  //1,3,5 --> 1,9,25
		.map(n->n*n)
		.forEach(n->System.out.println(n));

		
		
		//display the sum of square of all odd numbers
		int result=numbers.stream()
		.filter(n->n%2==1)  //1,3,5 
		.map(n->n*n)        //1,9,25   ==>35
		.reduce(0,(acc,num)->acc+num);
		
		System.out.println(result);
		
	}

}
