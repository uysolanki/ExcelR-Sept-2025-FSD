package day14;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Printing p1=()-> {
			System.out.println("Printing in Magazine");	
		};
		
		p1.print();
		
//		Greeting g1= (name) -> {
//			System.out.println("Welcome to FSD, "+name);
//		};
		
		//if the method contains single arguement the () is optional, is you wish you can skip it
		
//		Greeting g1= name -> {
//			System.out.println("Welcome to FSD, "+name);
//		};
//		g1.greet("Rohit");
		
		//if the method body contains single line of code the {} is optional, is you wish you can skip it
		//if the method body contains single line of code then return keyword is inbuilt added by java we dont have to add
		Greeting g1= name -> System.out.println("Welcome to FSD, "+name);
		g1.greet("Surya");
		
		
		Shape s1= (r)-> Math.PI*r*r;
		
		double areaOfCircle=s1.area(5);
		System.out.println(areaOfCircle);
		
		Sample s2=(n,c)-> System.out.println("Welcome, "+ n + " to "+c);
		s2.display("Virat", "London");
		s2.display("Dhoni", "Chennai");
		s2.display("Rohit", "Mumbai");
	}
}	
	
	
	//lambda expression
	//plus
	//4. -> operator
	//5. ;
	
	//minus
	//1. access specifier
	//2. return type
	//3. method name
//	()->
//	{
//			System.out.println("Welcome to FSD");
//	};

//}
//shoe + socks
//paper + pencil
//bike + fuel
//lambda expression + functional interface   -> SAM  Single Abstract Method