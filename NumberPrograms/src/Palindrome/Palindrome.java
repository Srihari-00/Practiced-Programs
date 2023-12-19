package Palindrome;

public class Palindrome 
{
	void checkPalindrome(int x)
	{
		int a=0,b, c=x;//storing the  value of X in C	
		while(x>0)//checking the number is greater than the 0
		{
			b=x%10;//storing the remainder value in variable b 
			a=a*10+b;//storing the addition value of b  and a*10
			x=x/10;//assigning the quotient value in the x
						
		}
		System.out.println(a);
		if(c==a)//checking whether the condition c is not equal to reversed value
		{
			System.out.println("Number is a Palindrome");
		}
		else
		{
			System.out.println("Number is not a Palindrome");
		}
		
		
	}

}
	