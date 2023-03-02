package com.neetcode.arbitrary;

public class MinCostColors {

    public static int minCostUniqueColors(String colors, int[] cost){

        char[] arr = colors.toCharArray();
        int minCost = 0;
        int prevCost = cost[0];

        for(int i = 1; i < colors.length(); i++){
            if(arr[i] == arr[i-1]){
                minCost += Math.min(cost[i], prevCost);
                prevCost = Math.max(cost[i], prevCost);
            }
            else{
                prevCost = cost[i];
            }
        }
        return minCost;

    }

    public static void main(String[] args) {
        System.out.println(minCostUniqueColors("abaac", new int[]{1,2,3,4,5}));
        System.out.println(minCostUniqueColors("abc", new int[]{1,2,3}));
        System.out.println(minCostUniqueColors("aabaa", new int[]{1,2,3,4,1}));
        System.out.println(minCostUniqueColors("aaabbbccc", new int[]{1,2,3,4,5,6,7,8,9}));
    }
}
