package day14;

public class AccumulatorPattern {

	public static void main(String[] args) {
		int arr[]= {1,9,25};
		int acc=0;       //sum
		
		for(int n:arr)  //n=25		acc=0,1,10,35
		{
			acc+=n;
		}
		
		System.out.println(acc);

	}

}
