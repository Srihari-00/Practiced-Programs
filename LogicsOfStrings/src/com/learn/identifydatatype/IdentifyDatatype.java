package com.learn.identifydatatype;

public class IdentifyDatatype 
{
	static void checkDatatypes(String s)
	{
		//Initializing the Count for all characters
		int UpperCount=0;
		int LowerCount=0;
		int NumCount=0;
		int SpecialCount=0;
		//Creating the empty strings 
		String Upper="";
		String Lower="";
		String Number="";
		String Special="";
		//Converting the string into character type array
		char []ch=s.toCharArray();
		//Traversing the array
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]>=65 && ch[i]<=96)//Checking for lower case letters 
			{
				UpperCount++;//Incrementing
				Upper+=ch[i]+",";//Concatenating the string with character
			}
			else if(ch[i]>=97 && ch[i]<=126)//Checking for Upper case letters
			{
				LowerCount++;//Incrementing
				Lower+=ch[i]+",";//Concatenating the string with character
			}
			else if(ch[i]>='0' && ch[i]<='9')//Checking for the numbers
			{
				NumCount++;//Incrementing
				Number+=ch[i]+",";//Concatenating the string with character
			}
			else
			{
				SpecialCount++;//Incrementing
				Special+=ch[i]+",";//Concatenating the string with character
			}
		}
		//Displaying the Output
		System.out.println("The Count of Uppercase Letters : "+UpperCount);
		System.out.println("The UpperCase Letters are : "+Upper);
		System.out.println("The Count of LowerCase letters : "+LowerCount);
		System.out.println("The LowerCase letters are :"+Lower);
		System.out.println("The Count of Numbers : "+NumCount);
		System.out.println("The Numbers are : "+Number);
		System.out.println("The count of Special Characters : "+SpecialCount);
		System.out.println("The Special Characters are : "+Special);


	}

}
