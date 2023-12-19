import java.util.Scanner;

public class Accenture 
{
	public static int commonDigit(int a, int b, int c) {
		  // Initialize variables
		  int i = 0;
		  int j = 0;
		  int k = 0;
		  int count = 0;
		  // Convert a, b, and c to strings
		  String str1 = Integer.toString(a);
		  String str2 = Integer.toString(b);
		  String str3 = Integer.toString(c);
		  // Find the length of the strings
		  int len1 = str1.length();
		  int len2 = str2.length();
		  int len3 = str3.length();
		  // Iterate through the strings
		  for (i = 0; i < len1; i++) {
		    for (j = 0; j < len2; j++) {
		      for (k = 0; k < len3; k++) {
		        // Check if the characters are equal
		        if (str1.charAt(i) == str2.charAt(j) && str2.charAt(j) == str3.charAt(k)) {
		          // Increment the count
		          count++;
		        }
		      }
		    }
		  }
		  // Return the count
		  if (count > 0) {
		    return str1.charAt(i);
		  } else {
		    return -1;
		  }
		}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(commonDigit(a,b,c));
	}

}
