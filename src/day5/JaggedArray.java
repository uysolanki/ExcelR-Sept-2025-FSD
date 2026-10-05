package day5;

public class JaggedArray {

	public static void main(String[] args) {
		//int matrix[][]=new int[3][3];
		
		int matrix[][]= {{10},{40,50,60},{70,80}};
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}

}


//A 102030405060708090

//B10	20	30	40	50	60	70	80	90

//C10	20	30	
//40	50	60	
//70	80	90