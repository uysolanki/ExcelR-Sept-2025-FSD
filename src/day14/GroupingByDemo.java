package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {

	public static void main(String[] args) {
		List<String> words=new ArrayList(Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten","thirteen","twenty one"));
	
		Map<Integer,List<String>> hashmap=
				words.stream()
				.collect(Collectors.groupingBy(word->word.length()));
		
		System.out.println(hashmap);
		
		
		Map<Integer,Long> hashmap1=
				words.stream()
				.collect(Collectors.groupingBy(word->word.length(), Collectors.counting()));
		
		System.out.println(hashmap1);
	}
}

/*
{
3=[one]
}
*/
/*
3=[one,two,six,ten]
4=[four,five,nine]
5=[seven,eight,three]

[one, two, six, ten],[four, five, nine],[three, seven, eight]
*/