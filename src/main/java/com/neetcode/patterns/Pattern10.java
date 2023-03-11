package com.neetcode.patterns;

import java.util.Scanner;

/*

*
* *
* * *
* * * *
* * * * *
* * * * *
* * * *
* * *
* *
*

 */
public class Pattern10 {
    public static void drawPattern10(int num){
        for (int i = 1; i <= 2*num-1; i++) {
            int stars = i <= num ? i : 2*num-i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows required: ");
        int num = scanner.nextInt();
        drawPattern10(num);
    }
}
