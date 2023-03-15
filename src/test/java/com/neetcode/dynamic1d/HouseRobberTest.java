package com.neetcode.dynamic1d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseRobberTest {

    @Test
    public void testRob() {
        int[] nums1 = {1, 2, 3, 1};
        int expected1 = 4;
        assertEquals(expected1, HouseRobber.rob(nums1));

        int[] nums2 = {2, 7, 9, 3, 1};
        int expected2 = 12;
        assertEquals(expected2, HouseRobber.rob(nums2));

        int[] nums3 = {2, 1, 1, 2};
        int expected3 = 4;
        assertEquals(expected3, HouseRobber.rob(nums3));
    }

    @Test
    public void testRobEmptyHouses(){
        int[] nums1 = {0};
        int expected = 0;
        assertEquals(expected, HouseRobber.rob(nums1));

    }
}