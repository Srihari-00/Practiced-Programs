package com.learn.jdbc.hybernate.exe1;

import java.sql.*;

public class StudentApp {

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/jdbc_database";
		String username = "root";
		String password = "SRIHARI123";
		    
		Student s1 = new Student(14,"Ajay",21);
		Student.connection(url,username,password);

		Student s2 = new Student(15,"Amit",22);
		Student.connection(url,username,password);

		Student s3 = new Student(16,"Ankit",24);
		Student.connection(url,username,password);

		
		

	}



}