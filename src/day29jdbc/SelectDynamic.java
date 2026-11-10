package day29jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectDynamic {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");			//5.1.15
		
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/excelrsept2026fsd", "root", ""
		);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp number");
		int a=sc.nextInt();
		
//		String query="select eno,ename from emp2 where eno=3";
		String query="select ename,eno from emp2 where eno=?";
		
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1, a);
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
//			System.out.println(rs.getInt(1) + "," + rs.getString(2));
			System.out.println(rs.getInt("eno") + "," + rs.getString("ename"));
		
		
		ps.close();
		connection.close();
		


	}

}
