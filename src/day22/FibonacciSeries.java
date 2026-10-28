package day22;

public class FibonacciSeries {
	public static void main(String[] args) {
		int length=10;
		fibonacciSeries(length);
	}

	private static void fibonacciSeries(int length) {
		int n1=0;
		int n2=1;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=3;i<=length;i++)
		{
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
	}
}
