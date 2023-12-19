
public class Alphabet 
{
	public  void Check(char x)
	{
		if(x>=65 && x<=96)
		{
			System.out.println("The letter is Upper case ");
		}
		else if (x>=97 && x<=122)
		{
			System.out.println("The letter is lower case ");
		}
		else 
		{
			System.out.println("The given input isn't a Alphabet");
		}
	}

}
