package com.neetcode.arrays;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any
 * * order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or
 * * phrase, typically using all the original letters exactly once.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagramsMethod(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String hash = String.valueOf(arr);
            if (!map.containsKey(hash)) map.put(hash, new ArrayList<>());
            map.get(hash).add(s);
        }
        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        System.out.println(groupAnagramsMethod(new String[]{"eat", "tea", "tan", "ate", "nat",
                "bat"}));
        System.out.println(groupAnagramsMethod(new String[]{""}));
        System.out.println(groupAnagramsMethod(new String[]{"a"}));

    }
}
