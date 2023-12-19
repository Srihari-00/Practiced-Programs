
public class SumofNumbers 
{
	void SumofFirstNaturalNumbers(int x)
	{
		int sum =0;
		for(int i=0;i<=x;i++)
		{
			sum=x*(x+1)/2;
			System.out.print(i+" ");
		}
		System.out.println(" ");
		System.out.println("Sum : "+sum);
	}

}
