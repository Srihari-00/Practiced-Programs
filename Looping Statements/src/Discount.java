import java.util.*;
public class Discount
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of cart : ");
		Discount1 pr = new Discount1();
		float a = scan.nextFloat();
		
		pr.Bill(a);
		

	}

}
