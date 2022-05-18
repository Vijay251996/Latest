package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;



public class Datab {
	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Vijay14#");
		
		Statement smt=con.createStatement();
		ResultSet res= smt.executeQuery("Select Avg(Physics),Avg(Maths)from Subjects");
		
		while(res.next())
		{
			
			int val= res.getInt(1);
			System.out.println(val);
			
		}
		
		
	}

}
