
public class Prog 
{
	void check(int x, int y, int z)
	{
		if(x>y)//comparing x and y
		{
			if(x>z)//comparing x and z
			{
				System.out.println(x);
			}
			else
			{
				System.out.println(z);
			}
			
		}
		else if(x<y)//comparing x and y
		{
			if(y>z)//comparing y and z
			{
				System.out.println(y);
			}
			else
			{
				System.out.println(z);
			}
			
		}
		else if(z>x)//comparing z and x
		{
			if(z>y)//comparing z and y
			{
				System.out.println(z);
			}
			else
			{
				System.out.println(y);
			}
		}
	}

}
