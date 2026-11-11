package day29jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ExcelRHikariMySqlConnectionPool {

	private static HikariDataSource dataSource;
	
	
    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/excelrsept2026fsd");
        config.setUsername("root");
        config.setPassword("");

        config.setMaximumPoolSize(10);  	// Max connections at a time
        config.setMinimumIdle(3);       	// Keep 2 idle connections ready
        config.setConnectionTimeout(30000); // Wait 30 seconds for a connection

        dataSource = new HikariDataSource(config);
    }

    public static HikariDataSource getDataSource() {
        return dataSource;
    }

	
}
