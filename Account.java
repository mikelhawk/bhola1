/*
 * Brandon Lu
 * This is a constructor class for the object Account
 */
public class Account
{
	String email;
	String name;
	String preferredName;
	
	Shipping shipping = new Shipping();
	
	/**
	 * Empty constructor for Object Account
	 * Holds account information
	 */
	public Account()
	{
		
	}
	
	/**
	 * Constructor for Object Account with parameters
	 * Holds account information
	 * @param email
	 * @param name
	 * @param preferredName
	 * @param shipping
	 */
	public Account(String email, String name, String preferredName, Shipping shipping)
	{
		this.email = email;
		this.name = name;
		this.preferredName = preferredName;
		this.shipping = shipping;
	}
	
	/**
	 * This method returns the current email of the Account object
	 */
	public String getEmail()
	{
		return email;
	}
	
	/**
	 * This method returns the current name of the Account object
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * This method returns the current preferred name of the Account object
	 */
	public String getPref()
	{
		return preferredName;
	}
	
	/**
	 * This method returns the current shipping information of the Account object
	 */
	public Shipping getShipping()
	{
		return shipping;
	}
	
	/**
	 * This method changes the current email of the Account object to the user input
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	/**
	 * This method changes the current name of the Account object to the user input
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * This method changes the current preferred name of the Account object to the user input
	 */
	public void setPref(String preferredName)
	{
		this.preferredName = preferredName;
	}
	
	/**
	 * This method changes the current name of the Account object to the user input
	 */
	public void setName(Shipping shipping)
	{
		this.shipping = shipping;
	}
	
	/**
	 * This method prints all parameters of Object Account
	 */
	public String toString()
	{
		return String.format("Email: " + getEmail() + "\n" + "Name: " + getName() + "\n" + "Preferred Name: " + getPref() + "\n\n" + "Shipping Information: " + getShipping());
//		String.format("Name: " + getName());
//		String.format("Preferred Name: " + getPref());
//		String.format("Shipping Information: " + getShipping());
		
	}
}
