package com.neetcode.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        if(arr.length < 2) return;

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,13,4,1,3,6,28};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
