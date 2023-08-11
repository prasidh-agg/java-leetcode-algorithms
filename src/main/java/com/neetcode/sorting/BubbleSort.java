package com.neetcode.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        boolean swapped;
        for(int i = n - 1; i > 0; i--){
            swapped = false;
            for(int j = 0; j < i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,6,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
