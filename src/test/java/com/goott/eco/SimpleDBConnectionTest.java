package com.goott.eco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleDBConnectionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String user = "eco"; 
        String pw = "eco1234";
        String url = "jdbc:oracle:thin:@172.16.5.1:1521:orcl";
        
        Class.forName("oracle.jdbc.driver.OracleDriver");        
        Connection conn = DriverManager.getConnection(url, user, pw);

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select 1 from dual");
        
        rs.next();
        System.out.println(rs.getString(1));
        rs.close();
        stmt.close();
        conn.close();
	}
}
