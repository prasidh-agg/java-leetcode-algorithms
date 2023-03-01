package com.neetcode.twopointers;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that
 * * the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container
 * * contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this
 * case, the max area of water (blue section) the container can contain is 49.
 */
public class ContainerWithMostWater {

    public static int findContainerWithMostWater(int[] height){
        int l = 0, r = height.length - 1, area = 0, ht;
        while(l < r){
            ht = Math.min(height[l], height[r]);
            area = Math.max(area, (r - l)*ht);
            if(height[r] > height[l]) {
                l++; continue;
            }
            r--;
        }
        return area;

    }

    public static void main(String[] args) {
        System.out.println(findContainerWithMostWater(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(findContainerWithMostWater(new int[]{1,1}));
    }

}
