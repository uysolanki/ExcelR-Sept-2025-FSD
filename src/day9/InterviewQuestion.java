package day9;

public class InterviewQuestion {

	public static void main(String[] args) {
		
		int result=divide(10,0);
		System.out.println(result);

	}

	private static int divide(int numerator, int denominator)
	{
		try
		{
			System.out.println(numerator/denominator);
			return 1;
		}
		catch(ArithmeticException ex)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
	}

}
