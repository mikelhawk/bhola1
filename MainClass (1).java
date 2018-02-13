/*
 * Brandon Lu
 * Megan Kennemore
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
		
		Shipping s1 = new Shipping("370 Northside Drive NW", "Atlanta", "Georgia", "30318");
		Shipping s2 = new Shipping("800 West Marietta Street NW", "Atlanta", "Georgia", "30318");
		Shipping s3 = new Shipping("400 Roswell Road NE", "Atlanta", "Georgia", "30324");
		Shipping s4 = new Shipping("3480 McClure Woods Drive", "Duluth", "Georgia", "30096");
		Shipping s5 = new Shipping("3608 White Oak Way", "Huntsville", "Alabama", "35805");
		
		Billing b1 = new Billing("370 Northside Drive NW", "Atlanta", "Georgia", "30318");
		Billing b2 = new Billing("800 West Marietta Street NW", "Atlanta", "Georgia", "30318");
		Billing b3 = new Billing("400 Roswell Road NE", "Atlanta", "Georgia", "30324");
		Billing b4 = new Billing("3480 McClure Woods Drive", "Duluth", "Georgia", "30096");
		Billing b5 = new Billing("3608 White Oak Way", "Huntsville", "Alabama", "35805");
		
		Credit c1 = new Credit("Brandon Lu", "1234567890123456", "123", "January", "2021");
		Credit c2 = new Credit("Brandon Lu", "1234567890123456", "123", "January", "2021");
		Credit c3 = new Credit("Brandon Lu", "1234567890123456", "123", "January", "2021");
		Credit c4 = new Credit("Brandon Lu", "1234567890123456", "123", "January", "2021");
		Credit c5 = new Credit("Brandon Lu", "1234567890123456", "123", "January", "2021");
		
		Finance f1 = new Finance(c1, b1);
		Finance f2 = new Finance(c2, b2);
		Finance f3 = new Finance(c3, b3);
		Finance f4 = new Finance(c4, b4);
		Finance f5 = new Finance(c5, b5);
		
		Account a1 = new Account("blustate96@gmail.com", "Brandon Lu", "BLU", s1, f1);
		Account a2 = new Account("brandonlu@gmail.com", "Brandon Lu", "BLU", s2, f2);
		Account a3 = new Account("blupickup96@gmail.com", "Brandon Lu", "BLU", s3, f3);
		Account a4 = new Account("blu3@student.gsu.edu", "Brandon Lu", "BLU", s4, f4);
		Account a5 = new Account("askbrandon@yahoo.com", "Brandon Lu", "BLU", s5, f5);
		
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
		
		System.out.println("Main Menu:");
		System.out.println();
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
			access(acc, option, s);
		}
		
		//Call add method
		if (option == 3)
		{
			add(acc, s);
		}
		
		//Call delete method
		if (option == 4)
		{
			delete(acc, s);
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
		
		//Return to Main Menu
		mainMenu(acc);
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
		
		if (option < 1 || option > acc.size())
		{
			System.out.print("Invalid entry: Please enter a number 1-" + acc.size() + ": ");
			option = s.nextInt();
		} else
		{
			//Index of account being accessed
			int option2 = option - 1;
			//Current account being accessed
			Account current = acc.get(option2);
			editAcc(acc, current, option, option2, s);
			System.out.println();
			mainMenu(acc);
		}
	}
	
	/**
	 * This method allows the user to add an account
	 */
	public static void add(ArrayList<Account> acc, Scanner s)
	{
		Scanner t = new Scanner(System.in);
		
		System.out.println("General Information:");
		System.out.println();
		
		//Set email
		System.out.print("Please enter your email: ");
		String email = t.nextLine();
		
		//Set name
		System.out.print("Please enter your name: ");
		String name = t.nextLine();
		
		//Set preferred name
		System.out.print("Please enter your preferred name: ");
		String preferredName = t.nextLine();
		System.out.println();
		System.out.println();
		
		System.out.println("Shipping Information:");
		System.out.println();
		
		//Set shipping address
		System.out.print("Please enter your address: ");
		String address = t.nextLine();
		
		//Set shipping city
		System.out.print("Please enter your city: ");
		String city = t.nextLine();
		
		//Set shipping state
		System.out.print("Please enter your state: ");
		String state = t.nextLine();
		
		//Set shipping zip code
		System.out.print("Please enter your zip code: ");
		String zipCode = s.nextLine();
		System.out.println();
		System.out.println();
		
		System.out.println("Billing Information:");
		System.out.println();
		
		//Set billing address
		System.out.print("Please enter your address: ");
		String bAddress = t.nextLine();
		
		//Set billing city
		System.out.print("Please enter your city: ");
		String bCity = t.nextLine();
		
		//Set billing state
		System.out.print("Please enter your state: ");
		String bState = t.nextLine();
		
		//Set billing zip code
		System.out.print("Please enter your zip code: ");
		String bZip = t.nextLine();
		System.out.println();
		System.out.println();
		
		System.out.println("Payment Information:");
		System.out.println();
		
		//Set name on card
		System.out.print("Please enter the name on the card being used: ");
		String holderName = t.nextLine();
		System.out.println();
		
		//Set card number
		System.out.print("Please enter the card number: ");
		String number = t.nextLine();
		System.out.println();
		
		//Set expiration date
		System.out.print("Please enter the expiration month on the card being used: ");
		String month = t.nextLine();
		System.out.println();
		
		System.out.print("Please enter the expiration year on the card being used: ");
		String year = t.nextLine();
		System.out.println();
		
		//Set security code on card
		System.out.print("Please enter the cvv number on the card being used: ");
		String cvv = t.nextLine();
		System.out.println();
		
//		for (int i = 0; i < zipCode.length(); i++)
//		{
//			char temp = zipCode.charAt(i);
//			if (!Character.isDigit(zipCode.charAt(i)))
//			{
//				System.out.print("Invalid entry, please only use numbers: ");
//				zipCode = s.nextInt();
//			}
//		}
		
		//Create new Shipping object
		Shipping ship = new Shipping(address, city, state, zipCode);
		
		//Create new Finance object
		Credit credit = new Credit(holderName, number, cvv, month, year);
		Billing bill = new Billing(bAddress, bCity, bState, bZip);
		Finance finance = new Finance(credit, bill);
		
		//Create new Account object
		Account current = new Account(email, name, preferredName, ship, finance);
		
		//Add new Account to ArrayList acc
		acc.add(current);
		System.out.println("Account has been added:");
		System.out.println();
		System.out.println(current.toString());
		System.out.println();
		
		
		//Return to main menu
		mainMenu(acc);
	}
	
	/**
	 * This method allows the user to delete an account
	 */
	public static void delete(ArrayList<Account> acc, Scanner s)
	{
		for (int i = 0; i < acc.size(); i++)
		{
			int index = i + 1;
			System.out.println(index + ": " + acc.get(i).getEmail());
		}
		System.out.println();
		System.out.print("Please select an account to delete: ");
		int option = s.nextInt();
		System.out.println();
		
		while (option < 1 || option > acc.size())
		{
			System.out.print("Invalid entry, please choose an option 1-" + acc.size() + ": ");
			option = s.nextInt();
		}
		
		//Delete chosen account
		acc.remove(option - 1);
		System.out.println("Account has been deleted!");
		System.out.println();		
		//Return to main menu
		mainMenu(acc);
	}
	
	/**
	 * Account Editing Menu
	 */
	public static void editAcc(ArrayList acc, Account current, int option, int option2, Scanner s)
	{		
		System.out.println(current.toString());
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("1: Edit my email address");
		System.out.println("2: Edit my name");
		System.out.println("3: Edit my preferred name");
		System.out.println("4: Edit my shipping information");
		System.out.println("5: Edit my financial information");
		System.out.println("6: Delete this account");
		System.out.println("7: Return to Main Menu");
		System.out.println();
		System.out.print("Please select an option: ");
		option = s.nextInt();
		System.out.println();
		
		// While user input is out of range of menu, ask for a valid input
		while (option < 1 || option > 7)
		{
			System.out.print("Invalid entry, please enter an option 1-7: ");
			option = s.nextInt();
			System.out.println();
		}
		
		//Edit email address
		if (option == 1)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter your email address: ");
			String newEmail = t.nextLine();
			current.setEmail(newEmail);
			System.out.println();
			System.out.println("Email address has been updated!");
			System.out.println();
			editAcc(acc, current, option, option2, s);
		}
		
		//Edit name
		if (option == 2)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter your name: ");
			String newName = t.nextLine();
			current.setName(newName);
			System.out.println();
			System.out.println("Name has been updated!");
			System.out.println();
			editAcc(acc, current, option, option2, s);
		}
		
		//Edit preferred name
		if (option == 3)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter your preferred name: ");
			String newPref = t.nextLine();
			current.setPref(newPref);
			System.out.println();
			System.out.println("Preferred name has been updated!");
			System.out.println();
			editAcc(acc, current, option, option2, s);
		}
		
		//Edit shipping information
		if (option == 4)
		{
			Shipping ship = current.getShipping();
			editShipping(acc, current, ship, option, option2, s);
			editAcc(acc, current, option, option2, s);
			System.out.println();
		}
		
		//Edit financial information
		if (option == 5)
		{
			Finance finance = current.getFinance();
			editFinance(acc, current, finance, option, option2, s);
			editAcc(acc, current, option, option2, s);
			System.out.println();
		}
		
		//Delete Account
		if (option == 6)
		{
			acc.remove(option2);
			System.out.println("Account has been deleted!");
			System.out.println();
			mainMenu(acc);
		}
		
		//Return to Main Menu
		if (option == 7)
		{
			mainMenu(acc);
		}
		
	}
	
	/**
	 * Shipping information menu
	 */
	public static void editShipping(ArrayList<Account> acc, Account current, Shipping ship, int option, int option2, Scanner s)
	{
		System.out.println("Which field would you like to edit?");
		System.out.println();
		System.out.println("1: Address");
		System.out.println("2: City");
		System.out.println("3: State");
		System.out.println("4: Zip Code");
		System.out.println("5: Go back to Account Summary");
		System.out.println();
		System.out.print("Please select an option: ");
		option = s.nextInt();
		System.out.println();
			
		// While user input is out of range of menu, ask for a valid input
		while (option < 1 || option > 5)
		{
			System.out.print("Invalid entry, please enter an option 1-5: ");
			option2 = s.nextInt();
			System.out.println();
		}
		
		//Edit address
		if (option == 1)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter your address: ");
			String newAddress = t.nextLine();
			ship.setAddress(newAddress);
			System.out.println();
			System.out.println("Address has been updated!");
			System.out.println();
			System.out.println(ship.toString());
			editShipping(acc, current, ship, option, option2, s);
		}
		
		//Edit city	
		if (option == 2)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter your city: ");
			String newCity = t.nextLine();
			ship.setCity(newCity);
			System.out.println();
			System.out.println("City has been updated!");
			System.out.println();
			System.out.println(ship.toString());
			editShipping(acc, current, ship, option, option2, s);
		}
		
		//Edit state
		if (option == 3)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter your state: ");
			String newState = t.nextLine();
			ship.setState(newState);
			System.out.println();
			System.out.println("State has been updated!");
			System.out.println();
			System.out.println(ship.toString());
			editShipping(acc, current, ship, option, option2, s);
		}
		
		//Edit zip code
		if (option == 4)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter your zip code: ");
			String newZip = t.nextLine();
			ship.setZip(newZip);
			System.out.println();
			System.out.println("Zip code has been updated!");
			System.out.println();
			System.out.println(ship.toString());
			editShipping(acc, current, ship, option, option2, s);
		}

		//Return to Account Summary
		if (option == 5)
		{
			System.out.println(current.toString());
			editAcc(acc, current, option, option2, s);
		}
	}
	
	/**
	 * Financial information menu
	 * @param acc
	 * @param current
	 * @param ship
	 * @param option
	 * @param option2
	 * @param s
	 */
	public static void editFinance(ArrayList<Account> acc, Account current, Finance finance, int option, int option2, Scanner s)
	{
		Billing bill = finance.getBilling();
		Credit cred = finance.getCredit();
		
		System.out.println("Which field would you like to edit?");
		System.out.println();
		System.out.println("1: Address");
		System.out.println("2: City");
		System.out.println("3: State");
		System.out.println("4: Zip Code");
		System.out.println("5: Card holder name");
		System.out.println("6: Card number");
		System.out.println("7: Card expiration date");
		System.out.println("8: Card CVV code");
		System.out.println("9: Go back to Account Summary");
		System.out.println();
		System.out.print("Please select an option: ");
		option = s.nextInt();
		System.out.println();
			
		// While user input is out of range of menu, ask for a valid input
		while (option < 1 || option > 9)
		{
			System.out.print("Invalid entry, please enter an option 1-9: ");
			option2 = s.nextInt();
			System.out.println();
		}
		
		//Edit address
		if (option == 1)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter your address: ");
			String newAddress = t.nextLine();
			bill.setBillAdd(newAddress);
			System.out.println();
			System.out.println("Address has been updated!");
			System.out.println();
			System.out.println(finance.toString());
			editFinance(acc, current, finance, option, option2, s);
		}
		
		//Edit city	
		if (option == 2)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter your city: ");
			String newCity = t.nextLine();
			bill.setBillCity(newCity);
			System.out.println();
			System.out.println("City has been updated!");
			System.out.println();
			System.out.println(finance.toString());
			editFinance(acc, current, finance, option, option2, s);
		}
		
		//Edit state
		if (option == 3)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter your state: ");
			String newState = t.nextLine();
			bill.setBillState(newState);
			System.out.println();
			System.out.println("State has been updated!");
			System.out.println();
			System.out.println(finance.toString());
			editFinance(acc, current, finance, option, option2, s);
		}
		
		//Edit zip code
		if (option == 4)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter your zip code: ");
			String newZip = t.nextLine();
			bill.setBillCity(newZip);
			System.out.println();
			System.out.println("Zip code has been updated!");
			System.out.println();
			System.out.println(finance.toString());
			editFinance(acc, current, finance, option, option2, s);
		}

		//Edit card holder name
		if (option == 5)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter the name of the card holder: ");
			String newName = t.nextLine();
			cred.setHolder(newName);
			System.out.println();
			System.out.println("Card holder name has been updated!");
			System.out.println();
			System.out.println(finance.toString());
			editFinance(acc, current, finance, option, option2, s);
		}
		
		//Edit card number
		if (option == 6)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter the card number: ");
			String newNum = t.nextLine();
			cred.setNum(newNum);
			System.out.println();
			System.out.println("Card number has been updated!");
			System.out.println();
			System.out.println(finance.toString());
			editFinance(acc, current, finance, option, option2, s);
		}
		
		//Edit card expiration date
		if (option == 7)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter the card's expiration month: ");
			String newMonth = t.nextLine();
			cred.setMonth(newMonth);
			
			System.out.print("Please enter the card's expriation year");
			String newYear = t.nextLine();
			cred.setYear(newYear);
			System.out.println();
			System.out.println("Card holder name has been updated!");
			System.out.println();
			System.out.println(finance.toString());
			editFinance(acc, current, finance, option, option2, s);
		}
		
		//Edit card cvv code
		if (option == 8)
		{
			Scanner t = new Scanner(System.in);
			System.out.print("Please enter the card's CVV code: ");
			String newCvv = t.nextLine();
			cred.setCode(newCvv);
			System.out.println();
			System.out.println("Card CVV code has been updated!");
			System.out.println();
			System.out.println(finance.toString());
			editFinance(acc, current, finance, option, option2, s);
		}
		
		//Return to Account Summary
		if (option == 9)
		{
			System.out.println(current.toString());
			editAcc(acc, current, option, option2, s);
		}
	}
}
