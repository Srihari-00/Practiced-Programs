package com.learn.commonlettersoftwostrings;

public class CommonLettersTwoStrings 
{
	static void findSameAlpha(String str1, String str2)
	{
		String newstr="";//creating an empty string
		//converting Strings into character type of arrays
		char []arr1 = str1.toCharArray();
		char []arr2 = str2.toCharArray();
		//Traversing the Strings
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				//checking for both the character values are equal
				if((arr1[i]+"").equals(arr2[j]+""))
				{
					//checking whether the string contains the character or not
					if(!newstr.contains(str2.charAt(i)+""));
					{
						newstr=newstr+arr1[i]+"";//concatenating the character to the new string
						break;
					}
				}
			}
		}
		String str3="";//creating another new string
		//Traversing the newstr
		for(int i=0;i<=newstr.length()-1;i++)
		{
			//checking for any spaces present in the string
			if(newstr.charAt(i)==' ')
			{
				continue;
			}
			////for removing the duplicates from the string
			else if(!str3.contains(newstr.charAt(i)+""))
			{
				str3+=newstr.charAt(i);
			}
		}
		//Displaying the string 3
		System.out.println(str3);
	}

}
