package com.learn.jdbc.exe3;
import java.sql.*;
public class InsertingData {

	public static void main(String[] args) 
	{
		try
		{
			String url = "jdbc:mysql://localhost:3306/jdbc_database";
			String username = "root";
			String password = "SRIHARI123";

			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			String query = "INSERT INTO STUDENT1 VALUES(4,'srihari',75)";
			//Executing the Query
			stmt.execute(query);
			System.out.println("Query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
