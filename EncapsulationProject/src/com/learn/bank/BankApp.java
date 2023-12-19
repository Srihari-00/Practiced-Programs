package com.learn.bank;

import java.util.*;

public class BankApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Bank b = new Bank();
		
		System.out.println("Enter the ammount to be withdraw : ");
		int amount = scan.nextInt();
		System.out.println("Enter your pin : ");
		int key = scan.nextInt();
		//Calling setter method for setting the data
		b.setData(key, amount);
		//Calling getter method for getting the data
		b.getData(key, amount);
		scan.close();
	}

}
