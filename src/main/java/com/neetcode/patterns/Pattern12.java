package com.neetcode.patterns;

import java.util.Scanner;

/*

1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1


 */

public class Pattern12 {
    public static void drawPattern12(int num){
        for (int i = 1; i <= num; i++) {
            for(int j = 1; j <=i; j++){
                System.out.print(j);
            }

            System.out.print(" ".repeat((2 * num) - (2 * i)));

            for(int j = i; j >=1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers of rows required: ");
        int num = scanner.nextInt();
        drawPattern12(num);
    }
}
