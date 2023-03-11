package com.neetcode.patterns;

import java.util.Scanner;

/*

*
* *
* * *
* * * *
* * * * *

 */
public class Pattern2 {
    public static void drawPattern2(int num){
        for (int i = 1; i <= num; i++){
            System.out.println("*".repeat(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows required: ");
        int num = scanner.nextInt();
        drawPattern2(num);
    }
}
