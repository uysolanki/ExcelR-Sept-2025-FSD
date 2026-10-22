package day18;

import java.util.Arrays;

public class CricketTeam {
		public static void main(String[] args) {
			int players[]= {400,300,500,600};
			int teamSize=3;
			
			int max=maximumTeams(players,teamSize);
			System.out.println(max);
		}

		private static int maximumTeams(int[] players, int teamSize) {
			int sum=Arrays.stream(players).sum();		
			int iterationCount=0;
			for(int i=1;i<=sum;i++)    
			{			
				iterationCount++;
				System.out.println("Iteration Count "+iterationCount);
				if(!checkTeamPossible(players,teamSize,i))
						return i-1;											
			}	
			
			return -1;																
		}                                   //             p        
											//		{4,3,5,6};			4			4
		private static boolean checkTeamPossible(int[] players, int teamSize, int numberOfTeams) 
		{
			int playersNeeded=teamSize*numberOfTeams;  		//16
			
			int playersHave=0;   //4,7,11,15
			
			for(int p:players)
			{
				playersHave+=Math.min(p, numberOfTeams);
			}
			
			if(playersHave>=playersNeeded)
				return true;
			else
				return false;
		}
}
