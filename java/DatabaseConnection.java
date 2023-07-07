package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection connectDb() 
	{
		try {
			Connection con =null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/EMPLOYEE", "root", "Jtarun41");
			System.out.println("Connection is Successful");
			
			return con;
		} 
		catch (Exception e) 
		{
                
		}
		return null;
	}

}
