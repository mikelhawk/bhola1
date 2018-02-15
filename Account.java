package com.example.hakee.shapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.hakee.shapp.Finance;
import com.example.hakee.shapp.R;
import com.example.hakee.shapp.Shipping;



/*
 * Brandon Lu
 * This is a constructor class for the object Account
 */
public class Account extends AppCompatActivity  {
	public static EditText emailEdit,passwordEdit;
	public static TextView loginView,loginResultView;
	public static Button loginButton;
	public static DBHandler db= new DBHandler();
//This method creates a saved state to view
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_layout);

		emailEdit= (EditText) (findViewById(R.id.emailBox));
		passwordEdit=(EditText) (findViewById(R.id.passwordBox));
		loginView=(TextView)findViewById(R.id.loginText);
		loginResultView=(TextView)findViewById(R.id.loginResults);
		loginButton=(Button)findViewById(R.id.loginButton);
		loginButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Account acct= new Account(getEmailEditText(),getPasswordEditText());
				//getLoginResultView().setText(acct.toString());
				db.execute();
			}
		});

	}
//Getters for views and buttons
	public static TextView getLoginResultView() {
		return loginResultView;
	}

	public static EditText getEmailEdit() {
		return emailEdit;
	}

	public static EditText getPasswordEdit() {
		return passwordEdit;
	}

	public static TextView getLoginView() {
		return loginView;
	}

	public static Button getLoginButton() {
		return loginButton;
	}
//Getters for the text that appears in each text edit
	public static String getEmailEditText() {
		return emailEdit.getText().toString();
	}

	public static String getPasswordEditText() {
		return passwordEdit.getText().toString();
	}




	String email;
	String name;
	String preferredName;
	String password;
	
	Shipping shipping = new Shipping();
	Finance finance = new Finance();
	
	/**
	 * Empty constructor for Object Account
	 * Holds account information
	 */
	public Account()
	{
		
	}
	public Account(String email, String password){
		this.email=email;
		this.password=password;
	}

	/**
	 * Constructor for Object Account with parameters
	 * Holds account information
	 * @param email
	 * @param name
	 * @param preferredName
	 * @param shipping
	 */
	public Account(String email, String name, String preferredName, String password, Shipping shipping, Finance finance)
	{
		this.email = email;

		this.name = name;

		this.preferredName = preferredName;

		this.password = password;

		this.shipping = shipping;

		this.finance = finance;

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
	 * This method returns the current password of the Account object
	 */
	public String getPass()
	{
		return password;
	}
	
	/**
	 * This method returns the current shipping information of the Account object
	 */
	public Shipping getShipping()
	{
		return shipping;
	}
	
	/**
	 * This method returns the current financial information of the Acount object
	 */
	public Finance getFinance()
	{
		return finance;
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
	 * This method changes the current password of the Account object to the user input
	 */
	public void setPass(String password)
	{
		this.password = password;
	}
	
	/**
	 * This method prints all parameters of Object Account
	 */
	public String toString()
	{
		return String.format("Email: " + getEmail() + "\n" + "Name: " + getName() + "\n" + "Preferred Name: " + getPref() + "\n" + "Password: " + getPass() + "\n\n" + "Shipping Information:\n" + getShipping() + "\n\n" + "Financial Information: \n" + getFinance());
//		String.format("Name: " + getName());
//		String.format("Preferred Name: " + getPref());
//		String.format("Shipping Information: " + getShipping());
		
	}
}
