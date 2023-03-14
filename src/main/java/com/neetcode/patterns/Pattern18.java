package com.neetcode.patterns;

import java.util.Scanner;

/*

E
DE
CDE
BCDE
ABCDE

 */


public class Pattern18 {
    public static void drawPattern18(int num){

        //outer loop runs n number of times
        for (int i = 1; i <= num; i++){
            //inner loop runs i number of times
            char ch = 'A';
            char startingChar = (char)(ch + num - i);
            for(int j = 1; j <= i; j++){
                System.out.print(startingChar++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows required: ");
        int num = scanner.nextInt();
        drawPattern18(num);
    }
}
