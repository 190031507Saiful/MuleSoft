package Assignment_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayingValues 
{
	public static void DisplayValues(String s)throws Exception
    {
    	
        Connection conn = null;  
        try 
        {  
            conn = DriverManager.getConnection("jdbc:sqlite:C://sqlite/"+s+".db");
            Statement stmt = conn.createStatement();
            
            // retreiving the Records from the table 
            ResultSet rs = stmt.executeQuery("select * from Movies");
            System.out.println("Displaying All Values");
            System.out.println("|Movie\tActor\tActress\tDirector\tYear|");
            while(rs.next()) 
            {
            	String name = rs.getString(1);
            	String actor = rs.getString(2);
            	String actress = rs.getString(3);
            	String director = rs.getString(4);
            	int year = rs.getInt(5);
            	System.out.println("|"+name+"\t"+actor+"\t"+actress+"\t"+director+"\t"+year+"|");
            }
            ResultSet rs2 = stmt.executeQuery("select name from Movies");
            System.out.println("Displaying all values of column Name:");
            while(rs2.next()) 
            {
            	String name = rs.getString(1);
            	System.out.println("|"+name+"|");
            }
                
        }
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
}
