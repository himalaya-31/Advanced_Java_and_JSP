package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataFetch {
	public static void main (String... arg){
		try {
			 Class.forName("org.postgresql.Driver");
			 
			 Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:4321/postgres", "postgres", "osahub");
			 
			 Statement s = c.createStatement();
			 
			 ResultSet rs = s.executeQuery("select * from emp");
			 
			 
			 
			 while (rs.next()) {

	   			 String salary = rs.getString("salary");
	   			 System.out.print(rs.getString("name"));
	   			 System.out.println("\t" + rs.getString(2));

	   		 }
			 
			 int a = s.executeUpdate("Update emp set salary = 40000 where name = 'Ashish' ");
			 
			 System.out.println(a);
			 
			 System.out.println("Hello");
			 
			 /*int b = s.executeUpdate("Insert into emp values('Abc', 35000)");
			 
			 System.out.println(b);*/

	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
