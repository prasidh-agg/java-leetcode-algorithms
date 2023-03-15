package com.neetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generatePascals(int numOfRows){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row, prev = null;

        for (int i = 0; i < numOfRows; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }
            prev = row;
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(generatePascals(5));
        System.out.println(generatePascals(6));

    }
}
