
import java.io.*;
import java.util.*;
public class Main
{

	public static void main(String[]args)
	{

		Scanner input = new Scanner(System.in); 
		ArrayList<Sales> sales = new ArrayList<Sales>(); 
		int num = 0;

		do {
			do {
			try 
			{
				System.out.println("Pick 1 to add Sales \nPick 2 to print to file");
				num = input.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Try Again!");
				input.next();

			}
			} while(num < 1 && num > 2);
			if(num == 1)
			{
			input.nextLine();
			System.out.println("Enter Name: ");
			String name = input.nextLine();
			System.out.println("(Conference, Dinner, Lodging) Enter Service: ");
			String service = input.next();
			while(!(service.equals("Conference") || service.equals("Dinner") || service.equals("Lodging"))) 
			{
				System.out.println("That's not a service");
				System.out.println("(Conference, Dinner, Lodging) Enter Service: ");
				service = input.next();
			}
			double amount = 0.0;
			boolean corAmount = false;
			do 
			{
				try
				{
				System.out.println("Enter Amount: ");
				amount = input.nextDouble();
				corAmount = true;
				}
				catch(InputMismatchException e)
				{
					System.out.println("Invalid Input");
					input.next();
					
				}
			} while (corAmount == false);
			
			System.out.println("Enter Date: ");
			String date= input.next();
			sales.add(new Sales(name,service,amount,date));
			}
		}

		while(num != 2);
		{
			try 
			{
				PrintWriter out = new PrintWriter("sales.txt");
				for(int i = 0; i < sales.size(); i++)
				{
					out.print(sales.get(i).getName());
					out.print(";");
					out.print(sales.get(i).getService());
					out.print(";");
					out.print(sales.get(i).getAmount());
					out.print(";");
					out.print(sales.get(i).getDate());
					out.println();
				}
				out.close();
				input.close();
			} 
			catch (FileNotFoundException e)
			{
				System.out.println("File not found!");
			}
			catch (NoSuchElementException e)
			{
				System.out.println("File format not valid.");
			}
		}
		
	}
}
	