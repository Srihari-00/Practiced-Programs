package com.learn.jdbc.exe4;

import java.sql.*;

public class UpdateData {

	public static void main(String[] args) throws Exception 
	{
		String url = "jdbc:mysql://localhost:3306/jdbc_database";
		String username = "root";
		String password = "SRIHARI123";

		Connection con = DriverManager.getConnection(url,username,password);
		Statement stmt = con.createStatement();
		String query = "UPDATE STUDENT1 SET NAME = 'Srihari' WHERE ROLL = 4";
		//Executing the Query
		stmt.execute(query);
		System.out.println("Query is executed");
	}

}
