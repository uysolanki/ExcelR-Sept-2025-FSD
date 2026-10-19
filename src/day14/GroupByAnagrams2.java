package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAnagrams2 {
public static void main(String[] args) {
	List<String> words=new ArrayList(Arrays.asList("silent","listen","note","tone","cab","abc","bca"));
	
	Map<String,List<String>> hashmap=words.stream()
			.collect(Collectors.groupingBy(AnagramStrings2::getSortedString));
	
	System.out.println(hashmap.values());
	
}
}


//[silent,listen]  [note,tone]  [cab,abc,bca]