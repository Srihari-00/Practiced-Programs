import java.util.*;
public class AdultApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		Adult pr = new Adult();
		int age = scan.nextInt();
		
		pr.Vote(age);
	}

}
