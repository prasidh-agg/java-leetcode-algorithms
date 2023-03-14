package com.neetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of distinct integers candidates and a target integer target, return a list of
 * * all unique combinations of candidates where the chosen numbers sum to target. You may return
 * * the combinations in any order.
 * <p>
 * The same number may be chosen from candidates an unlimited number of times. Two combinations
 * * are unique if the frequency of at least one of the chosen numbers is different.
 * <p>
 * The test cases are generated such that the number of unique combinations that sum up to target
 * * is less than 150 combinations for the given input.
 * <p>
 * Example 1:
 * <p>
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 * Explanation:
 * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 * 7 is a candidate, and 7 = 7.
 * These are the only two combinations.*
 */
public class CombinationSum {

    public static List<List<Integer>> findAllCombinationSum(int[] nums, int target){

        List<List<Integer>> result = new ArrayList<>();
        backtracking(0, nums, target, new ArrayList<>(), result);

        return result;
    }

    private static void backtracking(int index, int[] nums, int target, List<Integer> workList,
                                     List<List<Integer>> result) {
        if(index == nums.length){
            if(target == 0){
                result.add(new ArrayList<>(workList));
            }
            return;
        }

        if(nums[index] <= target){
            workList.add(nums[index]);
            backtracking(index, nums, target - nums[index], workList, result);
            workList.remove(workList.size() - 1);
        }
        backtracking(index + 1, nums, target, workList, result);
    }

    public static void main(String[] args) {
        System.out.println(findAllCombinationSum(new int[]{2,3,6,7}, 7));
        System.out.println(findAllCombinationSum(new int[]{2,3,5}, 8));
    }
}
