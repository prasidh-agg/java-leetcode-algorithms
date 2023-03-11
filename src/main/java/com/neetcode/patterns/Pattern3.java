package com.neetcode.patterns;

import java.util.Scanner;

/*

1
12
123
1234
12345

 */

public class Pattern3 {
    public static void drawPattern3(int num){
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows required: ");
        int num = scanner.nextInt();
        drawPattern3(num);
    }
}
