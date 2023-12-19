package com.learn.returnscocatedstringiftheyequal;

public class ReturnsConcatedString
{
	public static String checkValuesOfString(String x, String y)
	{
		if(x.equals(y))
		{
			return x.concat(y);
		}
		return("String are not equal");
	}

}
