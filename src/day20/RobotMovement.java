package day20;

public class RobotMovement {

	public static void main(String[] args) {
		int rows=3;
		int columns=7;
		
		int result=playGame(rows,columns);
		System.out.println(result);

	}

	private static int playGame(int rows, int columns) {
		int dp[][]=new int[rows][columns];
		
		//fill the 1st row with 1's
		for(int i=0;i<columns;i++)
			dp[0][i]=1;
		
		//fill the 1st colums with 1's
				for(int i=0;i<rows;i++)
					dp[i][0]=1;
				
				
		for(int i=1;i<rows;i++)
		{
			for(int j=1;j<columns;j++)
			{
				dp[i][j]= dp[i][j-1] + dp[i-1][j];
			}
		}
		
		return dp[rows-1][columns-1];
	}

}
