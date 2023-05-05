package databaseprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MakingTables {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			if(conn==null)
			{
				System.out.println("unsble to connect");
			}
			else
			{
				System.out.println("Sucessfully connected");
				PreparedStatement ps = conn.prepareStatement("create table if not exists student1(id int(45) primary key auto_increment,name varchar(100),address varchar(100))");
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
