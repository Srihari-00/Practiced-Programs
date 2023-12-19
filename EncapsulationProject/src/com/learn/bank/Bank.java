package com.learn.bank;

public class Bank 
{
	private int totalAmount = 450000;
	private int pin = 5555;
	
	//Setter for setting the data to the controlled access.
	public void setData(int key, int amount)
	{
		if(pin==key)
		{
			totalAmount -= amount;
		}
		else {
			System.out.println("Invalid Pin Entered......");
			System.exit(0);
		}
	}
	
	//Getter for the controlled access.
	public void getData(int key, int amount)
	{
		if(key == pin) {
			System.out.println("Amount withdrawed : "+amount);
			System.out.println("Remaining amount : "+totalAmount);
			System.out.println("Trasaction is successful..........");
			
		}
		else {
			System.out.println("Invalid Pin Entered......");
			System.exit(0);
		}
	}
	

}
