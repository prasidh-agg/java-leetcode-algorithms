package com.neetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums of unique elements, return all possible
 * subsets
 *  (the power set).
 *
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]*
 */
public class Subsets {

    public static List<List<Integer>> findAllSubsets(int[] arr){

        List<List<Integer>> result = new ArrayList<>();

        backtracking(0, arr, new ArrayList<>(), result);
        return result;
    }

    private static void backtracking(int index, int[] arr, List<Integer> workList,
                                     List<List<Integer>> result) {
        if(index == arr.length){
            result.add(new ArrayList<>(workList));
            return;
        }

        //pick case
        workList.add(arr[index]);
        backtracking(index + 1, arr, workList, result);
        workList.remove(workList.size() - 1);

        //not pick case
        backtracking(index + 1, arr, workList, result);
    }

    public static void main(String[] args) {
        System.out.println(findAllSubsets(new int[]{1,2,3}));
    }
}
