package com.neetcode.patterns;

import java.util.Scanner;

/*

ABCDE
ABCD
ABC
AB
A

 */

public class Pattern15 {
    public static void drawPattern15(int num){
        for (int i = num; i >= 0; i--){
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
        drawPattern15(num);
    }
}
