
public class Calci 
{
	public static void CalciAp(double a, double b, char c)
	{
		switch(c)
		{
		case '+' : 
			System.out.println("The additionn result is "+(a+b));
			break;
		case '-' :
			System.out.println("The subtraction result is "+(a-b));
			break;
		case '*' :
			System.out.println("The multiplication result is "+(a*b));
			break;
		case '/' : 
			System.out.println("The dividion result is "+(a/b));
			break;
		//default :
			//System.out.println("Invalid Input");
		}
		

	}

}
