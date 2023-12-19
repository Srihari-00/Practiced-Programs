package com.practice.jdbc.alloperations;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Student 
{
	static int rollNo;
	static String name;
	static int age;
	static Connection con;
	static PreparedStatement pstmt;
	static Scanner scan = new Scanner(System.in);

	public Student(int rollNo, String name,int age)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	public static void connection(String url,String username,String password)
	{
		try {
			con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			insert(rollNo,name,age);
		} 
		catch (Exception e)
		{


			e.printStackTrace();
		}

	}
	public static void insert(int rollNo, String name, int age)
	{
		String query = "INSERT INTO STUDENT VALUES (?,?,?)";

		try 
		{
			pstmt = con.prepareStatement(query);
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,rollNo);
			pstmt.setString(2,name);
			pstmt.setInt(3, age);
			pstmt.addBatch();
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.executeBatch();
				System.out.println("Rows is inserted....");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}
