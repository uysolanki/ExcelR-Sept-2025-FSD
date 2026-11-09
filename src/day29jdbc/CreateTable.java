package day29jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args)  throws Exception
	{
		//Class.forName("com.mysql.cj.jdbc.Driver");	//8.0.33
		Class.forName("com.mysql.jdbc.Driver");			//5.1.15
		
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/excelrsept2026fsd", "root", ""
		);

		
		System.out.println(connection.isClosed()); //false
		
		String query="create table emp2(\r\n"
				+ "eno int(5),\r\n"
				+ "ename varchar(15),\r\n"
				+ "salary numeric(5,2));";
		
		Statement st=connection.createStatement();
		
		st.execute(query);
		
		System.out.println("Table Created successfully!!!");
		
		connection.close();
	}

}
