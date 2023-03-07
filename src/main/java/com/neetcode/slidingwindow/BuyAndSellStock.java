package com.neetcode.slidingwindow;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a
different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any
profit, return 0.

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

 */
public class BuyAndSellStock {

    public static int bestTimeToBuyAndSellStock(int[] prices) {

        // Keep track of min on the left
        // Calculate profit by doing curr price - min -> do max(profit, maxProfit)

        int maxProfit = 0, min = prices[0], cost;
        for(int price : prices){
            cost = price - min;
            maxProfit = Math.max(cost, maxProfit);
            min = Math.min(min, price);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(bestTimeToBuyAndSellStock(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(bestTimeToBuyAndSellStock(new int[]{7, 6, 4, 3, 1}));
    }
}
