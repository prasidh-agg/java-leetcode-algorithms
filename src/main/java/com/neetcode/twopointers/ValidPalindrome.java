package com.neetcode.twopointers;

public class ValidPalindrome {

    public static boolean isValidPalindrome(String s){

        //consider only alphanumeric characters, ignore the rest
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isValidPalindrome("race a car"));
        System.out.println(isValidPalindrome(" "));
    }
}
