/*
 * Megan Kennemore
 * This is a constructor account for Billing Information
 */
public class Billing {
	String bAddress;
	String bCity;
	String bState;
	String bZipCode;
	
	//This is an empty constructor for the billing info
	public Billing(){
		
	}
	
	//This is a constructor for the billing info with the parameters
	public Billing(String bAddress, String bCity, String bState, String bZipCode){
		this.bAddress = bAddress;
		this.bCity = bCity;
		this.bState = bState;
		this.bZipCode = bZipCode;
	}
	
	//This method returns the billing address
	public String getBillAdd(){
		return bAddress;
	}
	
	//This method returns the city
	public String getBillCity(){
		return bCity;
	}
	
	//This method returns the state
	public String getBillState(){
		return bState;
	}
	
	//This method returns the zip code
	public String getBillZip(){
		return bZipCode;
	}
	
	//This method changes the billing address
	public void setBillAdd(String bAddress){
		this.bAddress = bAddress;
	}
	
	//This method changes the city
	public void setBillCity(String bCity){
		this.bCity = bCity;
	}
	
	//This method changes the state
	public void setBillState(String bState){
		this.bState = bState;
	}
	
	//This method changes the Zip Code
	public void setBillZip(String bZipCode){
		this.bZipCode = bZipCode;
	}
	
	//This method prints the billing information
	public String toString(){
		return String.format("Address: " + getBillAdd() + "\n" + "City: " + getBillCity() + "\n" + "State: " + getBillState() + "\n" + "Zip Code: " + getBillZip());
	}
}
