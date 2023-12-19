package com.learn.abstractasstatic;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		boolean res = isPangram(s);
		if(res == true)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
	public static boolean isPangram(String s)
	{
		 boolean res = true;
	        String r="";
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)>='A' && s.charAt(i)<='Z' && s.charAt(i)>='a' && s.charAt(i)<='z')
	            {
	                char ch = s.charAt(i);
	                if(!r.contains(ch+""))
	                {
	                    r+=ch+"";
	                }
	            }
	            System.out.println(r);
	            if(r.length()==26)
	            {
	                res=true;
	            }
	            else{
	                res=false;
	            }
	        }
	        return res;
	}

}
