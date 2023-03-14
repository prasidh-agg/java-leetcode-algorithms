package com.neetcode.patterns;

import java.util.Scanner;

/*
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

 */
public class Pattern22 {
    public static void drawPattern21(int num) {

        for (int i = 0; i < 2 * num - 1; i++) {
            for (int j = 0; j < 2 * num - 1; j++) {

                int top = i;
                int bottom = j;
                int right = (2 * num - 2) - j;
                int left = (2 * num - 2) - i;

                System.out.print(num - Math.min(Math.min(top, bottom), Math.min(left, right)) +
                        " ");
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
