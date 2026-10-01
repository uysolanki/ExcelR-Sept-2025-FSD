//Display All Prime Numbers from Array
package day4;

public class ArrayDemo4 {

	public static void main(String[] args) {
	
		int arr[]= {23, 18, 25, 40, 29};
		
		System.out.println("Prime numbers from array are as follows");
		for(int i=0; i<arr.length;i++)
		{
			int num=arr[i];											//i					arr[i]		num    flag
			int flag=0;												//0   is 0<5 True	23			23	   0			
			for(int j=2;j<=Math.sqrt(num);j++)						//1					18			18
			{
				
				if(num%j==0)
				{
					flag=1;
					break;
				}
			}
			
			if(flag==0)
			{
				System.out.println(num);
			}
			
		}
	}

}
