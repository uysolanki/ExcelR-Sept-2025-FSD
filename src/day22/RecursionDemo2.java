package day22;

public class RecursionDemo2 {

	public static void main(String[] args) {
		System.out.println("I am in Main");
		int n=5+brazil();				//main calling test
		System.out.println("I am finally back in Main");				    //caller       callee
		System.out.println(n);												//main			//brazil
	}

	private static int brazil() {
		
		System.out.println("I am in Brazil");
		int b=10+brazil();													//caller       callee
		System.out.println("I am back in Brazil");							//brazil		//brazil		==> recursion wehn function calls itself
		return b;
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