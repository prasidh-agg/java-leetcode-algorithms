package com.neetcode.twopointers;

import java.util.Arrays;

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find
two numbers such that they add up to a specific target number. Let these two numbers be
numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array
[index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element
 twice.

Your solution must use only constant extra space.

Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 */
public class TwoSumII {
    public static int[] twoSumSortedArray(int[] nums, int target){

        int l = 0, r = nums.length - 1;
        while(l < r){
            int sum = nums[l] + nums[r];
            if(sum == target){
                return new int[]{l+1, r+1};
            }
            else if(sum < target) l++;
            else r--;
        }
        return new int[]{0,0};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumSortedArray(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSumSortedArray(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(twoSumSortedArray(new int[]{-1, 0}, -1)));
    }
}
