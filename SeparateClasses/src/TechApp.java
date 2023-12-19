import java.util.*;
public class TechApp
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int marks =scan.nextInt();
		
		Tech.Percent(marks);
	}

}
