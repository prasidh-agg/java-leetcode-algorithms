package com.neetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static boolean hasDuplicates(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.add(num)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicates(new int[]{1,2,3,1}));
        System.out.println(hasDuplicates(new int[]{1,2,3,4}));
        System.out.println(hasDuplicates(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
