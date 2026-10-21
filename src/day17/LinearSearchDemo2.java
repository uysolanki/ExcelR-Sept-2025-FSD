package day17;

public class LinearSearchDemo2 {

	public static void main(String[] args) {
		int arr[]= {8,2,3,7,4};   //data is not sorted
		int search=7;    
		int result=linearSearch(arr,search);
		
		if(result==1)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}

	private static int linearSearch(int[] arr,int search) {
				int flag=0;
				for(int n:arr)			//n
				{						//8
					if(n==search)
					{
						flag=1;
						break;
					}
				}
				
				return flag;
	}

}
