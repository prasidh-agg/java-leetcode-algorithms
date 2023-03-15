package com.neetcode.greedy;

public class MaxSubArray {

    public static int maximumSumOfSubArray(int[] nums){

        int sum = 0;
        int max = nums[0];

        for (int num : nums) {
            sum += num;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(maximumSumOfSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maximumSumOfSubArray(new int[]{5,4,-1,7,8}));
    }
}
