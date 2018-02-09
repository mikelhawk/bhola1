/*
 * This is the main class for the Account System database
 */
import java.util.*;

public class MainClass
{
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args)
	{
		/**
		 * This ArrayList holds all accounts in the system
		 */
		ArrayList<Account> acc = new ArrayList<Account>();
		
		Shipping s1 = new Shipping("370 Northside Drive NW", "Atlanta", "Georgia", 30318);
		Shipping s2 = new Shipping("800 West Marietta Street NW", "Atlanta", "Georgia", 30318);
		Shipping s3 = new Shipping("400 Roswell Road NE", "Atlanta", "Georgia", 30324);
		Shipping s4 = new Shipping("3480 McClure Woods Drive", "Duluth", "Georgia", 30096);
		Shipping s5 = new Shipping("3608 White Oak Way", "Huntsville", "Alabama", 35805);
		
		Account a1 = new Account("blustate96@gmail.com", "Brandon Lu", "BLU", s1);
		Account a2 = new Account("brandonlu@gmail.com", "Brandon Lu", "BLU", s2);
		Account a3 = new Account("blupickup966@gmail.com", "Brandon Lu", "BLU", s3);
		Account a4 = new Account("blu3@student.gsu.edu", "Brandon Lu", "BLU", s4);
		Account a5 = new Account("askbrandon@yahoo.com", "Brandon Lu", "BLU", s5);
		
		acc.add(a1);
		acc.add(a2);
		acc.add(a3);
		acc.add(a4);
		acc.add(a5);
		
		mainMenu(acc);

		
//		for (int i = 0; i < acc.size(); i++)
//		{
//			Account a = acc.get(i);
//			System.out.println(a.toString());
//			System.out.println();
//		}
	}
	
	/**
	 * Main Menu
	 */
	public static void mainMenu(ArrayList<Account> acc)
	{		
		/**
		 * Menu option input by user
		 */
		int option;
		
		System.out.println("1: View all accounts");
		System.out.println("2: Access an account");
		System.out.println("3: Add an account");
		System.out.println("4: Delete an account");
		System.out.println();
		
		System.out.print("Welcome, Please select an option from the menu above: ");
		Scanner s = new Scanner(System.in);
		option = s.nextInt();
		System.out.println();
		
		// While user input is out of range of main menu, ask for a valid input
		while (option < 1 || option > 4)
		{
			System.out.print("Invalid entry, please enter an option 1-4: ");
			option = s.nextInt();
			System.out.println();
		}
		
		//Call view method
		if (option == 1)
		{
			view(acc, option, s);
		}
		
		//Call access method
		if (option == 2)
		{
			
		}
	}
	
	/**
	 * This method displays the emails of all Accounts in ArrayList acc
	 * @param acc
	 */
	public static void view(ArrayList<Account> acc, int option, Scanner s)
	{
		for (int i = 0; i < acc.size(); i++)
		{
			System.out.println(acc.get(i).getEmail());
		}
		
		System.out.println();
		System.out.print("Enter 0 to return to the Main Menu: ");
		option = s.nextInt();

		
		while (option != 0)
		{
			System.out.println();	
			System.out.print("Please enter 0 to return to the Main Menu: ");
			option = s.nextInt();
		}
		System.out.println();
		
		//Return to Main Menu
		if (option == 0)
		{
			mainMenu(acc);
		}
	}
	
	/**
	 * This method allows the user to modify an account
	 */
	public static void access(ArrayList<Account> acc, int option, Scanner s)
	{
		//List all Account email addresses
		for (int i = 0; i < acc.size(); i++)
		{
			System.out.println((i + 1) + ": " + acc.get(i).getEmail());
		}
		
		System.out.println();
		System.out.print("Please select an account to access: ");
		option = s.nextInt();
		System.out.println();
		System.out.println();
		
		if (option < 1 || option > acc.size())
		{
			System.out.print("Invalid entry: Please enter a number 1-" + acc.size());
			System.out.println();
		} else
		{
			System.out.println("Account: " + acc.get(option));
		}
	}
}
