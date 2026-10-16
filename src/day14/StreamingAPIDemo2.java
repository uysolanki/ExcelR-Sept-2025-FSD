package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamingAPIDemo2 {

	public static void main(String[] args) {
		List<String> months=Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December");
										//  7,         8         5          5     3      4    4        6           9         7        8           8
		
		List<Integer> monthLens=months.stream()
		.map(m->m.length())
		.toList();
		
		System.out.println(monthLens);
		
		
		
		//display me month names which have > 5 chars
		months.stream()
		.filter(m->m.length()>5)
		.forEach(m->System.out.println(m));
		
		
		//display how many month names have > 5 chars
			long ans=months.stream()
				.filter(m->m.length()>5)
				.count();
			
			System.out.println(ans);
	}

}
