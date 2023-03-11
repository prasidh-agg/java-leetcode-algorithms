package com.neetcode.binarysearch;

public class Search2DMatrix {

    public static boolean binarySearch2DMatrix(int[][] nums, int target){

        //first use the first and last column values to see that if our target exists, then in
        // which row it exists. Then perform binary search on that row.
        int rows = nums.length;
        int cols = nums[0].length;

        //this means that if target is samller than the first element or greater than the last
        // element then it cant exist in the matrix since all the rows are sorted in non
        // decreasing order.
        if(target < nums[0][0] || target > nums[rows - 1][cols - 1]) return false;

        //think of the m*n matrix as a long sorted array.. work with indices only since we cant
        // afford to use extra space to make a new array

        int low = 0, high = (rows*cols) - 1, mid;
        while(low <= high){
            mid = low + (high - low)/2;
            int rowIndex = mid / cols;
            int colIndex = mid % cols;
            if(target == nums[rowIndex][colIndex]){
                return true;
            }
            else if(target < nums[rowIndex][colIndex]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] nums2 = new int[][]{{1,3}};
        System.out.println(binarySearch2DMatrix(nums, 0));
        System.out.println(binarySearch2DMatrix(nums, 14));
        System.out.println(binarySearch2DMatrix(nums, 1));
        System.out.println(binarySearch2DMatrix(nums, 11));
        System.out.println(binarySearch2DMatrix(nums2, 2));
    }
}
