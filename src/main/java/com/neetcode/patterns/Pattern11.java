package com.neetcode.patterns;

import java.util.Scanner;

/*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */
public class Pattern11 {
    public static void drawPattern11(int num) {
        for (int i = 1; i <= num; i++) {
            int value = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                //toggle 1 and 0
                value = value == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows you need: ");
        int num = scanner.nextInt();
        drawPattern11(num);
    }
}
