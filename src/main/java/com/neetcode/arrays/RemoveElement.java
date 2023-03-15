package com.neetcode.arrays;

public class RemoveElement {
    public static int removeGivenElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,4,4,5};
        int k = removeGivenElement(arr, 4);
        for(int i = 0; i < k; i++){
            System.out.print(arr[i]);
            if(i != k - 1){
                System.out.print(", ");
            }
        }
    }
}
