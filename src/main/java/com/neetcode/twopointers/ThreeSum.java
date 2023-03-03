package com.neetcode.twopointers;

import java.util.*;

public class ThreeSum {

    /**
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
     * * i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     *
     * Notice that the solution set must not contain duplicate triplets.*
     * *
     * @param nums The input array
     * @return List of triplets*
     */
    public static List<List<Integer>> threeSumBrute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        if(!result.contains(triplet)){
                            result.add(triplet);
                        }
                    }
                }
            }
        }

        return result;

    }

    public static List<List<Integer>> threeSumOptimal(int[] nums){

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // a+b+c = 0
        // keep a as constant, and find - (b + c). (TwoSum Problem)
        for(int i = 0; i < nums.length - 2; i++){

            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if(nums[i] > 0) return result;

            int diff = -nums[i], lo = i + 1, high = nums.length -1;

            while(lo < high){
               if(nums[lo] + nums[high] == diff){
                   List<Integer> triplet = Arrays.asList(nums[i], nums[lo], nums[high]);
                   result.add(triplet);

                   //take care of duplicates
                   while(lo < high && nums[lo] == nums[lo + 1]) lo++;
                   while(lo < high && nums[high] == nums[high - 1])high--;
                   lo++; high--;
               }
               else if(nums[lo] + nums[high] < diff) lo ++;
               else high --;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSumOptimal(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSumOptimal(new int[]{0, 1, 1}));
        System.out.println(threeSumOptimal(new int[]{0, 0, 0}));
    }
}
