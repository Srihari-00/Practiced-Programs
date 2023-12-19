package com.hackerrank.phonenumber;

import java.util.Scanner;

public class PhnoneNumber 
{
	private static final String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	private static final String[] TENS = {"zero", "zero", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String phoneNumber = in.nextLine();
		String[] digits = phoneNumber.split("");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < digits.length; i++) {
			if (i == 0) {
				sb.append(words[Integer.parseInt(digits[i])]).append("-");
			} else if (i == 1) {
				sb.append(TENS[Integer.parseInt(digits[i])]).append("-");
			} else if (i == 2) {
				sb.append(words[Integer.parseInt(digits[i])]).append(" ");
			} else if (i == 3) {
				sb.append(words[Integer.parseInt(digits[i])]).append(" ");
			} else if (i == 4) {
				sb.append(words[Integer.parseInt(digits[i])]).append(" ");
			} else if (i == 5) {
				sb.append(words[Integer.parseInt(digits[i])]).append(" ");
			} else if (i == 6) {
				sb.append(words[Integer.parseInt(digits[i])]).append(" ");
			} else if (i == 7) {
				sb.append(words[Integer.parseInt(digits[i])]).append(" ");
			} else if (i == 8) {
				sb.append(words[Integer.parseInt(digits[i])]).append(" ");
			} else if (i == 9) {
				sb.append(words[Integer.parseInt(digits[i])]).append(" ");
			} else if (i == 10) {
				sb.append(words[Integer.parseInt(digits[i])]).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}
}