package day29jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDynamic {

	public static void main(String[] args)  throws Exception
	{
		
		Connection connection = ExcelrSept2026MySqlConnection.getDbConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp number");
		int a=sc.nextInt();
		
		String query="delete from emp2 where eno=?";
		
		PreparedStatement ps=connection.prepareStatement(query);
		
		ps.setInt(1, a);
		
		
		
		int rows=ps.executeUpdate();
		
		if(rows>=1)
			System.out.println(rows + " records deleted");
		
		
		ps.close();
		connection.close();
		


	}

}
