package Assignment_1;
import java.util.*;

public class MulesoftAssignment 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner s=new Scanner(System.in);
		while(true)
		{
			int n;
			System.out.println("Available options to select choose one:");
			System.out.println("1.Show Database Connectivity.");
			System.out.println("2.Create a Table in the Database.");
			System.out.println("3.Insert values into the Table.");
			System.out.println("4.Display values from a Table.");
			System.out.println("5.Exit.");
			System.out.println("Select the option you want to select:");
			n=s.nextInt();
			switch(n) 
			{
				case 1: System.out.println("Enter the Database that you wish to create");
						String st = null;
						st=s.next();
						DatabaseConnection.DatabaseConnectivity(st);
						break;
				case 2: System.out.println("Enter the database name where you want to create the table:");
						st=s.next();
						CreatingTable.TableCreation(st);
						break;
				case 3: System.out.println("Enter the database name to connect and insert data into the table:");
						st=s.next();
						InsertingValues.Values(st);
						break;
				case 4: System.out.println("Enter the database name to connect and display the values from the table Movies");
						st=s.next();
						DisplayingValues.DisplayValues(st);
						break;
				default:System.out.println("Invalid Option");
						s.close();
						System.exit(0);
			}
		}
		
	}
}
