/*
 * Brandon Lu
 * This is a constructor class for the object ShippingInfo
 */
public class Shipping
{
	private String address;
	private String city;
	private String state;
	private int zipCode;
	
	/**
	 * Empty constructor for Object Shipping
	 * Holds shipping information
	 */
	public Shipping()
	{

	}
	
	/**
	 * Constructor for Object Shipping with parameters
	 * Hold shipping information
	 * @param address
	 * @param city
	 * @param state
	 * @param zipCode
	 */
	public Shipping(String address, String city, String state, int zipCode)
	{
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	/**
	 * This method returns the current address of the Shipping object
	 * @return
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * This method returns the current city of the Shipping object
	 * @return
	 */
	public String getCity()
	{
		return city;
	}
	
	/**
	 * This method returns the current state of the Shipping object
	 * @return
	 */
	public String getState()
	{
		return state;
	}
	
	/**
	 * This method returns the current zip code of the Shipping object
	 * @return
	 */
	public int getZip()
	{
		return zipCode;
	}
	
	/**
	 * This method changes the current address of the Shipping object to the user input
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	/**
	 * This method changes the current city of the Shipping object to the user input
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	
	/**
	 * This method changes the current state of the Shipping object to the user input
	 */
	public void setState(String state)
	{
		this.state = state;
	}
	
	/**
	 * This method changes the current zip code of the Shipping object to the user input
	 */
	public void setZip(int zipCode)
	{
		this.zipCode = zipCode;
	}
	
	/**
	 * This method prints all parameters of Object Shipping
	 */
	public String toString()
	{
		return String.format("Address: " + getAddress() + "\n" + "City: " + getCity() + "\n" + "State: " + getState() + "\n" + "Zip Code: " + getZip());
//		System.out.print("Address: " + address);
//		System.out.print("City: " + city);
//		System.out.print("State: " + state);
//		System.out.print("Zip Code: " + zipCode);
	}
}
