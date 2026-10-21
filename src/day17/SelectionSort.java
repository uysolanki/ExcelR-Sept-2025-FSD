package day17;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {5,3,7,6,2};
		System.out.println("Before Selection Sort "+Arrays.toString(arr));
		

		selectionSortASC(arr);
		System.out.println("\nAfter Selection Sort in Ascending order "+Arrays.toString(arr));
		selectionSortDESC(arr);
		System.out.println("\nAfter Selection Sort in Descending order "+Arrays.toString(arr));
	}

	public static void selectionSortDESC(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

	private static void selectionSortASC(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
