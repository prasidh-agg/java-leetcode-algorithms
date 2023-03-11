package com.neetcode.patterns;

import java.util.Scanner;

/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


 */

public class Pattern13 {
    public static void drawPattern13(int num){
        int count = 1;
        for (int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers of rows required: ");
        int num = scanner.nextInt();
        drawPattern13(num);
    }
}
