package day22;

public class RecursionDemo3 {

	public static void main(String[] args) {
		int  n=3;     //2! = 2 x 1!
		int ans=factorial(n);
		System.out.println(ans);
	}

	private static int factorial(int n) {
		if(n==1)		//base condition is achieved
			return 1;
		return n*factorial(n-1);
	}
}

/*																			
n!   = n x (n-1)!															factorial  n=2	<===1
5!   = 5 x 4 x 3 x 2 x 1 = 120												factorial  n=3	<===2
4!   =     4 x 3 x 2 x 1 = 24												main  n=3 ,ans   <====6
*/

//fibonacci series 
//0 1 2 3 5 8.... 

//accept the length 10
//0 1 2 3 5 8 13 21 34 55

//binary search using recursion