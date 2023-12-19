package com.learn.jdbc.exe2;
import java.sql.*;
public class CreatingTable {

	public static void main(String[] args) 
	{
		try 
		{
			String url = "jdbc:mysql://localhost:3306/jdbc_database";
			String username = "root";
			String password = "SRIHARI123";
			String query = "CREATE TABLE STUDENT1(ROLL INT, NAME VARCHAR(10), MARKS INT)";
			
			//Establishing the Connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established");
			//Executing the query
			Statement stmt = con.createStatement();
			stmt.execute(query);
			System.out.println("Query is executed!!!");
			
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
