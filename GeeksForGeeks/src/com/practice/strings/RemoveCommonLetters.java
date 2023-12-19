package com.practice.strings;

import java.util.Arrays;

public class RemoveCommonLetters {
	static String UncommonChars(String A, String B) {
	        String newstr = "";
	        int k = B.length() - 1;
	        for (int i = 0; i < A.length(); i++) {
	            boolean t = true; // Initialize t to true
	            for (int j = 0; j < B.length(); j++) {
	                if (A.charAt(i) == B.charAt(j)) {
	                    t = false;
	                    break;
	                }
	            }
	            if (t) {
	                newstr = newstr + A.charAt(i);
	            }
	        }
	
	        for (int i = 0; i < B.length(); i++) {
	            boolean t = true; // Initialize t to true
	            for (int j = 0; j < A.length(); j++) {
	                if (B.charAt(i) == A.charAt(j)) {
	                    t = false;
	                    break;
	                }
	            }
	            if (t) {
	                newstr = newstr + B.charAt(i);
	            }
	        }
	
	        char[] ch = newstr.toCharArray();
	        Arrays.sort(ch);
	        return new String(ch);
	    }
}

