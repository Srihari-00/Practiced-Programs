package com.countthecharacters;

public class CountCharacters {

	public static void main(String[] args) 
	{
		String s = "the Quick Lazy fox jumspsmsdsnfkjsd ssflds";
		int N = 4;
		System.out.println(getCount(s,N));
	}
	static int getCount (String s, int N)
    {
        int sum=0;
        for(int i=0;i<s.length();i++)//for one character
        {
            int count=0;
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    count++;
                }
            }
            if(count == N )
            {
                sum+=1;
            }
        }
        return sum;
    }

}
