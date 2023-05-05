package databaseprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Rightjoin {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/skillmine","root","root");
			if(conn==null)
			{
				System.out.println("some issue happen");
			}
			else
			{
				System.out.println("Sucessfully connected");
				PreparedStatement ps = conn.prepareStatement("select * from emp right join dept on emp.deptno=dept.deptno");
			    ResultSet rs = ps.executeQuery();
			    while(rs.next())
			    {
			    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getInt(7)+" "+rs.getInt(8)+" "+rs.getString(9)+" "+rs.getString(10));
			    }
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
