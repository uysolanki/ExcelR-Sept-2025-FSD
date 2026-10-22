//Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray whose sum is equal to target.

package day18;

public class MaxSubArray {

	public static void main(String[] args) {
		//                  l r
		//          0 1 2 3 4 5
		int arr[]= {2,3,2,1,4,3};
		int target=7;
		int min=findMinimumSubArraySize(arr,target);
		System.out.println(min);

	}

	private static int findMinimumSubArraySize(int[] arr,int target) {
			int left=0;
			int min=Integer.MAX_VALUE;								//min=100,3,3,2
			int sum=0;
			for(int right=0;right<arr.length;right++)				//sum=0, 2, 5, 7, 5, 6,10,7,5,8
			{
				sum+=arr[right];
				
				while(sum>=target)
				{
					if(sum==target)
						{
						int ans= (right-left)+1;						//ans=3
					
						if(ans < min)
							{
							min=ans;
							}
						}
					sum-=arr[left];
					left++;
				}				
			}
			
			if(min==Integer.MAX_VALUE)
				return 0;
			else
				return min;
	}

}
