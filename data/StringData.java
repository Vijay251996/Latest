package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class StringData {
	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Vijay14#");
		
		Statement smt=con.createStatement();
		ResultSet res= smt.executeQuery("Select FirstName, Address from Customers");
		
		while(res.next())
		{
			
			String str=res.getString("FirstName");
			System.out.print(str+" | ");
			String str2=res.getString("Address");
			System.out.println(str2);
			
		}
		
		
	}
}
