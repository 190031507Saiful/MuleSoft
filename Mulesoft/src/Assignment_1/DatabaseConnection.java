package Assignment_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseConnection {

	public static void DatabaseConnectivity(String databasename)throws Exception
	{
		//creating a variable for Connection
    	Connection connection =null;
    	Scanner sc=new Scanner(System.in);
        try {
        	//Connecting the database using DriverManger Interface
            connection = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/"+databasename+".db");  
            if (connection != null)
            { 
                System.out.println("A new database with the name " + databasename +" has been created.");  
            }  
   
        } 
        catch (SQLException e) 
        {
        	//Printing if any Exception is occurred
            System.out.println(e.getMessage());  
        }
        sc.close();
	}
}
