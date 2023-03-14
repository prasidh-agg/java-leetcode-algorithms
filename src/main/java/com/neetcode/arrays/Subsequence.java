package com.neetcode.arrays;

public class Subsequence {
    public static boolean isSubsequence(String s, String t) {

        //string lengths
        int m = s.length();
        int n = t.length();

        //char arrays for easier access
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        //two pointers, one each for s and t
        int p1 = 0, p2 = 0;

        //if s is empty, return true
        if(m < 1) return true;

        //keep going until both strings havent been completely traversed
        while(p1 < m && p2 < n){

            //move s' pointer p1 if a match is found with t
            if(sArr[p1] == tArr[p2]){
                p1++;
            }
            //always move t's pointer p2
            p2++;

            //if at any point s' pointer p1 crosses its last index (or becomes equal to its own
            // length) return true
            if(p1 == m) return true;
        }
        //return false if while loop ends
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "abc"));
    }
}
