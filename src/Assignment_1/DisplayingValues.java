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
           
            while(rs.next()) 
            {
            	String name = rs.getString(1);
            	String actor = rs.getString(2);
            	String actress = rs.getString(3);
            	String director = rs.getString(4);
            	int year = rs.getInt(5);
            	System.out.println("|Movie\tActor\tActress\tDirector\tYear|");
            	System.out.println("|"+name+"\t"+actor+"\t"+actress+"\t"+director+"\t"+year+"|");
            }
                
        }
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
}
