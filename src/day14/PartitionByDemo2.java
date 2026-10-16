package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByDemo2 {

	public static void main(String[] args) {
		List<String> months=Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December");
		
		//months ending with ber and not ending with ber
		
		Map<Boolean,List<String>> hashmap=months.stream()
				.collect(Collectors.partitioningBy(month->month.endsWith("ber")));
		System.out.println(hashmap);
		
		//display only those months which end with ber
		System.out.println(hashmap.get(true));
		
		//display count of months ending with ber and not ending with ber
		Map<Boolean,Long> hashmap1=months.stream()
				.collect(Collectors.partitioningBy(month->month.endsWith("ber"),Collectors.counting()));
		System.out.println(hashmap1);
		
		//display the values as a single string
		//{false="JanuaryFebruaryMarchAprilMayJuneJulyAugust", true="SeptemberOctoberNovemberDecember"}
		Map<Boolean,String> hashmap2=months.stream()
				.collect(Collectors.partitioningBy(month->month.endsWith("ber"),Collectors.joining()));
		System.out.println(hashmap2);
		
		//display the values as a single string with seperator
		//{false="January-February-March-April-May-June-JulyAugust", true="September-October-November-December"}
		Map<Boolean,String> hashmap3=months.stream()
				.collect(Collectors.partitioningBy(month->month.endsWith("ber"),Collectors.joining("-")));
		System.out.println(hashmap3);
	}

}


//{false=8, true=4}