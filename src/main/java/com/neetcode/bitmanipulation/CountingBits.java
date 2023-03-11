package com.neetcode.bitmanipulation;

import java.util.Arrays;

public class CountingBits {
    public static int[] arrayCount1Bits(int n){
        int[] result = new int[n + 1];
        for(int i = 0; i <= n; i++){
            result[i] = Counting1Bits.countOf1Bits(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayCount1Bits(5)));
        System.out.println(Arrays.toString(arrayCount1Bits(10)));
    }
}
