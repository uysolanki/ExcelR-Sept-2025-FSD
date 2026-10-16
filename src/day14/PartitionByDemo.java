package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		
		Map<Boolean,List<Integer>> hashmap=numbers.stream()
		.collect(Collectors.partitioningBy(n->n%2==0));
		
		System.out.println(hashmap);
		
		//downstream
		//{false=3, true=2}
		Map<Boolean,Long> hashmap1=numbers.stream()
				.collect(Collectors.partitioningBy(n->n%2==0,Collectors.counting()));
		System.out.println(hashmap1);

	}

}
