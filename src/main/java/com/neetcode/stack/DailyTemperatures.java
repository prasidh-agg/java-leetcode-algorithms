package com.neetcode.stack;

import java.util.Arrays;
import java.util.Stack;

/*
Given an array of integers temperatures represents the daily temperatures, return an array answer
 such that answer[i] is the number of days you have to wait after the ith day to get a warmer
 temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

1 <= temps.length <= 105
30 <= temps[i] <= 100
 */
public class DailyTemperatures {

    /*
    Initialize an empty stack and an array answer of the same length as the input array
    temperatures with all values set to 0.
    Traverse the input array temperatures from left to right:
        While the stack is not empty and the current temperature is greater than the temperature
        at the index at the top of the stack:
            Pop the index from the stack.
            Set the corresponding value in the answer array to the difference between the current
             index and the popped index.
        Push the current index onto the stack.
    Return the answer array.
    The basic idea behind this approach is to maintain a stack of indices representing the
    temperatures that we still need to find a warmer day for. Whenever we encounter a temperature
    greater than the temperature at the top of the stack, we can safely assume that all the
    previous temperatures in the stack are now satisfied and we can update the corresponding answer
    values accordingly.
    */
    public static int[] getNextWarmerTemp(int[] temps) {

        int[] result = new int[temps.length];
        //stack of indices
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNextWarmerTemp(new int[]{73, 74, 75, 71, 69, 72, 76
                , 73})));
        System.out.println(Arrays.toString(getNextWarmerTemp(new int[]{30, 40, 50, 60})));
    }
}
