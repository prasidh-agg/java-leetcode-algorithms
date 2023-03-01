package com.neetcode.arrays;

import java.util.HashSet;

public class ValidSudoku {

    public static boolean isValidSudokuHash(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char curr = board[i][j];
                if (board[i][j] != '.') {
                    if (!seen.add(curr + " found" + " in row " + i) || !seen.add(curr + " found " +
                            "in column " + j) || !seen.add(curr + " found in sub-box " + i / 3 +
                            "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !isValid(board, i, j, board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int column, char curr) {
        //check element there in curr row or not
        for (int i = 0; i < 9 && i != column; i++) {
            if (board[row][i] == curr) {
                return false;
            }
        }
        //check element there in curr col or not
        for (int j = 0; j < 9 && j != row; j++) {
            if (board[j][column] == curr) {
                return false;
            }
        }
        //check element there in 3*3 box or not
        for (int i = 0; i < 9; i++) {
            int rowInd = 3 * (row / 3) + i / 3;
            int colInd = 3 * (column / 3) + i % 3;
            if (rowInd != row && colInd != column) {
                if (board[rowInd][colInd] == curr) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board1 =
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] board2 =
                {{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudokuHash(board1));
        System.out.println(isValidSudokuHash(board2));
    }
}
