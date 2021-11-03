package Assignment_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CreatingTable 
{
	public static void TableCreation(String s)throws Exception
	{
		  Scanner sc=new Scanner(System.in);
	      Statement stmt = null;
	      try 
	      {
	    	 Connection c = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/"+s+".db");
	         stmt = c.createStatement();
	         String sql = "CREATE TABLE IF NOT EXISTS Movies (\n name text NOT NULL,\n actor text NOT NULL,\n actress text NOT NULL,\n director text NOT NULL,\n year int \n);"; 
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.close();
	      } 
	      catch ( Exception e ) 
	      {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("A table named Movies is created in the database "+s);
	      sc.close();
	}

}
