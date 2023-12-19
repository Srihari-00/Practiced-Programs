package com.learn.stringpalindromeornot;

public class StringPalindrome 
{
	public static void checkStringPalindrome(String x)
	{
		/*
		s = s.replaceAll("[^a-zA-Z0-9 ]","");
		char [] ch=s.toLowerCase().toCharArray();
		char[] rev=s.toLowerCase().toCharArray();
		int j=rev.length-1;
		for(int i=0;i<=ch.length-1;i++)
		{
			rev[j]=ch[i];
			j--;
		}
		
		String revstr = new String(rev);
		String ch1 = new String(ch);
		String r =revstr.replace(" ","");
		String c = ch1.replace(" ", "");
		//System.out.println(r);
		//System.out.println(c);
		
		if(c.equals(r))
		{
			return true;
		}
		return false;*/
		
		
		
		char [] arr = x.toCharArray();//Converting string into character type array
		char [] revarr=x.toCharArray();//Converting string into character type array
		int j=revarr.length-1;//initializing the j as length-1 of the revarr
		for(int i=0;i<=arr.length-1;i++)//where i=index of the array
		{
			revarr[j]=arr[i];//assigning the arr[i] elements to the revarr[j]
			j--;//decrementing the j
		}
		//creating an new string and storing revarr in it
		String revstr = new String(revarr);
		//Displaying the rev string
		System.out.println(revstr);
		//checking if the reverse string is equals to String X 
		if(revstr.equals(x))
		{
			System.out.println("The string is a Palindrome");
		}
		else//if not equal
		{
			System.out.println("The String is not a Palindrome");
		}		
	}

}
