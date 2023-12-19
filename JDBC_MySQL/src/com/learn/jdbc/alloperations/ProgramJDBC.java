package com.learn.jdbc.alloperations;

import java.sql.*;
import java.util.*;

public class ProgramJDBC 
{
	Scanner scan = new Scanner(System.in);
	Statement stmt = null;
	PreparedStatement pstmt = null;

	//Creating the Table
	public void createTable(Connection con)
	{
		try
		{
			System.out.println("Enter the Name of the table");
			String name = scan.next();
			String query1 = "CREATE TABLE "+name+"(ID INT, NAME VARCHAR(20))";
			stmt = con.prepareStatement(query1);
			stmt.executeUpdate(query1);
			System.out.println("Table is created");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//Showing the Tables
	public void showTables(Connection con) 
	{
		try
		{
			String query1 = "SHOW TABLES";
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query1);
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//Retrieving the Data 
	public void readData(Connection con)
	{
		try
		{
			showTables(con);
			System.out.println("Enter the Table name to retrive data");
			String tableName = scan.next();
			String query = null;
			stmt = con.createStatement();
			ResultSet rs = null;
			switch(tableName)
			{
			case "drives":
				query = "SELECT * FROM DRIVES";			
				rs = stmt.executeQuery(query);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
				}
			case "employee":
				query = "SELECT * FROM EMPLOYEE";
				rs = stmt.executeQuery(query);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(1)+" "+rs.getInt(3));
				}
			case "employees":
				query = "SELECT * FROM EMPLOYEES";
				rs = stmt.executeQuery(query);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(1)+" "+rs.getInt(3));
				}
			case "hospital":
				query = "SELECT * FROM HOSPITAL";
				rs = stmt.executeQuery(query);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(1)+" "+rs.getString(3));
				}
			case "student":
				query = "SELECT * FROM STUDENT";
				rs = stmt.executeQuery(query);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(1));
				}
			case "unemployee":
				query = "SELECT * FROM UNEMPLOYEE";
				rs = stmt.executeQuery(query);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
				break;
			default :
				System.out.println("Invalid Option !!!");
				System.exit(0);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//Inserting the Data
	public void insertingData(Connection con)
	{
		try
		{
			showTables(con);
			System.out.println("Enter the Name of the Table to insert the data");
			String nameTable = scan.next();
			String query = null;
			String name = null;
			int id =0;
			switch(nameTable)
			{
			case "drives":
				query = "INSERT INTO DRIVES VALUES(?,?)";
				System.out.println("Enter the id");
				id = scan.nextInt();
				name = scan.next();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				System.out.println("Row is inserted");
				break;
			case "employee":
				query = "INSERT INTO employee VALUES(?,?)";
				System.out.println("Enter the id");
				id = scan.nextInt();
				System.out.println("Enter the name");
				name = scan.next();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				System.out.println("Row is inserted");
				break;
			case "employees":
				query = "INSERT INTO employees VALUES(?,?)";
				System.out.println("Enter the id");
				id = scan.nextInt();
				System.out.println("Enter the name");
				name = scan.next();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				System.out.println("Row is inserted");
				break;
			case "hospital":
				query = "INSERT INTO hospital VALUES(?,?)";
				System.out.println("Enter the id");
				id = scan.nextInt();
				System.out.println("Enter the name");
				name = scan.next();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				System.out.println("Row is inserted");
				break;
			case "student":
				query = "INSERT INTO student VALUES(?,?)";
				System.out.println("Enter the id");
				id = scan.nextInt();
				System.out.println("Enter the name");
				name = scan.next();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				System.out.println("Row is inserted");
				break;
			case "unemployee":
				query = "INSERT INTO UNEMPLOYEE VALUES(?,?)";
				System.out.println("Enter the id");
				id = scan.nextInt();
				System.out.println("Enter the name");
				name = scan.next();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				System.out.println("Row is inserted");
				break;
			default :
				System.out.println("Invalid Option !!!");
				System.exit(0);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//Updating the data
	public void updatingData(Connection con) 
	{
		try
		{
			showTables(con);
			System.out.println("Enter the Table name");
			String tableName = scan.next();
			String query = null;
			String name = null;
			String address = null;
			int id = 0;
			int packagee = 0;
			switch(tableName)
			{
			case "drives":
				query = "UPDATE DRIVES SET package = ? WHERE DRIVE_ID = ?";
				System.out.println("Enter the salary to be updated : ");
				packagee = scan.nextInt();
				System.out.println("Enter the id");
				id = scan.nextInt();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, packagee);
				pstmt.setInt(2, id);
				pstmt.executeUpdate();
				System.out.println("Updated Successfully");
				break;
			case "employee":
				query = "UPDATE EMPLOYEE SET SALARY = ? WHERE ID = ?";
				System.out.println("Enter the salary to be updated : ");
				packagee = scan.nextInt();
				System.out.println("Enter the id");
				id = scan.nextInt();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, packagee);
				pstmt.setInt(2, id);
				pstmt.executeUpdate();
				System.out.println("Updated Successfully");
				break;
			case "employees":
				query = "UPDATE DRIVES SET SALARY = ? WHERE ID = ?";
				System.out.println("Enter the salary to be updated : ");
				packagee = scan.nextInt();
				System.out.println("Enter the id");
				id = scan.nextInt();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, packagee);
				pstmt.setInt(2, id);
				pstmt.executeUpdate();
				System.out.println("Updated Successfully");
				break;
			case "hospital":
				query = "UPDATE DRIVES SET NAME = ? WHERE HOSPITAL_CODE = ?";
				System.out.println("Enter the NAME to be updated : ");
				packagee = scan.nextInt();
				System.out.println("Enter the HOSPITAL_CODE");
				id = scan.nextInt();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, packagee);
				pstmt.setInt(2, id);
				pstmt.executeUpdate();
				System.out.println("Updated Successfully");
				break;
			case "student":
				query = "UPDATE DRIVES SET NAME = ? WHERE ID = ?";
				System.out.println("Enter the NAME to be updated : ");
				packagee = scan.nextInt();
				System.out.println("Enter the id");
				id = scan.nextInt();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, packagee);
				pstmt.setInt(2, id);
				pstmt.executeUpdate();
				System.out.println("Updated Successfully");
				break;
			case "unemployee":
				query = "INSERT INTO UNEMPLOYEE VALUES(?,?)";
				System.out.println("Enter the id");
				id = scan.nextInt();
				System.out.println("Enter the name");
				name = scan.next();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				System.out.println("Row is inserted");
				break;
			default :
				System.out.println("Invalid Option !!!");
				System.exit(0);

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//Deleting the Data
	public void deleteData(Connection con) 
	{
		try
		{
			showTables(con);
			System.out.println("Enter the Table name");
			String tableName = scan.next();
			String query = null;
			int id = 0;
			int packagee = 0;
			String name = null;
			switch(tableName)
			{
			case "drives":
				query = "DELETE FROM DRIVES WHERE DRIVE_ID = ?";
				System.out.println("Enter the id");
				id = scan.nextInt();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.executeUpdate();
				System.out.println("Updated Successfully");
				break;
			case "employee":
				query = "DELETE FROM EMPLOYEE WHERE DRIVE_ID = ?";
				System.out.println("Enter the id");
				id = scan.nextInt();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.executeUpdate();
				System.out.println("Updated Successfully");
				break;
			case "employees":
				query = "DELETE FROM EMPLOYEES WHERE DRIVE_ID = ?";
				System.out.println("Enter the id");
				id = scan.nextInt();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.executeUpdate();
				System.out.println("Updated Successfully");
				break;
			case "hospital":
				query = "DELETE FROM HOSPITAL WHERE HOSPITAL_CODE = ?";
				System.out.println("Enter the id");
				id = scan.nextInt();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.executeUpdate();
				System.out.println("Updated Successfully");
				break;
			case "student":
				query = "DELETE FROM STUDENT WHERE ID = ?";
				System.out.println("Enter the id");
				id = scan.nextInt();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.executeUpdate();
				System.out.println("Updated Successfully");
				break;
			case "unemployee":
				query = "INSERT INTO UNEMPLOYEE VALUES(?,?)";
				System.out.println("Enter the id");
				id = scan.nextInt();
				System.out.println("Enter the name");
				name = scan.next();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				System.out.println("Row is inserted");
				break;
			default :
				System.out.println("Invalid Option !!!");
				System.exit(0);

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}