package Assignment_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertingValues 
{
	public static void Values(String s)throws Exception 
	{
		  Scanner sc=new Scanner(System.in);
	      Statement stmt = null;
	      try 
	      {
	    	 Connection c = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/"+s+".db");
	         stmt = c.createStatement();
	         System.out.println("Enter Name of the movie:");
	         String name=sc.next();
	         System.out.println("Enter Actor of the movie:");
	         String actor=sc.next();
	         System.out.println("Enter Actress of the movie:");
	         String actress=sc.next();
	         System.out.println("Enter Direcctor of the movie:");
	         String director=sc.next();
	         System.out.println("Enter Year of the movie:");
	         int year=sc.nextInt();
	         String sql = "INSERT INTO Movies (name, actor,actress,director,year)  \n"
	        		 +"VALUES ("+"'"+name+"'"+","+"'"+actor+"'"+","+"'"+actress+"'"+","+"'"+director+"'"+","+year+");"; 
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.close();
	      } 
	      catch ( Exception e ) 
	      {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("inserted values into the table");
	      sc.close();
	   }

}
