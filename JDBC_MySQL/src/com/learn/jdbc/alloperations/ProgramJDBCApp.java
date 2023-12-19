package com.learn.jdbc.alloperations;

import java.sql.*;
import java.util.*;

public class ProgramJDBCApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		String url = "jdbc:mysql://localhost:3306/kodnest";
		String username = "root";
		String password = "SRIHARI123";
		Connection con = null;
		try
		{
			con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			while(true)
			{

				System.out.println("Enter 1 to create a Table ");
				System.out.println("Enter 2 to Read the Table ");
				System.out.println("Enter 3 to inserting the data");
				System.out.println("Enter 4 to Updating the Table ");
				System.out.println("Enter 5 to Delete a Table ");
				System.out.println("Enter the choice to Perform");
				choice = scan.nextInt();
				ProgramJDBC pj = new ProgramJDBC();
				switch(choice)
				{
				case 1://Creating a table
					pj.createTable(con);
					break;
				case 2://Reading the data from the data base
					pj.readData(con);
					break;
				case 3://Inserting the data 
					pj.insertingData(con);
					break;
				case 4://Updating the database
					pj.updatingData(con);
					break;
				case 5://Deleting the data from the database
					pj.deleteData(con);
					break;
				default:
					System.out.println("Invalid choice Entered");
					System.exit(0);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}