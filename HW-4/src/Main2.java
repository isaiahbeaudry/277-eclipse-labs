import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main2
{
	public static void main(String []args) 
	{	
		try
		{

			Scanner files = new Scanner(System.in);
			PrintWriter conference = new PrintWriter("Conference.txt");
			PrintWriter dinner = new PrintWriter("Dinner.txt");
			PrintWriter lodging = new PrintWriter("Lodging.txt");
			File Sales = new File("sales.txt");
			Scanner check = new Scanner(Sales);

			int i = 1;
			String fileName = "";

			while(i <= 3)
			{
				System.out.println("What woud you like to name file " + i+ " (Conference, Dinner, Lodging)");
				fileName = files.next();
				while(!(fileName.equals("Conference") || fileName.equals("Dinner") || fileName.equals("Lodging"))) 
				{
					System.out.println("That's not an option");
					System.out.println("What woud you like to name file " + i + " (Conference, Dinner, Lodging)");
					fileName = files.next();
				}
				if(fileName.equals("Conference"))
				{
					conference = new PrintWriter("Conference.txt");
				}
				if(fileName.equals("Dinner"))
				{
					dinner = new PrintWriter("Dinner.txt");
				}
				if(fileName.equals("Lodging"))
				{
					lodging = new PrintWriter("Lodging.txt");
				}
				i += 1;
			}
			while(check.hasNext())
			{
				String service = check.nextLine();
				if(service.contains("Conference"))
				{
					conference.println(service);
				}
				if(service.contains("Lodging"))
				{
					lodging.println(service);
				}
				if(service.contains("Dinner"))
				{
					dinner.println(service);
				}
			}

			conference.close();
			lodging.close();
			dinner.close();
			check.close();
			files.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found: " + e);
		}
		catch (NoSuchElementException e)
		{
			System.out.println("File format not valid.");
		}
	}
}