package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		List<String> mh=new ArrayList(Arrays.asList("Pune","Mumbai","Nagpur")); //length=5
		List<String> rj=new ArrayList(Arrays.asList("Jaipur","Bikaner","Kota")); 
		
		List<List<String>> India=new ArrayList();
		India.add(rj);
		India.add(mh);
		
		//display Pune
		
		System.out.println(India.get(1).get(0));
	}

}
