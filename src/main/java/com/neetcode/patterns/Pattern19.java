package com.neetcode.patterns;

import java.util.Scanner;

/*

* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *

 */
public class Pattern19 {
    public static void drawPattern19(int num){
        //outer loop runs 2 * num times
        for(int i = 0; i < 2*num; i++){

            //asterisks
            int asterisks = i < num ? 2*(num - i) : 2*(i - num + 1);

            int spaces = 2*num - asterisks;
            System.out.print("*".repeat(asterisks/2));

            //inner loop for spaces
            System.out.print(" ".repeat(spaces));

            //remaining asterisks
            System.out.print("*".repeat(asterisks/2));

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int num = scanner.nextInt();
        drawPattern19(num);
    }
}
