package databaseprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Creatingviews {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/skillmine","root","root");
			if(conn==null)
			{
				System.out.println("unsble to connect");
			}
			else
			{
				System.out.println("Sucessfully connected");
				PreparedStatement ps = conn.prepareStatement("create view newsal(salaries) as select SAL from emp");
			    //ResultSet rs = ps.executeQuery();
				    ps.executeUpdate();
			    	System.out.println(" Query executed succesfully");
			    	PreparedStatement ps1 = conn.prepareStatement("select * from newsal");
				    ResultSet rs = ps1.executeQuery();
				    while(rs.next())
				    {
				    	System.out.println(rs.getInt(1));
				    }
					PreparedStatement ps2 = conn.prepareStatement("drop view newsal");
				    //ResultSet rs = ps.executeQuery();
					 ps2.executeUpdate();
					 System.out.println("view dropped succesfully");
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
