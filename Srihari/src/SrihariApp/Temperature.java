package SrihariApp;
import java.util.*;

public class Temperature
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit : ");
		double Fahrenheit = scan.nextDouble();
		
		double Celcius = TemperatureConvert(Fahrenheit);
		System.out.println("The temperature in celcius is : "+Celcius);

	}
	public static double TemperatureConvert(double x)
	{
		return (x-32)*5/9;
	}

}
