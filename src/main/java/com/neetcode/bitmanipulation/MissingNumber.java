package com.neetcode.bitmanipulation;

public class MissingNumber {

    public static int findMissingNumber(int[] nums){
        //use XOR to XOR all numbers in nums, alongwith all indices.. and also finally the total
        // length of the nums. Answer will be the missing number because everything else cancels out

        int missingNumber = nums.length;
        for(int i = 0; i < nums.length; i++){
            missingNumber ^= i ^ nums[i];
        }
        return missingNumber;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{0,3,1}));
        System.out.println(findMissingNumber(new int[]{3,2,1}));
    }
}
