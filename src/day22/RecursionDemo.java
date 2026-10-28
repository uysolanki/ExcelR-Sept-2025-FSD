package day22;

public class RecursionDemo {

	public static void main(String[] args) {
		System.out.println("I am in Main");
		int n=5+brazil();				//main calling test
		System.out.println("I am finally back in Main");				    //caller       callee
		System.out.println(n);
	}

	private static int brazil() {
		
		System.out.println("I am in Brazil");
		int b=10+france();											//15
		System.out.println("I am back in Brazil");
		return b;
	}

	private static int france() {
		int f=15;
		System.out.println("I am in France");
		return f;
	}

}

/*

"I am in Main"
"I am in Brazil
I am in France
I am back in Brazil
I am finally back in Main
30

*/