package day29jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStatic {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");			//5.1.15
		
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/excelrsept2026fsd", "root", ""
		);
		
//		String query="select eno,ename from emp2 where eno=3";
		String query="select ename,eno from emp2 where eno=3";
		
		Statement st=connection.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
		if(rs.next())
//			System.out.println(rs.getInt(1) + "," + rs.getString(2));
			System.out.println(rs.getInt("eno") + "," + rs.getString("ename"));
		
		
		st.close();
		connection.close();
		


	}

}
