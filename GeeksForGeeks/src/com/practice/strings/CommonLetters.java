package com.practice.strings;

import java.util.Arrays;

public class CommonLetters {

	public static void main(String[] args) {
		String s1 = "geeksforgeeks";
		String s2 = "geeksquiz";
		System.out.println(UncommonCharacters(s1, s2));
	}
	static String UncommonCharacters(String A, String B) {
        String newstr = "";
        int k = B.length() - 1;
        //Traversing through String 1
        for (int i = 0; i < A.length(); i++) {
            boolean t = true; // Initialize t to true
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    t = false;
                    break;
                }
            }
            //if the condition is true concatenating the character to the new string
            if (t) {
                newstr = newstr + A.charAt(i);
            }
        }
      //Traversing through String 2
        for (int i = 0; i < B.length(); i++) {
            boolean t = true; // Initialize t to true
            for (int j = 0; j < A.length(); j++) {
                if (B.charAt(i) == A.charAt(j)) {
                    t = false;
                    break;
                }
            }
          //if the condition is true concatenating the character to the new string
            if (t) {
                newstr = newstr + B.charAt(i);
            }
        }
        //Converting the string into the character type array for sorting purpose
        char[] ch = newstr.toCharArray();
        Arrays.sort(ch);
        //returning the new sorted string
        return new String(ch);
    }

}
