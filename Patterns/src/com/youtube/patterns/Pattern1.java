package com.youtube.patterns;

public class Pattern1 {

	public static void main(String[] args) 
	{
		int n = 5;
		pattern4(n);
	}

	public static void pattern1(int n)
	{
		for(int rows = 1;rows<=n;rows++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	public static void pattern2(int n)
	{
		for(int rows = 1;rows<=n;rows++)
		{
			for(int col=1;col<=rows;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern3(int n)
	{
		for(int rows = n;rows>=1;rows--)
		{
			for(int col=rows;col>0;col--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern4(int n)
	{
		int num = 1;
		for(int rows = 1;rows<=n;rows++)
		{
			num=1;
			for(int col=1;col<=rows;col++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}


}
