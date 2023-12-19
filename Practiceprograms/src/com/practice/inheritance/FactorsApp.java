package com.practice.inheritance;

import java.util.Scanner;

public class FactorsApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		
		FactorsCalculator f = new FactorsCalculator(n);
		f.calculateFactors();

	}

}
