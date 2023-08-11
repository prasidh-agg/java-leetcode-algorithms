package com.neetcode.slidingwindow;

/*
You are given a string s and an integer k. You can choose any character of the string and change
it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after
performing the above operations.


Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
 */

public class LongestCharReplacement {

    public static int longestCharacterReplacement(String s, int k){

        //keep track of the most frequent element
        int mostFreq = 0, maxLen = 0, start = 0;
        int[] freq = new int[26];

        //Keep track of frequencies using a hash table
        for(int end = 0; end < s.length(); end ++){
            int endIndex = s.charAt(end) - 'A';
            freq[endIndex]++;
            mostFreq = Math.max(freq[endIndex], mostFreq);

            //noOfCharReplacement = windowLen - mostFreq

            if((end - start + 1) - mostFreq > k){
                int startIndex = s.charAt(start) - 'A';
                //reduce the left char of the window from the map
               freq[startIndex]--;
                start++;
            }
            maxLen = Math.max(end - start + 1, maxLen);
        }

        return maxLen;
    }

    public static void main(String[] args) {
//        System.out.println(longestCharacterReplacement("ABAB", 2));
        System.out.println(longestCharacterReplacement("AABABBA", 1));
//        System.out.println(longestCharacterReplacement("ABABCDDCC", 2));
    }
}
