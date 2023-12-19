package com.learn.jdbc.batch.exe2;

import java.sql.*;
import java.util.*;

public class BankApp {

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/jdbc_database";
		String username = "root";
		String password = "SRIHARI123";
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2= null;
		String query1 = null;
		String query2 = null;
		Scanner scan = null;
		int id = 0;
		String name = null;
		int balance = 0;
		
		try
		{
			//Connection the connection
			con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is Established");
			//Setting auto commit status as false
			con.setAutoCommit(false);
			//Creating the query to reduce amount from account 11
			query1 = "UPDATE BANK SET BALANCE = BALANCE-? WHERE ID = 11";
			//Creating the query to add amount from account 33
			query2 = "UPDATE BANK SET BALANCE = BALANCE+ ? WHERE ID = 33";
			scan = new Scanner(System.in);
			System.out.println("Enter the ammount to be transferred");
			int amount = scan.nextInt();
			//Preparing the statement
			pstmt1 = con.prepareStatement(query1);
			pstmt1.setInt(1, amount);
			//Preparing the statement
			pstmt2 = con.prepareStatement(query2);
			pstmt2.setInt(1, amount);
			//Executing the first query
			pstmt1.executeUpdate();
			//Executing the second query
			pstmt2.executeUpdate();
			System.out.println("Database is Updated");
			//Setting the changes after executing all queries
			con.commit();
		}
		catch(Exception e)
		{
			//Rolling back all the changes if any problem happened
			try 
			{
				con.rollback();
				System.out.println("Changes are rolled back");
			} 
			catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				pstmt1.close();
				pstmt2.close();
				scan.close();
			}
			catch (Exception e) {
				e.printStackTrace();			}
		}
		
	}

}
