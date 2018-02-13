/*
 * Megan Kennemore
 * A constructor for the object finance
 */
public class Finance {
	Credit credit = new Credit();
	Billing billing = new Billing();
	
	//An empty constructor for the finance object
	public Finance(){
		
	}
	
	//A constructor for the finance object with parameters
	public Finance(Credit credit, Billing billing){
		this.credit = credit;
		this.billing = billing;
	}
	
	//A method to return the credit info
	public Credit getCredit(){
		return credit;
	}
	
	//A method to return the billing info
	public Billing getBilling(){
		return billing;
	}
	
	//A method to change the credit info
	public void setCredit(Credit credit){
		this.credit = credit;
	}
	
	//A method to change the billing info
	public void setBilling(Billing billing){
		this.billing = billing;
	}
	
	//A method to print to string
	public String toString(){
		return String.format("Billing Information:\n" + getBilling() + "\n\n" + "Credit Information:\n" + getCredit());
	}
}