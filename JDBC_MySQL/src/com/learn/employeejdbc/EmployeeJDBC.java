package com.learn.employeejdbc;

import java.sql.*;
import java.util.*;

public class EmployeeJDBC {
	public static void main(String[] args) throws Exception
	{
		try
		{
			String url = "jdbc:mysql://localhost:3306/jdbc_database";
			String userName = "root";
			String password = "SRIHARI123";
			String Query1 = "Create table employee(Id int, Name varchar(30), Salary int)";
			//Establishing the connection 
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is Established");
			//Creating the statement using Connection
			Scanner scan = new Scanner(System.in);
			Statement stmt=con.createStatement();
			while(true)
			{
				System.out.println("Enter 1 for insertion of data");
				System.out.println("Enter 2 for Updation of data");
				System.out.println("Enter 3 for Deleting of data");
				System.out.println("Enter 4 for Select of data");
				System.out.println("Enter any other for Terminate the loop");
				int choice = scan.nextInt();
				if(choice == 1)
				{
					insert(stmt);
				}
				else if(choice == 2)
				{
					update(stmt);
				}
				else if(choice == 3)
				{
					delete(stmt);
				}
				else if(choice == 4)
				{
					select(stmt);
				}
				else
				{
					System.out.println("Invalid Option !!");
					System.exit(0);
				}
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//Inserting the data into the database
	public static void insert(Statement stmt) throws Exception
	{
		String query = "INSERT INTO EMPLOYEE VALUES (1,'Ajay',35000),(2,'Ankit',45000),(3,'Amit',55000)";
		stmt.executeUpdate(query);
		System.out.println("1 Row is inserted");
				
	}
	//Updating the data in the database
	public static void update(Statement stmt) throws Exception
	{
		String query = "UPDATE EMPLOYEE SET SALARY = 60000 WHERE ID = 1";
		stmt.executeUpdate(query);
		System.out.println("Row is Updated");
	}
	//Deleting the data from the database
	public static void delete(Statement stmt) throws Exception
	{
		String query = "DELETE FROM EMPLOYEE WHERE ID = 3";
		stmt.executeUpdate(query);
		System.out.println("Row is Deleted");
	}
	//Retrieving the data from the database
	public static void select(Statement stmt) throws Exception
	{
		String query = "SELECT * FROM EMPLOYEE";
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}


}
