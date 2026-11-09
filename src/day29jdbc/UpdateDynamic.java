package day29jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDynamic {

	public static void main(String[] args)  throws Exception
	{
		
		Connection connection = ExcelrSept2026MySqlConnection.getDbConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp number");
		int a=sc.nextInt();
		
		System.out.println("Enter emp name");
		String b=sc.next();
		
		System.out.println("Enter emp salary increment");
		double c=sc.nextDouble();
		
		String query="update emp2 set ename=?,salary=salary+? where eno=?";
		
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1, b);
		ps.setDouble(2, c);
		ps.setInt(3, a);
		
		
		
		int rows=ps.executeUpdate();
		
		if(rows>=1)
			System.out.println(rows + " records inserted");
		
		
		ps.close();
		connection.close();
		


	}

}
