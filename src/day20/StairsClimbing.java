package day20;

public class StairsClimbing {

	public static void main(String[] args) {
		int n=4;
		
		int max=maxPossibleWays(n);
		System.out.println(max);

	}

	private static int maxPossibleWays(int n) {       //0	1   2   3  
		int dp[]=new int[n+1];                        //0   1   2   3
		
		dp[1]=1;
		dp[2]=2;
		
		for(int i=3;i<=n;i++)
			dp[i]=dp[i-1] + dp[i-2];
		
		return dp[dp.length-1];
	}

}
