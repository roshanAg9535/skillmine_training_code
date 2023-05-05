package databaseprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Updatetables {
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
				PreparedStatement ps = conn.prepareStatement("update student set name='jha' where id=1");
			    //ResultSet rs = ps.executeQuery();
				 ps.executeUpdate();
			    	System.out.println(" Query executed succesfully");
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
