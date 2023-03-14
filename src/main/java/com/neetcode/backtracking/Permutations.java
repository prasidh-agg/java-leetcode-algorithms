package com.neetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of distinct integers, return all the possible permutations. You can return
 * * the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]*
 */
public class Permutations {
    public static List<List<Integer>> findAllPermutations(int[] arr){

        List<List<Integer>> result = new ArrayList<>();

        backtracking(0, arr, new ArrayList<>(), result);
        return result;
    }
    private static void backtracking(int index, int[] arr, List<Integer> workList,
                                     List<List<Integer>> result) {

    }

    public static void main(String[] args) {
        System.out.println(findAllPermutations(new int[]{1,2,3}));
    }
}
