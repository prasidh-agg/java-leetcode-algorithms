package com.neetcode.patterns;

import java.util.Scanner;

/*

1
22
333
4444
55555

 */

public class Pattern4 {
    public static void drawPattern4(int num){
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows required: ");
        int num = scanner.nextInt();
        drawPattern4(num);
    }
}
