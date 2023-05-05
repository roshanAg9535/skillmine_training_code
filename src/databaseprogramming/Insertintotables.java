package databaseprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insertintotables {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			if(conn==null)
			{
				System.out.println("unable to connect");
			}
			else
			{
				System.out.println("Sucessfully connected");
				PreparedStatement ps = conn.prepareStatement("insert into student (id,name,address)values(2,'kumar','pune')");
			    //ResultSet rs = ps.executeQuery();
				 ps.executeUpdate();
			    	System.out.println(" Query executed succesfully");
			    	PreparedStatement ps1 = conn.prepareStatement("show tables");
				    ResultSet rs = ps1.executeQuery();
				    while(rs.next())
				    {
				    	System.out.println(rs.getString(1));
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
