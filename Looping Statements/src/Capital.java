import java.util.Scanner;

public class Capital 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the letter : ");
		// TODO Auto-generated method stub
		Letter pr = new Letter();
		char a = scan.next().charAt(0);
		
		pr.Letters(a);

	}

}
