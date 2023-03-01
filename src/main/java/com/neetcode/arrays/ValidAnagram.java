package com.neetcode.arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length())return false;

        int[] count = new int[256];

        for(char c : s.toCharArray()){
            count[c] += 1;
        }
        for(char c : t.toCharArray()){
            if(count[c] == 0) return false;
            count[c]--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("aaa", "bbb"));
    }
}
