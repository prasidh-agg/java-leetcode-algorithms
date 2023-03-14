package com.neetcode.patterns;

import java.util.Scanner;

/*

*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *

 */
public class Pattern20 {
    public static void drawPattern20(int num){
        //outer loop runs 2 * num times
        int counter = 1;
        for(int i = 1; i <= 2*num; i++){

            //asterisks
            int asterisks = i <= num ? counter++ : --counter;

            int spaces = 2*(num - asterisks);
            System.out.print("*".repeat(asterisks));

            //inner loop for spaces
            System.out.print(" ".repeat(spaces));

            //remaining asterisks
            System.out.print("*".repeat(asterisks));

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int num = scanner.nextInt();
        drawPattern20(num);
    }
}
