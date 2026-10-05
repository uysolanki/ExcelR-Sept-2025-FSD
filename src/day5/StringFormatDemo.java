package day5;

public class StringFormatDemo {

	public static void main(String[] args) {
		
		String name="Alice";
		int age=19;
		double height=5.6;
		
		System.out.println(String.format("My name is %s I am %d years old & my height is %.2f feets",name,age,height));

		System.out.println(String.format("%-10s%-10s","Item","Price"));
		System.out.println(String.format("%-10s%5d","Tie",500));
		System.out.println(String.format("%-10s%5d","Belt",700));
		System.out.println(String.format("%-10s%5d","Trouser",1500));
		System.out.println(String.format("%-10s%5d","Total",2200));
	}

}
