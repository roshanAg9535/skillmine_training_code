package databaseprogramming;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToAdatabase {
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
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
