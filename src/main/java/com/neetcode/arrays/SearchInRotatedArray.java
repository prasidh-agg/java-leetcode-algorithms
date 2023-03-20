package com.neetcode.arrays;

public class SearchInRotatedArray {

    public static int searchRotatedSortedArray(int[] nums, int target){

        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(target == nums[mid]) return mid;

            //check if left half is sorted
            if(nums[left] <= nums[mid]){
                if(target >= nums[left] && target <= nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            //right half sorted..
            else{
                if(target >= nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(searchRotatedSortedArray(new int[]{4,5,6,7,0,1,2}, 7));
        System.out.println(searchRotatedSortedArray(new int[]{4,5,6,7,8,1,2,3}, 8));
        System.out.println(searchRotatedSortedArray(new int[]{5,0,1,2,3,4}, 0));
    }
}
