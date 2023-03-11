package com.neetcode.patterns;

import java.util.Scanner;

/*

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

 */
public class Pattern1 {
    public static void drawPattern1(int num){
        for (int i = 0; i < num; i++){
            System.out.println("*".repeat(num));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows required: ");
        int num = scanner.nextInt();
        drawPattern1(num);
    }
}
