package gcdoftwoNumbers;

public class GcdofTwonumbers 
{
	void calculateGCDofTwonumbers(int x, int y)//Passing the parameters
	{
		int gcd=1;//initializing the gcd value as 1
		for(int i=1;i<=x && i<=y;i++)//where i is the divisible number and should be less than the both the numbers
		{
			if(x%i==0 && y%i==0)//checking whether the condition both the numbers were divisible by i or not
			{
				gcd=i;//if condition is true, assign the I value to the gcd
			}
		}
		System.out.println("The GCD of the two Numbers "+x+" and "+y+" is "+gcd);
	}

}
