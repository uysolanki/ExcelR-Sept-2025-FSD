package day4;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]=new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=21;
		arr[3]=24;
		arr[4]=25;
		
		//arr[5]=29;  //ArrayIndexOutOfBoundsException
		
		int sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		System.out.println(sum);

	}

}
