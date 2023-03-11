package com.neetcode.patterns;

import java.util.Scanner;

/*

A
BB
CCC
DDDD
EEEEE

 */

public class Pattern16 {
    public static void drawPattern16(int num){
        for (int i = 1; i <= num; i++){
            char c = (char)(i - 1 + 65);
            System.out.print(String.valueOf(c).repeat(i));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows required: ");
        int num = scanner.nextInt();
        drawPattern16(num);
    }
}
