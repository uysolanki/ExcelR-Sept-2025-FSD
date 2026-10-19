package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAnagrams {
public static void main(String[] args) {
	List<String> words=new ArrayList(Arrays.asList("silent","listen","note","tone","cab","abc","bca"));
	
	Map<String,List<String>> hashmap=words.stream()
			.collect(Collectors.groupingBy(str->{
				char arr1[]=str.toCharArray();  // ['l','i','s','t','e','n']
				Arrays.sort(arr1);             // ['e','i','l','n','s','t']
				String s3=new String(arr1);     //"eilnst"
				return s3;
			}));
	
	System.out.println(hashmap);
	
}
}


//[silent,listen]  [note,tone]  [cab,abc,bca]