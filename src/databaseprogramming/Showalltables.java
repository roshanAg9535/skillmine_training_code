package databaseprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Showalltables {
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
				PreparedStatement ps = conn.prepareStatement("show tables");
			    ResultSet rs = ps.executeQuery();
			    while(rs.next())
			    {
			    	System.out.println(rs.getString(1));
			    }
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
