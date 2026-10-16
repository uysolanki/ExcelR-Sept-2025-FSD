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
		
		
		Map<String,Double> hashmap2=new HashMap();
		hashmap2.put("Alice", 800.0);
		hashmap2.put("Ben",   900.0);  //old value
		hashmap2.put("Chris", 1000.0);
		
		hashmap2.putIfAbsent("Tom",   1500.0); //new value  ->overwrite the valye
		hashmap2.putIfAbsent("Alice",   1500.0);
		System.out.println(hashmap2);
	}

}
