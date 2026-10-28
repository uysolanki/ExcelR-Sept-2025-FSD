package day20;

public class StairsClimbingUsingRecursion {

	public static void main(String[] args) {
		int n=4;
		
		int max=maxPossibleWays(n);
		System.out.println(max);
	}
	private static int maxPossibleWays(int n) {     
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else
		return maxPossibleWays(n-1) + maxPossibleWays(n-2);	
	}

}
