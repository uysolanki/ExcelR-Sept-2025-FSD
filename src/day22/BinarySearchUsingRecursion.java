package day22;

public class BinarySearchUsingRecursion {
	
	public static void main(String[] args) {
		int arr[]= {2,3,5,7,9};   //data is not sorted
		int search=7;    
		int index=binarySearch(arr,search,0,arr.length-1);
		if(index!=-1)
			System.out.println("Found at Index "+index);
		else
			System.out.println("Not Found");
	}

	private static int binarySearch(int[] arr, int search,int start,int end) {
		if(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==search)
				return mid;
			else if(arr[mid]<search)
				 return binarySearch(arr,search,mid+1,end);
			else
				return binarySearch(arr,search,start,mid-1);
		}
		return -1;
	}
	
}
