import java.util.Scanner;

public class LowerToUpper 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				result += Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				result += Character.toUpperCase(ch);
			} else {
				result += ch;
			}
		}
		System.out.println("Result: " + result);
	}

}
