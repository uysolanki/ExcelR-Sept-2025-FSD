package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.println("Enter your name");
		String name=br.readLine();   //tendancy of throwing IOException
		}
		catch(IOException ex1)
		{
			
		}

	}

}
