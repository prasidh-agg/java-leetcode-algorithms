package com.neetcode.dynamic1d;

import java.util.Arrays;

public class FrogJump {
    public static int frogJumpRecursive(int n, int[] heights){

        return jumpHelperRecursive(n-1, heights);

    }

    private static int jumpHelperRecursive(int n, int[] heights) {
        if(n == 0) return 0;

        int left = jumpHelperRecursive(n - 1, heights) + Math.abs(heights[n] - heights[n - 1]);
        int right = Integer.MAX_VALUE;

        if(n > 1){
            right = jumpHelperRecursive(n - 2, heights) + Math.abs(heights[n] - heights[n - 2]);
        }
        return Math.min(left, right);

    }

    public static int frogJumpMemoization(int n, int[] heights){

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return jumpHelperMemoization(n - 1, heights, dp);

    }

    private static int jumpHelperMemoization(int n, int[] heights, int[] dp) {
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];

        int left = jumpHelperMemoization(n - 1, heights, dp) + Math.abs(heights[n] - heights[n - 1]);
        int right = Integer.MAX_VALUE;

        if(n > 1){
            right = jumpHelperMemoization(n - 2, heights, dp) + Math.abs(heights[n] - heights[n - 2]);
        }
        return dp[n] = Math.min(left, right);

    }

    public static int frogJumpTabulation(int n, int[] heights){

        int[] dp = new int[n];
        for(int i = 1; i < n; i++){
            int fs = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            int ss = Integer.MAX_VALUE;
            if(i > 1){
                ss = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            }
            dp[i] = Math.min(fs, ss);
        }
        return dp[n - 1];

    }

    public static int frogJumpSpaceOpt(int n, int[] heights){

        int prev = 0, prev2 = 0;
        for(int i = 1; i < n; i++){
            int fs = prev + Math.abs(heights[i] - heights[i - 1]);
            int ss = Integer.MAX_VALUE;
            if(i > 1){
                ss = prev2 + Math.abs(heights[i] - heights[i - 2]);
            }
            int curr = Math.min(fs, ss);
            prev2 = prev;
            prev = curr;
        }
        return prev;

    }

    public static void main(String[] args) {
        System.out.println(frogJumpRecursive(4, new int[]{10,20,30,10}));
        System.out.println(frogJumpMemoization(3, new int[]{10,30,10}));
        System.out.println(frogJumpTabulation(4, new int[]{10,20,30,10}));
        System.out.println(frogJumpSpaceOpt(4, new int[]{10,20,30,10}));
    }
}
