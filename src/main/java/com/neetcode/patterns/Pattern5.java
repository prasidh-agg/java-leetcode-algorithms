package com.neetcode.patterns;

import java.util.Scanner;

/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class Pattern5 {
    public static void drawPattern5(int num){
        for (int i = num; i >= 1; i--){
            System.out.println("*".repeat(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows required: ");
        int num = scanner.nextInt();
        drawPattern5(num);
    }
}
