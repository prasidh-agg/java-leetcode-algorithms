package com.neetcode.patterns;

import java.util.Scanner;

/*

   A
  ABA
 ABCBA
ABCDCBA

 */

public class Pattern17 {
    public static void drawPattern17(int num){
        for (int i = 0; i < num; i++) {
            // print spaces
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = ((2 * i) + 1) / 2;
            for(int j = 1; j <= (2 * i) + 1; j++){
                System.out.print(ch);
                if(j <= breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            // move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows required: ");
        int num = scanner.nextInt();
        drawPattern17(num);
    }
}
