package com.neetcode.stack;

import java.util.Stack;

public class MinStack{
    Stack<Long> stack = new Stack<>();
    Long mini;

    public MinStack() {
        mini = Long.MAX_VALUE;
    }

    public void push(int value) {
      Long val = (long) value;
      if(stack.isEmpty()){
          mini = val;
          stack.push(val);
      }
      else{
          if(val < mini){
              //push a modified value
              stack.push(2 * val - mini);
              //store the new minimum
              mini = val;
          }
          else{
              stack.push(val);
          }
      }
    }

    public void pop() {
        if(stack.isEmpty()) return;

        Long val = stack.pop();
        if(val < mini){
            //rollback to old mini
            mini = 2 * mini - val;
        }

    }

    public int top() {
        Long val = stack.peek();
        //this means that top isnt actually the minimum but a modified value, so we retireve the
        // minimal by just getting mini.
        if(val < mini){
           return mini.intValue();
        }
        return val.intValue();
    }

    public int getMin() {
        return mini.intValue();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(10);
        minStack.push(-4);
//        int param_3 = minStack.top();
//        int param_4 = minStack.getMin();
//        System.out.println("param 3 is: " + param_3);
//        System.out.println("param 4 is: " + param_4);
    }
}

