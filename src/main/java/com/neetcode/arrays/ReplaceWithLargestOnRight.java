package com.neetcode.arrays;

import java.util.Arrays;

public class ReplaceWithLargestOnRight {

    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int max = -1;
        for(int i = n - 1; i >= 0; i--){
            res[i] = max;
            max = Math.max(arr[i], max);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17, 18, 4, 5, 6, 9, 1})));
    }
}
