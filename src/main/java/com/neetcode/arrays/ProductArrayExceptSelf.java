package com.neetcode.arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf {

    public static int[] productOfArrayExceptSelf(int[] nums){

        //create one array, which stores at every index, the product of whatever comes before
        // (prefix), and the product of whatever comes after(postfix). Multiply both of them to
        // get the product of the array except self
        // array -> 1,2,3,4
        // postfix - > 1
        // 1,1,2,6

        int[] result = new int[nums.length];
        int prefix = 1;
        for(int i = 0; i < nums.length; i++){
            result[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            result[i] *= postfix;
            postfix *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productOfArrayExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productOfArrayExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }
}
