package com.neetcode.bitmanipulation;

public class SumWithoutPlus {

    public static int getSum(int a, int b) {
        int carry;
        while (b != 0) {
            carry = a & b; // bitwise AND operation
            a = a ^ b; // bitwise XOR operation
            b = carry << 1; // bitwise left shift operation
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(4, 10));
    }
}
