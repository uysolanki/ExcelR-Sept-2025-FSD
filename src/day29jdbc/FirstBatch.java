package day29jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class FirstBatch implements Runnable{

	@Override
	public void run() {
		try
		{
		Connection connection = ExcelrSept2026MySqlConnection.getDbConnection();
		String query1="insert into emp2 values(51,'Ben',	111.0)";
		String query2="insert into emp2 values(52,'Ben',	111.0)";
		String query3="insert into emp2 values(53,'Ben',	111.0)";
		String query4="insert into emp2 values(54,'Ben',	111.0)";
		String query5="insert into emp2 values(55,'Ben',	111.0)";
		
		
		Statement st=connection.createStatement();
		
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		st.addBatch(query5);
														//		0			1			2		
		int rows[]=st.executeBatch();					//		1			1			1
		
		if(rows.length>=1)
			System.out.println(rows.length + " records inserted");
		
		
		st.close();
		connection.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
