package com.learn.eh.exe1;

import java.util.Scanner;

public class Problem 
{
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try
        {
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int y = scan.nextInt();
            int c =x/y;
            System.out.println(c);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
