package day29jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateStatic2 {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");			//5.1.15
		
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/excelrsept2026fsd", "root", ""
		);
		
		String query="update emp2 set ename='Krish',salary=salary+10 where eno=3";
		
		Statement st=connection.createStatement();
		
		int rows=st.executeUpdate(query);
		
		if(rows>=1)
			System.out.println(rows + " records updated");
		
		
		st.close();
		connection.close();
		


	}

}
