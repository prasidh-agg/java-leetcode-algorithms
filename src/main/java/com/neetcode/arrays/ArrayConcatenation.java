package com.neetcode.arrays;

import java.util.Arrays;

public class ArrayConcatenation {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n + n];

        for(int i = 0; i < n; i++){
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 3})));
    }
}
