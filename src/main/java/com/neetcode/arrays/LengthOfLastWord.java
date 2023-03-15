package com.neetcode.arrays;

public class LengthOfLastWord {

    public static int findLengthOfLastWord(String s) {

        //start iterating over the string from the end
        //if an alphabet is found.. start the counter and keep counting until a space is found
        int lenLast = 0;
        int i = s.length() - 1;

        // skip all the spaces at the end of the string
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // count the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            lenLast++;
            i--;
        }

        return lenLast;
    }

    public static void main(String[] args) {
        System.out.println(findLengthOfLastWord(" Hello this is Prasidh  "));
    }
}
