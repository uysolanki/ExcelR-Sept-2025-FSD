package day17;

public class LinearSearchDemo4 {

	public static void main(String[] args) {
		int arr[]= {8,2,3,7,4};   //data is not sorted
		int search=8;    
		int index=linearSearch(arr,search);
		
		System.out.println(index!=-1?"Found at Index "+index :"Not Found");
	}

	private static int linearSearch(int[] arr,int search) {
				int flag=0;
				for(int i=0;i<arr.length;i++)								
					if(arr[i]==search) 	return i;
					
				return -1;
	}

}

//businessman
//opens shop 7 days a week Mon->Sun
//daily income[100,200,500,300,1000,200,800]
//target 1 : 1500                                //target achieved on day 5
//target 1 : 5000                                //-1
//return on which day is he achieving the target
//if target not achieved return -1;


//enter number of targets : 3
//enter target 1 : 800   					//target achieved on day 3
//enter target 2 : 1200   					//target achieved on day 5
//enter target 3 : 2000  					//target achieved on day 5
