package day22;

public class FibonacciSeriesUsingRecursion {
	public static void main(String[] args) {
		int length=10;
		fibonacciSeries(length,1);
	}

	private static void fibonacciSeries(int length,int start) {
		if(start>length)
			return;
		int n=fibonacciNumber(start);
		System.out.print(n+"\t");
		fibonacciSeries(length,start+1);
	}

	private static int fibonacciNumber(int length) {
		if(length==1)
		{
			return 0;
		}
		else if(length==2)
		{
			return 1;
		}
		else
		{
			return (fibonacciNumber(length-1) + fibonacciNumber(length-2));
		}
	}
}
