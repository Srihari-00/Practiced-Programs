
public class Calculator
{
	//accepting three parameters of double and char data type
	public static void calculate(double x, double y, char z)
	{
		if(z == '+')//addition
		{
			System.out.println("The addition result is : "+(x+y));
		}
		else if(z =='-')//subtraction
		{
			if(x>y)
			{
				System.out.println("The subtraction result is : "+(x-y));
			}
			else if(x<y)
			{
				System.out.println("The subtraction result is : "+(y-x));
			}
		}
		else if(z=='*') //Multiplication
		{
			System.out.println("The multiplication result is : "+(x*y));
		}
		else if (z=='/')//Division
		{
			if(y!=0)
			{
				System.out.println("The division result is : "+(x/y));
			}
		}
		else
		{
			System.out.println("Enter the valid operations");
		}
			
	}

}
