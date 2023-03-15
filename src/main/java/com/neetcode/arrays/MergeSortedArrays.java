package com.neetcode.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //p1 points at last element of first array, barring the extra 0s
        //p2 points at last element of second array
        //i points at last index of nums1, where we need to start putting the elements
        int p1 = m - 1, p2 = n - 1, i = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            nums1[i--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }

        while (p1 >= 0) {
            nums1[i--] = nums1[p1--];
        }
        while (p2 >= 0) {
            nums1[i--] = nums2[p2--];
        }
    }

    public static void main(String[] args) {
        int[] mergedArray = new int[]{1};
        int[] array2 = new int[]{};
        merge(mergedArray, 1, array2, 0);
        System.out.println(Arrays.toString(mergedArray));
    }
}
