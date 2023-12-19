package sumofdigits;

public class Sumdigits 
{
	void sumofDigits(int x)
	{
		int a=0 ,b;
		while(x>0)//the number is greater than the 0
		{
			//a=x%10;
			b=x%10;//remainder of the number
			a=a+b;//storing the addition of the  a and b
			x=x/10;//assigning the quotient value of the number
			
			
		}
		
		System.out.println(a);
	
	}

}
