package com.neetcode.twopointers;

/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,
1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 */
public class TrappingRainWater {

    public static int trapRainWaterBetter(int[] height){

        int n = height.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int total_water = 0;

        //do 1 pass to track the max height to the left of the current bar
        left[0] = height[0];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(height[i], left[i - 1]);
        }

        //do 1 pass to track the max height to the right of the current bar
        right[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            right[i] = Math.max(height[i], right[i + 1]);
        }

        //do final pass to calculate the water trapped using left and right arrays
        for(int i = 0; i < height.length; i++){
            total_water += Math.min(left[i], right[i]) - height[i];
        }

        return total_water;

    }

    public static int trapRainWaterOptimal(int[] ht){

        int n = ht.length;
        int total_water = 0, left = 0, right = n - 1, max_left = 0, max_right = 0;

        while(left <= right) {

            if (ht[left] <= ht[right]) {
                if (ht[left] >= max_left) {
                    max_left = ht[left];
                } else {
                    total_water += max_left - ht[left];
                }
                left++;
            }
            else{
                if(ht[right] >= max_right){
                    max_right = ht[right];
                }
                else{
                    total_water += max_right - ht[right];
                }
                right--;
            }
        }

        return total_water;
    }

    public static void main(String[] args) {
        System.out.println(trapRainWaterOptimal(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(trapRainWaterOptimal(new int[]{4,2,0,3,2,5}));
        System.out.println(trapRainWaterOptimal(new int[]{3,1,2,4,0,1,3,2}));
    }
}
