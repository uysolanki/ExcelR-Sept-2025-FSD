package day17;

public class BinarySearch {
	
	public static void main(String[] args) {
		int arr[]= {2,3,5,7,9};   //data is not sorted
		int search=15;    
		int index=binarySearch(arr,search);
		if(index!=-1)
			System.out.println("Found at Index "+index);
		else
			System.out.println("Not Found");
	}

	private static int binarySearch(int[] arr, int search) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==search)
				return mid;
			else if(arr[mid]<search)
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}
	
}
