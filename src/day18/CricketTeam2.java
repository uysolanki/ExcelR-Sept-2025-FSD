package day18;

import java.util.Arrays;

public class CricketTeam2 {
		public static void main(String[] args) {
			int players[]= {400,300,500,600};
			int teamSize=3;
			
			int max=maximumTeams(players,teamSize);
			System.out.println(max);
		}

		private static int maximumTeams(int[] players, int teamSize) {
			int start=0;
			int end=Arrays.stream(players).sum();		
			int iterationCount=0;
			while(start<=end)  
			{			
				iterationCount++;
				System.out.println("Iteration Count "+iterationCount);
				int mid=(start+end)/2;
				
				if(checkTeamPossible(players,teamSize,mid))
				{
					if(checkTeamPossible(players,teamSize,mid+1))
					{
						start=mid+1;
					}
					else
					{
						return mid;
					}
				}
				else
				{
					end=mid-1;									//1 -299
				}
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
//using lineaer search
//ans = 600  iteration count =601 : int players[]= {400,300,500,600}; int teamSize=3;

//using Binarysearch
//ans = 600  iteration count =11 : int players[]= {400,300,500,600}; int teamSize=3;

//{ [ ( ) ] }  well formed
//{ [ ( ] ) }  not well formed