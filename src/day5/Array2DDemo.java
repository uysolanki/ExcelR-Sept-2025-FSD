package day5;

public class Array2DDemo {

	public static void main(String[] args) {
		//int matrix[][]=new int[3][3];
		
		int matrix[][]= {{10,24,30},{26,51,34},{37,29,44}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		int max=matrix[0][0];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				if(matrix[i][j]>max)
					max=matrix[i][j];
			}	
		}
		System.out.println(max);
	}

	
}


//A 102030405060708090

//B10	20	30	40	50	60	70	80	90

//C10	20	30	
//40	50	60	
//70	80	90

//row wise max number
//max number from row 1 is 30
//max number from row 2 is 51
//max number from row 3 is 44