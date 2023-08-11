package com.neetcode.slidingwindow;

/*
Given a string s, find the length of the longest
substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSubWithoutRepeating {

    /*
    Make an array of 256. If a character appears, increase its count to 1.
    If a character appears and its count is already 1, then it means it is repeating. At that time
    note down the current length of the string (r - l). If it's greater than the max length, then
    set is as the max length.
    Maintain a sliding window. Keep a left and right pointer.
     */
    public static int longestSubstringWithoutRepeat(String s) {

        int maxLen = 0;
        int[] arr = new int[256];
        int l = 0, r = 0;

        //r will basically serve as our loop index and keep moving with every iteration
        while (r < s.length()) {
            char c = s.charAt(r);
            //if arr contains the character c's count as more than 0, it means that it was seen
            // in the string before, check if falls between the current l,r range? how to do
            // that? See what's the max between l and index stored at c, otherwise don't change l
            l = (arr[c] > 0) ? Math.max(l, arr[c]) : l;

            // store one index next to the one of r. So that next time we encounter the same
            // character, we can just jump our l pointer to one next of the last seen one.
            // (Assuming it falls in between the ongoing l-r range.)
            arr[c] = r + 1;
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutRepeat("abcabcbb"));
        System.out.println(longestSubstringWithoutRepeat("bbbb"));
        System.out.println(longestSubstringWithoutRepeat("pwwkew"));
    }

}
