package day21;

public class BankRobbery {

	public static void main(String[] args) {
//		int shifts[]= {0, 2, 2, 6, 6, 8, 9, 15};
//		int timeToRob=3;
//		int totalBankHours=15;
		
		int shifts[]= {0, 2, 2, 6, 6, 8, 9, 12};
		int timeToRob=3;
		int totalBankHours=15;
		
		System.out.println(mission(shifts,timeToRob,totalBankHours)?"Mission Possible": "Mission Impossible");

	}

	private static boolean mission(int[] shifts, int timeToRob, int totalBankHours) {
		
		int gaurdedHours=0;
		for(int i=0;i<shifts.length;i+=2)
		{
			gaurdedHours=gaurdedHours+(shifts[i+1]-shifts[i]);
		}
		System.out.println(gaurdedHours);
				
		int ungaurdedHours=totalBankHours-gaurdedHours;
		System.out.println(ungaurdedHours);
		return timeToRob<=ungaurdedHours;
	}

}
