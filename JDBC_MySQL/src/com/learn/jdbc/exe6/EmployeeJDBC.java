package com.learn.jdbc.exe6;

import java.util.*;

import java.sql.*;

public class EmployeeJDBC {

	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/jdbc_database";
		String username = "root";
		String password = "SRIHARI123";
		System.out.println("Enter number of rows to be inserted");
		int rows = scan.nextInt();
		//Loading the Driver
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection is established ");
		
		String query = "INSERT INTO EMPLOYEES VALUES(?,?,?)";
		//Preparing the statement
		PreparedStatement pstmt = con.prepareStatement(query);
		//Taking the user input and inserting the data into the database 
		for(int i=1;i<=rows;i++)
		{
			System.out.println("Enter the id");
			int id = scan.nextInt();
			System.out.println("Enter the name");
			String name = scan.next();
			System.out.println("Enter the salary");
			int salary = scan.nextInt();
			//Completing the query
			pstmt.setInt(1,id);
			pstmt.setString(2, name);
			pstmt.setInt(3, salary);
			//Executing the Query
			pstmt.executeUpdate();
			System.out.println("Row "+i+" is insterted");
			
		}
		
		
	}

}
