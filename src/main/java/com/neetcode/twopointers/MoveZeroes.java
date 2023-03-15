package com.neetcode.twopointers;

import java.util.Arrays;

public class MoveZeroes {
    /*
    Keep a track of where the last non zero was found. If a non zero comes, swap the current
    element with the one found at the last non zero position
     */
    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        int cur = 0;
        while (cur < nums.length) {
            if (nums[cur] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt++] = nums[cur];
                nums[cur] = temp;
            }
            cur++;
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,0,8,0,9};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
