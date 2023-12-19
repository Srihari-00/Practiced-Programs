package mysqldemo;

import java.sql.*;

public class MysqlPractice {

	public static void main(String[] args) throws SQLException 
	{
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","SRIHARI123");
		
		Statement stmt=con.createStatement();
		
		String s = "select * from department";
		String r = "Insert into department values(6,'MechaTronics', 'Noida')";
		//String e = "delete from department where dept_id=6";
		//stmt.execute(e);
		stmt.execute(r);
		ResultSet rs = stmt.executeQuery(s);
		
		while(rs.next())
		{
			int eid=rs.getInt("DEPT_ID");
			String ename=rs.getString("DEPT_NAME");
			String eloc=rs.getString("DEPT_LOCATION");
			
			System.out.println(eid+"    "+ename+"    "+eloc);
		}
		con.close();
		
		System.out.println("Query Executed........");
	}

}
