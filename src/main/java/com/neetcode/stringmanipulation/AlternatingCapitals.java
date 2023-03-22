package com.neetcode.stringmanipulation;

public class AlternatingCapitals {
    public static String alternateCase(String str) {
        StringBuilder result = new StringBuilder();
        boolean capitalize = true; // start with capital letter
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean isLetter = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
            if (isLetter) {
                if (capitalize) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                capitalize = !capitalize; // toggle the case flag
            } else {
                result.append(c); // preserve non-letter characters
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(alternateCase("! prasidh"));
    }
}
