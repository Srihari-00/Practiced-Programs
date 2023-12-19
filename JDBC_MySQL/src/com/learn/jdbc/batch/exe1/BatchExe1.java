package com.learn.jdbc.batch.exe1;

import java.sql.*;
import java.util.*;

public class BatchExe1 
{
	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306/jdbc_database";
		String username = "root";
		String password = "SRIHARI123";
		Connection con = null;
		Scanner scan = null;
		PreparedStatement pstmt = null;
		String query;
		int id = 0;
		String name = null;
		int salary = 0;
		
		try
		{
			//Establishing the connection
			con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			//Creating the query
			query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
			//Preparing the statement
			pstmt = con.prepareStatement(query);
			scan = new Scanner(System.in);
			System.out.println("Enter the no. of Rows ");
			//Taking the user input and adding it to batch
			int rows = scan.nextInt();
			for(int i=1;i<=rows;i++)
			{
				System.out.println("Enter the id");
				id = scan.nextInt();
				System.out.println("Enter the name");
				name = scan.next();
				System.out.println("Enter the salary");
				salary = scan.nextInt();
				//Completing the statement
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, salary);
				//Adding the data to a Batch
				pstmt.addBatch();
			}
			//Executing the batch
			pstmt.executeBatch();
			System.out.println("Rows are inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				con.close();
				scan.close();
			}
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}
	}
}
