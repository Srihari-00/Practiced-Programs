package com.learn.jdbc.exe1;

import java.net.ConnectException;
//importing the java.sql package
import java.sql.*;
public class DriverLoading {

	public static void main(String[] args) 
	{
		try 
		{
			String url = "jdbc:mysql://localhost:3306/jdbc_database";
			String username = "root";
			String password = "SRIHARI123";
			//Loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is Loaded");
			//Establishing the connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
