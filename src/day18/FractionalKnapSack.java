package day18;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {

	public static void main(String[] args) {
		int values[]= {60, 100, 120};
		int wt[]= 	  {10, 20,  40};
		int capacity=50;
		
//		int values[]= {60, 100, 120};
//		int wt[]= 	  {10, 20,  30};
//		int capacity=50;
		
		int max=calculateMaxEarning(values,wt,capacity);
		System.out.println(max);		//220

	}

	private static int calculateMaxEarning(int[] values, int[] wt, int capacity) {
		
		int n=values.length;			//n=3
		int knapsack[][]=new int[n][3];
		
		int maxEarning=0;
		
		for(int i=0;i<n;i++)
		{
			knapsack[i][0]=values[i];
			knapsack[i][1]=wt[i];
			knapsack[i][2]=values[i]/wt[i];
		}
		
		for(int arr[]:knapsack)
			System.out.println(Arrays.toString(arr));
		
		Comparator<int []> comparator= Comparator.comparingInt(a->a[2]);
		Arrays.sort(knapsack,comparator.reversed());
		System.out.println("-----");
		for(int arr[]:knapsack)
			System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<n;i++)					//maxEarning=0,60,160,220
		{										//capacity=50,40,20
			int value=knapsack[i][0];			//value=120
			int weight=knapsack[i][1];			//weight40
			
			if(weight<=capacity)				//is 40<=20 true
			{
				maxEarning+=value;
				capacity-=weight;
			}
			else
			{
				double per=  (double)capacity/weight;			//20/40   =0.5
				maxEarning+=value*per;
				capacity-=weight*per;
				break;
			}
		}
		
		return maxEarning;
		
	}

}
