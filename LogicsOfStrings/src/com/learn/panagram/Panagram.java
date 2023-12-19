package com.learn.panagram;

public class Panagram 
{
	static String checkPanagram(String s)
	{
		s = s.toLowerCase();
		String newstr = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) >= 'a' && s.charAt(i)<= 'z')
			{
				if(!newstr.contains(s.charAt(i)+""))
				{
					newstr+=s.charAt(i);
				}
			}
		}
		if(newstr.length() == 26)
		{
			return "Pangram";
		}
		return "Not Pangram";
	}

}
