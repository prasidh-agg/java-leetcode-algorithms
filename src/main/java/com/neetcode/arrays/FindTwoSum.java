package com.neetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 19)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }
}
