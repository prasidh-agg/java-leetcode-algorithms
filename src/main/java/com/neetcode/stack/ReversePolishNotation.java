package com.neetcode.stack;

import java.util.*;

/**
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse
 * * Polish Notation.
 * <p>
 * Evaluate the expression. Return an integer that represents the value of the expression.
 * <p>
 * Note that:
 * <p>
 * The valid operators are '+', '-', '*', and '/'.
 * Each operand may be an integer or another expression.
 * The division between two integers always truncates toward zero.
 * There will not be any division by zero.
 * The input represents a valid arithmetic expression in a reverse polish notation.
 * The answer and all the intermediate calculations can be represented in a 32-bit integer.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 * Example 2:
 * <p>
 * Input: tokens = ["4","13","5","/","+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 * Example 3:
 * <p>
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 */
public class ReversePolishNotation {

    /*
     *
     * Input: tokens = 2, 1, +, 3, *
     * * Stack -> 3, 3
     * Expression -> (2 + 1)
     */
    public static int solveReversePolishNotation(String[] tokens) {

        // push only integers to stack
        Stack<Integer> stack = new Stack<>();
        Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        int result;

        for (String currToken : tokens) {
            if (operators.contains(currToken)) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (currToken) {
                    case "+" -> result = num2 + num1;
                    case "-" -> result = num2 - num1;
                    case "*" -> result = num2 * num1;
                    case "/" -> result = num2 / num1;
                    default -> throw new IllegalStateException("Unexpected value: " + currToken);
                }
                stack.push(result);
            } else {
                stack.push(Integer.valueOf(currToken));
            }
        }
        return stack.pop();

    }

    // 3,4,+
    // [3,4]
    public static int arrayRPN(String[] tokens){
        //more than half will always be operands
        int[] result = new int[(tokens.length/2) + 1];
        int index = 0;
        for(String token : tokens){
            switch (token) {
                case "+" -> { result[index - 2] = result[index - 2] + result[index - 1]; index--;}
                case "-" -> { result[index - 2] = result[index - 2] - result[index - 1]; index--;}
                case "*" -> { result[index - 2] = result[index - 2] * result[index - 1]; index--;}
                case "/" -> { result[index - 2] = result[index - 2] / result[index - 1]; index--;}
                default -> { result[index] = Integer.parseInt(token); index++;}
            }
        }

        return result[0];

    }

    public static void main(String[] args) {
        System.out.println(arrayRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(arrayRPN(new String[]{"4", "13", "5", "/", "+"}));
        System.out.println(arrayRPN(new String[]{"4", "3", "-"}));
        System.out.println(arrayRPN(new String[]{"10", "6", "9", "3", "+", "-11"
                , "*", "/", "*", "17", "+", "5", "+"}));
    }
}
