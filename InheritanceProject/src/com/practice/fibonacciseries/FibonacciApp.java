package com.practice.fibonacciseries;

import java.util.Scanner;

public class FibonacciApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		int n=scan.nextInt();
		
		FibonacciGenerator f = new FibonacciGenerator(n);
		
		f.generateFibonacciSeries();

	}

}
