package databaseprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Makingdatabase {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			if(conn==null)
			{
				System.out.println("unable to connect");
			}
			else
			{
				System.out.println("Sucessfully connected");
				PreparedStatement ps = conn.prepareStatement("create database college");
			    //ResultSet rs = ps.executeQuery();
				int result = ps.executeUpdate();
			    if(result>0)
			    {
			    	System.out.println("database created succesfully");
			    }
			    else
			    {
			    	System.out.println("unable to create database");
			    }
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
