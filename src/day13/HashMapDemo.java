package day13;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String,Double> hashmap=new HashMap();
		hashmap.put("Alice", 800.0);
		hashmap.put("Ben",   900.0);
		hashmap.put("Chris", 1000.0);
		System.out.println(hashmap);
		
		hashmap.put("Ben",   1500.0);
		System.out.println(hashmap);
		
		for(String name:hashmap.keySet())
			System.out.println(name);
		
		for(Double salary:hashmap.values())
			System.out.println(salary);
		
		for(Entry<String,Double> emp:hashmap.entrySet())
			System.out.println(emp.getKey() + "," + emp.getValue());
		
		
		double maxSalary=0;
		for(Double salary:hashmap.values())
		{
			if(salary>maxSalary)
				maxSalary=salary;
		}
		
		System.out.println("MaxSalary" +maxSalary);
	}

}
