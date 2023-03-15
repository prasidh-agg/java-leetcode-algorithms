package com.neetcode.dynamic1d;

/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
 */
public class ClimbingStairs {

    public static int climbStairsRecursive(int stairs){

        if(stairs < 2){
            return 1;
        }
        return climbStairsRecursive(stairs - 1) + climbStairsRecursive(stairs - 2);

    }

    //max constraint of stairs is 45
    int[] dp = new int[46];
    public int climbStairsMemoization(int stairs){
        if(stairs < 2) return 1;
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= stairs; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[stairs];
    }

    public static int climbingStairsSpaceOpt(int stairs){
        if(stairs < 2) return 1;
        int prev = 1, prev2 = 1;
        for(int i = 2; i <= stairs; i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbStairsRecursive(3));
        System.out.println(climbStairsRecursive(5));
        System.out.println(climbingStairs.climbStairsMemoization(5));
        System.out.println(climbingStairsSpaceOpt(45));
    }

}
