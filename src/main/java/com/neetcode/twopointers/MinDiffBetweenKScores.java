package com.neetcode.twopointers;

import java.util.Arrays;

/*
You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith
student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and
the lowest of the k scores is minimized.

Return the minimum possible difference.
Example 2:

Input: nums = [9,4,1,7], k = 2
Output: 2
Explanation: There are six ways to pick score(s) of two students:
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
The minimum possible difference is 2.

 */
public class MinDiffBetweenKScores {
    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            res = Math.min(res, nums[i + k - 1] - nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minimumDifference(new int[]{9,4,1,7}, 2));
    }
}
