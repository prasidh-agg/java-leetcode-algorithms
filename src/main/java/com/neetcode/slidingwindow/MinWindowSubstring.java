package com.neetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {

    public static String findMinWindowSubstring(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0, counter = tMap.size();
        int minLen = Integer.MAX_VALUE, minStart = -1;

        Map<Character, Integer> windowMap = new HashMap<>();

        while (right < s.length()) {
            char curr = s.charAt(right);
            windowMap.put(curr, windowMap.getOrDefault(curr, 0) + 1);

            if (tMap.containsKey(curr) && tMap.get(curr).equals(windowMap.get(curr))) {
                counter--;
            }

            while (counter == 0) {
                if (minLen > right - left + 1) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (tMap.containsKey(leftChar) && tMap.get(leftChar) > windowMap.get(leftChar)) {
                    counter++;
                }
                left++;
            }
            right++;
        }
        return minStart == -1 ? "" : s.substring(minStart, minStart + minLen);
    }

    //sliding window
    public static String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        //build a map for frequencies of the string t
        for (char x : t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        //how many out of t have matched in s
        int matched = 0;

        //left pointer
        int left = 0;

        //length of the minimum window seen right now
        int minLen = s.length() + 1;

        //start of the minimum window seen right now
        int minStart = 0;

        //start the loop and keep increent the right pointer
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            //if t has the same character as at the right pointer, reduce the frequency of that
            // character
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                //this means that if we have found all occurences of a character in t, in s, then
                // increase the matched by 1. meaning we have satisfied one condition
                if (map.get(rightChar) == 0) matched++;
            }

            //if number of matched characters is equal to the map size (chars in t), it means
            // that we have found a window substring
            while (matched == map.size()) {

                //if curr windown len is less than minLen, change the values
                if (minLen > right - left + 1) {
                    minLen = right - left + 1;

                    //set where the min window starts
                    minStart = left;
                }
                //we need to move the left pointer so get the char at left
                char deleted = s.charAt(left++);

                //if map t has that char at left.. and if the frequency has become 0 in the map,
                // reduce the number of matches by 1
                if (map.containsKey(deleted)) {
                    if (map.get(deleted) == 0) matched--;
                    map.put(deleted, map.get(deleted) + 1);
                }
            }
        }
        return minLen > s.length() ? "" : s.substring(minStart, minStart + minLen);
    }


    public static void main(String[] args) {
        System.out.println(findMinWindowSubstring("ADOBECODEBANC", "ABC"));
        System.out.println(minWindow("ADOBECODEBANC", "ABECOD"));
        System.out.println(findMinWindowSubstring("a", "b"));
    }
}
