package day29jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDynamic {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");			//5.1.15
		
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/excelrsept2026fsd", "root", ""
		);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp number");
		int a=sc.nextInt();
		
		System.out.println("Enter emp name");
		String b=sc.next();
		
		System.out.println("Enter emp salary");
		double c=sc.nextDouble();
		
		String query="insert into emp2 values(?,?,?)";
		
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setDouble(3, c);
		
		int rows=ps.executeUpdate();
		
		if(rows>=1)
			System.out.println(rows + " records inserted");
		
		
		ps.close();
		connection.close();
		


	}

}
