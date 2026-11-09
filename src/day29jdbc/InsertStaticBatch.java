package day29jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStaticBatch {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");			//5.1.15
		
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/excelrsept2026fsd", "root", ""
		);
		
		String query1="insert into emp2 values(2,'Ben',	 900.0)";
		String query2="insert into emp2 values(3,'Chris',950.0)";
		String query3="insert into emp2 values(4,'David',960.0)";
		
		
		Statement st=connection.createStatement();
		
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
														//		0			1			2		
		int rows[]=st.executeBatch();					//		1			1			1
		
		if(rows.length>=1)
			System.out.println(rows.length + " records inserted");
		
		
		st.close();
		connection.close();
		


	}

}
