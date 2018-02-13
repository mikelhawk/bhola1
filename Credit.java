/*
 * Megan Kennemore
 * Constructor class for credit card information
 */
public class Credit {
	private String holderName;
	/*TO BLU: I've got the card number as one big number, but we may have to split it up into fours
	 * The first four numbers of a card tell the system whether it's a MasterCard, Visa, etc, so we may need to split it up into fours for that?
	 * I'm not entirely sure how companies process the card numbers, so right now I'm having it as one long number, but we may need to change it.
	 */
	private String number;
	private String securityCode;
	private String month;
	private String year;
	
	//Empty constructor
	public Credit(){
		
	}
	
	//Constructor with parameters
	public Credit(String holderName, String number, String securityCode, String month, String year){
		this.holderName = holderName;
		this.number = number;
		this.securityCode = securityCode;
		this.month = month;
		this.year = year;
	}
	
	//This method returns the name of the card holder
	public String getHolder(){
		return holderName;
	}
	
	//This method returns the card number
	public String getNum(){
		return number;
	}
	
	//This method returns the security code
	public String getCode(){
		return securityCode;
	}
	
	//This method returns the month of the card's expiration date
	public String getMonth(){
		return month;
	}
	
	//This method returns the year of the card's expiration date
	public String getYear(){
		return year;
	}
	
	//This method changes the name of the card holder
	public void setHolder(String holderName){
		this.holderName = holderName;
	}
	
	//This method changes the card number
	public void setNum(String number){
		this.number = number;
	}

	//This method changes the security code
	public void setCode(String securityCode){
		this.securityCode = securityCode;
	}
	
	//This method changes the month on the card's expiration date
	public void setMonth(String month){
		this.month = month;
	}
	
	//This method changes the year on the card's expiration date
	public void setYear(String year){
		this.year = year;
	}
	
	//This method prints the card information
	public String toString(){
		return String.format("Card Holder: " + getHolder() + "\n" + "Card Number: " + getNum() + "\n" + "Expiration Date: " + getMonth() + "/" + getYear() + "\n" + "CVV code: " + getCode());
	}
}
