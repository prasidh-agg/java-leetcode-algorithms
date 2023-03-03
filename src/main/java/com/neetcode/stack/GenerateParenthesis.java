package com.neetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis {

    public static List<String> generateParethesisStack(int n){

        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push("(");

        while(!stack.isEmpty()){
            String curr = stack.pop();
            if(curr.length() == 2*n){
                result.add(curr);
            } else{
                int open = 0, close = 0;
                for(char c : curr.toCharArray()){
                    if(c == '(')open++;
                    else close++;
                }
                if(open < n){
                    stack.push(curr + "(");
                }
                if(open > close){
                    stack.push(curr + ")");
                }
            }
        }
        return result;

    }

    public static List<String> generateParenthesisBacktrack(int n) {

        List<String> result = new ArrayList<>();
        backtrack(0, 0, n, new StringBuilder(), result);
        return result;
    }

    private static void backtrack(int open, int close, int n, StringBuilder curr,
                               List<String> result) {

        if (curr.length() == 2 * n) {
            result.add(curr.toString());
            return;
        }
        if (open < n) {
            curr.append("(");
            backtrack(open + 1, close, n, curr, result);
            curr.deleteCharAt(curr.length() - 1);
        }
        if (open > close) {
            curr.append(")");
            backtrack(open, close + 1, n, curr, result);
            curr.deleteCharAt(curr.length() - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(generateParenthesisBacktrack(2));
        System.out.println(generateParethesisStack(3));
        System.out.println(generateParenthesisBacktrack(4));
    }
}
