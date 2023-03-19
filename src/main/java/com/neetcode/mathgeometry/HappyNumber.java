package com.neetcode.mathgeometry;

import java.util.HashSet;
import java.util.Set;

/*
A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a
cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
 */
public class HappyNumber {
    public static boolean isHappyOrNot(int num){

        Set<Integer> checked = new HashSet<>();
        int currSum;

        while(checked.add(num)){
            currSum = 0;
            while(num > 0){
                // extract the rightmost digit and square it
                currSum += (num % 10) * (num % 10);

                // remove the rightmost digit
                num /= 10;
            }
            if(currSum == 1){
                return true;
            }
            else{
                num = currSum;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappyOrNot(19));
        System.out.println(isHappyOrNot(2));
    }
}
