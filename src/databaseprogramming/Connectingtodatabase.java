package databaseprogramming;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectingtodatabase {
	public static void main(String[] args) {
		Connection conn = null;//acting as global variable
		try {//it act like a local method
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			if(conn==null)
			{
				System.out.println("some issue happen");
			}
			else
			{
				System.out.println("Sucessfully connected");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
