package com.neetcode.patterns;

import java.util.Scanner;

/*

* * * *
*     *
*     *
* * * *

 */
public class Pattern21 {
    public static void drawPattern21(int num){
        //outer loop runs num times
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num ; j++) {
                if(i == 1 || i == num || j == 1 || j == num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int num = scanner.nextInt();
        drawPattern21(num);
    }
}
