package com.neetcode.binarysearch;

public class BinarySearch {

    public static int binarySearchArray(int[] nums, int target){

        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(binarySearchArray(new int[]{1,2,3,4,5}, 4));
        System.out.println(binarySearchArray(new int[]{-1,0,3,5,9,12}, 3));
        System.out.println(binarySearchArray(new int[]{-1,0,3,5,9,12}, 2));
    }
}
