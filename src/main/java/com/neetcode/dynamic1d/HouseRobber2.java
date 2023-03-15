package com.neetcode.dynamic1d;

//Same concept and code as that of HouseRobber
//this time first and last houses are adjacent to each other..

import java.util.Arrays;

public class HouseRobber2 {
    public static int rob(int[] nums){
        if(nums.length == 1) return nums[0];
        int choice1 = robHelper(Arrays.copyOfRange(nums, 0, nums.length - 1));
        int choice2 = robHelper(Arrays.copyOfRange(nums, 1, nums.length));
        return Math.max(choice1, choice2);

    }
    public static int robHelper(int[] nums){
        int prev2 = 0, prev = nums[0];
        for(int i = 0; i < nums.length; i++){
            int pick = nums[i];
            if(i > 1){
                pick += prev2;
            }
            int notPick = prev;
            int curr = Math.max(pick, notPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;

    }
    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,3,2}));
    }
}
