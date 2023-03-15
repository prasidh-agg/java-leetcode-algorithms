package com.neetcode.dynamic1d;

//Same concept and code as that of MaxSumNonAdj
//Below code is the space optimized way
public class HouseRobber {
    public static int rob(int[] nums){
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
}
