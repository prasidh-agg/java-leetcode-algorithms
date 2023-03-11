package com.neetcode.bitmanipulation;

public class Counting1Bits {
    public static int countOf1Bits(int n){

        // 7 -> 111
        // 111 & 110 -> 110 (count 1)
        // 110 & 101 -> 100 (count 2)
        // 100 & 011 -> 000 (count 3)
        int count = 0;
        while(n != 0){
            count++;
            // do AND of n with n-1. which basically means that take the last bit and make it 0..
            // because if its an odd number.. then last bit will be 1 -> if we AND with n-1 (even
            // number with last bit 0), n's last bit will become 0. Same for even numbers. So
            // basically we turn the last bit as 0 one by one until the entire number reaches 0.
            n &= (n-1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOf1Bits(32));
        System.out.println(countOf1Bits(7));
    }
}
