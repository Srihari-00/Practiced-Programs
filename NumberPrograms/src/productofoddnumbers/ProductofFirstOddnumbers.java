package productofoddnumbers;

public class ProductofFirstOddnumbers 
{
	void productofOddNumbers(int x)//importing the number
	{
		int Product = 1;
		System.out.println("The Odd Numbers are : ");
		for(int i=1;i<=x;i++)//where i is the number that are to be checked whether it is odd or not
		{
			if(i%2!=0)//the number should not divisible by 2
			{
				Product*=i;//multiplying the odd numbers
				System.out.println(i);
			}
			
		}
		System.out.println("Product of OddNumbers is : "+Product);//displaying the product of oddNumbers
	}

}
