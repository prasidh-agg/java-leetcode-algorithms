package com.neetcode.dynamic1d;

import java.util.Arrays;

public class MaxSumNonAdjacent {

    public static int maximumSumNonAdjacent(int[] arr){

        return helperRecursive(arr, arr.length - 1);
    }

    private static int helperRecursive(int[] arr, int index){
        //this means that index 1 was not picked.. if it was picked then we would have gone to
        // index --> - 1
        if(index == 0) return arr[index];

        //because there is nothing beyond that index
        if(index < 0) return 0;
        int pick = arr[index] + helperRecursive(arr, index - 2);
        int notPick = helperRecursive(arr, index - 1); //

        return Math.max(pick, notPick);

    }

    public static int maximumSumNonAdjacentMemoization(int[] arr){

        int[] dp = new int[arr.length + 1];
        Arrays.fill(dp, -1);
        return helperMemoization(arr, arr.length - 1, dp);
    }

    private static int helperMemoization(int[] arr, int index, int[] dp){
        //this means that index 1 was not picked.. if it was picked then we would have gone to
        // index --> - 1
        if(index == 0) return arr[index];

        //because there is nothing beyond that index
        if(index < 0) return 0;

        if(dp[index] != -1) return dp[index];
        int pick = arr[index] + helperMemoization(arr, index - 2, dp);
        int notPick = helperMemoization(arr, index - 1, dp); //

        return dp[index] = Math.max(pick, notPick);

    }

    public static int maximumSumNonAdjacentTabulation(int[] arr){

        int n = arr.length;
        int[] dp = new int[n + 1];
        //base case
        dp[0] = arr[0];

        for(int i = 1; i < n; i++){
            int pick = arr[i];
            if(i > 1){
                pick += dp[i - 2];
            }
            int notPick = dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }

        return dp[n - 1];
    }

    public static int maximumSumNonAdjacentSpaceOpt(int[] arr){

        int n = arr.length;
        //base case
        int prev = 0, prev2 = 0;

        for(int i = 1; i < n; i++){
            int pick = arr[i];
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
        System.out.println(maximumSumNonAdjacent(new int[]{2,1,8,9}));
        System.out.println(maximumSumNonAdjacentMemoization(new int[]{1,2,7,9,20}));
        System.out.println(maximumSumNonAdjacentTabulation(new int[]{1,2,7,9,20}));
    }
}
