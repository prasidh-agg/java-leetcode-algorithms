package com.neetcode.patterns;

import java.util.Scanner;

/*

         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *

 */
public class Pattern9 {
    public static void drawPattern9(int num){
        int maxCount = 2 * num - 1;
        for (int i = 1; i <= num; i++){
            int noOfAsterisks = (2 * i) - 1;
            int spaces = maxCount - noOfAsterisks;
            System.out.println(" ".repeat(spaces/2) + "*".repeat(noOfAsterisks) + "".repeat(spaces/2));
        }
        for (int i = num; i >= 1; i--){
            int noOfAsterisks = (2 * i) - 1;
            int spaces = maxCount - noOfAsterisks;
            System.out.println(" ".repeat(spaces/2) + "*".repeat(noOfAsterisks) + "".repeat(spaces/2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int num = scanner.nextInt();
        drawPattern9(num);
    }
}
