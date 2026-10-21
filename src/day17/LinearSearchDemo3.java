package day17;

public class LinearSearchDemo3 {

	public static void main(String[] args) {
		int arr[]= {8,2,3,7,4};   //data is not sorted
		int search=17;    
		int index=linearSearch(arr,search);
		
		if(index!=-1)
			System.out.println("Found at Index "+index);
		else
			System.out.println("Not Found");
	}

	private static int linearSearch(int[] arr,int search) {
				int flag=0;
				for(int i=0;i<arr.length;i++)			//n
				{						//8
					if(arr[i]==search)
					{
						return i;
					}
				}
				
				return -1;
	}

}
