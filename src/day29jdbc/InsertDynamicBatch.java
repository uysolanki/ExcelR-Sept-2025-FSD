package day29jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDynamicBatch {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");			//5.1.15
		
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/excelrsept2026fsd", "root", ""
		);
		
		String query="insert into emp2 values(?,?,?)";
		
		PreparedStatement ps=connection.prepareStatement(query);
		
		for(int i=1;i<=3;i++)
		{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp number");
		int a=sc.nextInt();
		
		System.out.println("Enter emp name");
		String b=sc.next();
		
		System.out.println("Enter emp salary");
		double c=sc.nextDouble();
		
		
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setDouble(3, c);
		
		ps.addBatch();
		}
		
		int rows[]=ps.executeBatch();
		
		if(rows.length>=1)
			System.out.println(rows.length + " records inserted");
		
		
		ps.close();
		connection.close();
		


	}

}
