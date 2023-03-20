package com.neetcode.arrays;

public class MinInRotatedSortedArray {

    //TODO: Use chatgpt to cleanup some code
    public static int findMinimumInRotatedSortedArray(int[] nums){

        int left = 0, right = nums.length - 1;
        if(nums[left] <= nums[right]) return nums[left];

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

//        while(left < right){
//
//            int mid = left + (right - left)/2;
//            if(left == mid){
//                left = right;
//            }
//            else if(right == mid){
//                right = left;
//            }
//            else{
//                //check if left half is sorted
//                if(nums[left] <= nums[mid]){
//                    left = mid;
//                }
//                //right half sorted..
//                else{
//                    right = mid;
//                }
//            }
//        }

        return nums[right];
    }

    public static void main(String[] args) {
        System.out.println(findMinimumInRotatedSortedArray(new int[]{4,5,6,7,0,1,2}));
        System.out.println(findMinimumInRotatedSortedArray(new int[]{3,4,5,1,2}));
        System.out.println(findMinimumInRotatedSortedArray(new int[]{11,13,15,17}));
    }
}
