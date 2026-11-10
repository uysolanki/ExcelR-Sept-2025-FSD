package day29jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCUsingMultithreadingLambda3 {
public static void main(String[] args) throws InterruptedException {
	
	
	new Thread(()->{
		try
		{
		Connection connection = ExcelrSept2026MySqlConnection.getDbConnection();
		String query1="insert into emp2 values(81,'Ben',	111.0)";
		String query2="insert into emp2 values(82,'Ben',	111.0)";
		String query3="insert into emp2 values(83,'Ben',	111.0)";
		String query4="insert into emp2 values(84,'Ben',	111.0)";
		String query5="insert into emp2 values(85,'Ben',	111.0)";
		
		
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
	}).start();
	
	
	new Thread(()->{
		try
		{
		Connection connection = ExcelrSept2026MySqlConnection.getDbConnection();
		String query1="insert into emp2 values(91,'Tom',	222.0)";
		String query2="insert into emp2 values(92,'Tom',	222.0)";
		String query3="insert into emp2 values(93,'Tom',	222.0)";
		String query4="insert into emp2 values(94,'Tom',	222.0)";
		String query5="insert into emp2 values(95,'Tom',	222.0)";
		
		
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
	}).start();
	
	new Thread(()->{
		try
		{
		Connection connection = ExcelrSept2026MySqlConnection.getDbConnection();
		String query1="insert into emp2 values(41,'Jerry',	333.0)";
		String query2="insert into emp2 values(42,'Jerry',	333.0)";
		String query3="insert into emp2 values(43,'Jerry',	333.0)";
		String query4="insert into emp2 values(44,'Jerry',	333.0)";
		String query5="insert into emp2 values(45,'Jerry',	333.0)";
		
		
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
	}).start();
	
}
}
