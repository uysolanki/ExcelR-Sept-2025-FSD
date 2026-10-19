package day16;

import java.util.Optional;

public class OptionaDemo {

	public static void main(String[] args) {
//	String name=getUserName(0);
//	System.out.println(name.toUpperCase());
		
//		Optional<String> name=getUserNameinJava8(0);
//		System.out.println(name.orElse("Name Not Found"));
		
		Optional<String> name=getUserNameinJava8(1);
		name.ifPresent(n->System.out.println(n.toUpperCase()));

	}
	
	public static String getUserName(int n)
	{
		if(n==1)
			return "Alice";
		else
			return null;
	}
	
	public static Optional<String> getUserNameinJava8(int n)
	{
		if(n==1)
			return Optional.of("Alice");
		else
			return Optional.empty();
	}

}


/*

---------
|"Alice"|    of(
|       |
---------


---------
| empty |
|       |
---------

*/