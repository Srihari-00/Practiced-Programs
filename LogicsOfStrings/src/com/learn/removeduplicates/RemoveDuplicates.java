package com.learn.removeduplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates 
{
	public static void checkForDuplicates(String str, String newstr)
	{
		for(int i=0;i<=str.length()-1;i++)//where i=index of the string
		{
			if(!newstr.contains(str.charAt(i)+""))//checks whether the string contains the character at index or not
			{
				newstr+=str.charAt(i);//if it doesn't contains a char it will add the char to the newstr
			}
		}
		//Displaying the string after removing the duplicates
		System.out.println("The String after removing the duplicates : ");
		//System.out.println(newstr);
		String news=newstr.toLowerCase();
		char ch[]=news.toCharArray();

		for(int i=0;i<=ch.length-1;i++)
		{
			char temp;
			for(int j=0;j<ch.length-1-i;j++)
			{
				if(ch[j]>ch[j+1])
				{
					temp=ch[j+1];
					ch[j+1]=ch[j];
					ch[j]=temp;
				}
			}
		}
		String newr=new String(ch);
		System.out.println(newr);
		
	}

}
