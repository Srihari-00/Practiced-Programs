package com.learn.jdbc.exe5;

import java.sql.*;
import java.util.*;

public class DynamicQueries {

	public static void main(String[] args) throws Exception 
	{
		//Values for url, username and password for establishing the connection
		String url = "jdbc:mysql://localhost:3306/kodnest";
		String username = "root";
		String password = "SRIHARI123";
		//Taking user input for id, name and salary to be inserted in the table
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ID");
		int id = scan.nextInt();
		System.out.println("Enter the name : ");
		String name = scan.next();
		System.out.println("Enter the salary");
		int salary = scan.nextInt();
		//Creating the query to be executed for dynamic data
		String query = "INSERT INTO EMPLOYEES VALUES(?,?,?)"; //Query with placeHolders
		//Establishing the Connection
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection is Established");
		//Preparing the statement
		PreparedStatement pstmt = con.prepareStatement(query);
		//Completing the query to be executed
		pstmt.setInt(1, id);			//pstmt.setInt(placeholder Index, value)
		pstmt.setString(2, name);		//pstmt.setString(placeholder Index, value)
		pstmt.setInt(3, salary);		//pstmt.setInt(placeholder Index, value)
		//Executing the query 
		pstmt.executeUpdate();
		System.out.println("Row is inserted");
	}

}
