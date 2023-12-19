package com.learn.withoutusingsplitmethod;

public class WithOutSplitMethod 
{
	static void dontUseSplitMethod(String s)
	{
		char ch[]=s.toCharArray();
		String newstr[]=new String[s.length()];
		for(int i=0;i<=s.length()-1;i++ )
		{
			for(int j=0;j<=ch.length-1;j++) 
			{
				if(ch[i]==' ')
				{
					newstr[i]+=" ";
				}
				else
				{
					newstr[j]+=ch[i];
				}

			}
		}
		System.out.println();
	}
}
