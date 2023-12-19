package com.practice.update.emp;

import java.sql.*;

public class Employee {

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/jdbc_database";
		String username = "root";
		String password = "SRIHARI123";
		String query = null;
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established...");
			stmt = con.createStatement();
			query = "UPDATE EMPLOYEES SET SALARY = SALARY+(SALARY*0.10) WHERE ID = ?";

			PreparedStatement pstmt = con.prepareStatement(query);
			//stmt.executeUpdate(query);
			System.out.println("Row got affected...");
			int id =1;
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
			query = "SELECT * FROM EMPLOYEES";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally {
			if(con!=null)
			{
				try {
					con.close();
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}

}
