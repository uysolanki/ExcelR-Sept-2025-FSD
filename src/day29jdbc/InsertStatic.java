package day29jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStatic {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");			//5.1.15
		
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/excelrsept2026fsd", "root", ""
		);
		
		String query="insert into emp2 values(1,'Alice',800.0)";
		
		Statement st=connection.createStatement();
		
		int rows=st.executeUpdate(query);
		
		if(rows>=1)
			System.out.println(rows + " records inserted");
		
		
		st.close();
		connection.close();
		


	}

}
