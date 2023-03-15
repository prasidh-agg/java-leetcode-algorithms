package com.neetcode.twopointers;


public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        int p1 = 0;
        for(int p2 = 0; p2 < nums.length; p2++){
            if(nums[p1] != nums[p2]){
                p1++;
                nums[p1] = nums[p2];
            }
        }
        return p1+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(arr);
        for(int i = 0; i < k; i++){
            System.out.print(arr[i]);
            if(i != k - 1){
                System.out.print(", ");
            }
        }
    }
}
