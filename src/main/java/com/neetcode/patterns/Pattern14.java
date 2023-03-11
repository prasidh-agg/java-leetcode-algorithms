package com.neetcode.patterns;

import java.util.Scanner;

/*

A
AB
ABC
ABCD
ABCDE

 */

public class Pattern14 {
    public static void drawPattern14(int num){
        for (int i = 1; i <= num; i++){
            for (int j = 0; j < i; j++) {
                char c = (char)(j + 65);
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows required: ");
        int num = scanner.nextInt();
        drawPattern14(num);
    }
}
