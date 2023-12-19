
public class Table
{
	void check(int x)
	{
		for(int i = x; i>0;)//for table
		{
			for(int j=1;j<=10;j++)//for numbers to be multiplied with i
			{
				System.out.println(i+"*"+j+"="+(i*j));
				
			}
			break;//breaking the loop
		}
	}

}
