package databaseprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Normalization {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/skillmine","root","root");
			if(conn==null)
			{
				System.out.println("unable to connect");
			}
			else
			{
				System.out.println("Sucessfully connected");
				PreparedStatement ps = conn.prepareStatement("create table skillmine.emp_backup like emp");
			    //ResultSet rs = ps.executeQuery();
				    ps.executeUpdate();
			    	System.out.println(" Query executed succesfully");
			    	PreparedStatement ps1 = conn.prepareStatement("insert into emp_backup(empno,mgr,deptno)select empno , mgr , deptno from emp");
				    //ResultSet rs = ps.executeQuery();
					    ps1.executeUpdate();
					    System.out.println("Inserted sucessfully");
					    PreparedStatement ps2 = conn.prepareStatement("select empno from emp_backup");
					    ResultSet rs = ps2.executeQuery();
					    while(rs.next())
					    {
					    	System.out.println(rs.getInt(1));
					    }
			    	
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Unable to create a table");
		}
		finally
		{
			conn.close();
		}
	}

}
