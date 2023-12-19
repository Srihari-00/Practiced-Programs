package com.learn.preservespacereversestring;

public class PreserveSpaceRev 
{
	public static String reverseStringPreservingSpaces(String input) {
        char[] originalChars = input.toCharArray();
        char[] reversedChars = new char[originalChars.length];

        // Copy non-space characters in reverse order
        for (int i = 0; i < originalChars.length; i++) {
            if (originalChars[i] != ' ') {
                int j = originalChars.length - i - 1;
                while (reversedChars[j] != '\0') {
                    j--;
                }
                reversedChars[j] = originalChars[i];
            }
        }

        // Create the reversed string while preserving spaces
        for (int i = 0; i < originalChars.length; i++) {
            if (originalChars[i] == ' ') {
                reversedChars[i] = ' ';
            }
        }

        return new String(reversedChars);
    }


}
