package day29jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ExcelrSept2026MySqlConnection {

	private static Connection con;
	
	public static Connection getDbConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");			//5.1.15
		
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/excelrsept2026fsd", "root", ""
		);	
		
		return connection;
	}
	
}
