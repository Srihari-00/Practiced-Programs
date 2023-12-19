package powerraisedtoN;

public class NumberraisedtoPowerN 
{
	//passing the parameters base and its power
	void calculatetheNumberPowerToN(int base, int exponent)
	{
		//by using the math calculation,performing the power calculation and storing the value in the result
		int	result =(int)Math.pow(base, exponent);
		
		//displaying the output
		System.out.println("The result of the Number "+base+" to its Power "+exponent+" is "+result);
	}

}
