package com.neetcode.arrays;

import java.util.*;

public class FindTwoSum {

    public static int[] twoSum(int[] n, int t) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            int diff = t - n[i];
            //if this diff exists in the map, then return array of current index plus diff's index
            if (map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            }
            //iff diff doesn't exist in map, then add n[i] to the map
            map.put(n[i], i);
        }
        return new int[]{0, 0};
    }

    public static List<List<Integer>> twoSumAll(int[] n, int t) {

        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> pairs = new ArrayList<>();

        // set to keep track of added pairs
        Set<String> addedPairs = new HashSet<>();

        for (int i = 0; i < n.length; i++) {
            int diff = t - n[i];
            if (map.containsKey(diff)) {
                int idx2 = map.get(diff);
                if (i != idx2) { // check if the pair is not the same element
                    // create a pair string and check if it has been added before
                    String pair = i + "," + idx2;
                    if (!addedPairs.contains(pair)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(i);
                        list.add(idx2);
                        pairs.add(list);
                        addedPairs.add(pair); // add the pair string to the set
                    }
                }
            }
            map.put(n[i], i);
        }
        return pairs;

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 19)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));

        System.out.println(twoSumAll(new int[]{1, 5, 3, 3, 4, 2, 3, 3}, 6));
        System.out.println(twoSumAll(new int[]{3, 3}, 6));

    }
}
