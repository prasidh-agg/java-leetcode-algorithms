package com.neetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsSequence(int[] nums){

        //add everything to a hashset
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int maxCount = 0;
        for(int n : nums){
            int count = 1;
            if(set.contains(n + 1))continue;
            while(set.contains(--n)){
                count += 1;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(longestConsSequence(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(longestConsSequence(new int[]{100, 99, 98, 97, 1, 2, 3}));
        System.out.println(longestConsSequence(new int[]{100, 99, 98, 97, 1, 2, 3, 4, 5}));
    }
}
