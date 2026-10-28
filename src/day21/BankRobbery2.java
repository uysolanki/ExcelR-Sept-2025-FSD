package day21;

import java.util.Arrays;

public class BankRobbery2 {

	public static void main(String[] args) {
//		int shifts[]= {0, 2, 2, 6, 6, 8, 9, 15};
//		int timeToRob=3;
//		int totalBankHours=15;
		
		int shifts[]= {0, 2, 2, 6, 6, 8, 9, 12};
		int timeToRob=5;
		int totalBankHours=15;
		int x=mission(shifts,timeToRob,totalBankHours);
		System.out.println(x==0?"Mission Impossible" : "Mission Completed at "+x + " hours");

	}

	private static int mission(int[] shifts, int timeToRob, int totalBankHours) {
		
		boolean gaurded1[]=new boolean[totalBankHours+1];
		System.out.println(Arrays.toString(gaurded1));
		for(int i=0;i<shifts.length;i+=2)
		{
			for(int j=shifts[i]+1;j<=shifts[i+1];j++)
				 gaurded1[j]=true;
		}
		System.out.println(Arrays.toString(gaurded1));
		int ungaurdedHours=0;
		for(int i=1;i<gaurded1.length;i++)
		{
			if(gaurded1[i]==false)
				ungaurdedHours++;
			
			if(timeToRob==ungaurdedHours)
				return i;
		}
		return 0;
	}

}
