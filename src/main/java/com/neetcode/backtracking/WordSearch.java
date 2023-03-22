package com.neetcode.backtracking;

public class WordSearch {

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (search(board, word, visited, i, j, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
    private static boolean search(char[][] board, String word, boolean[][] visited, int i,
                                  int j, int wordLen){

        if(wordLen == word.length()){
            return true;
        }

        if( i < 0 || i >= board.length || j < 0 || j >= board[0].length){
            return false;
        }
        if (visited[i][j] || board[i][j] != word.charAt(wordLen)) {
            return false;
        }
        visited[i][j] = true;
        boolean result = search(board, word, visited, i-1, j, wordLen+1) || // search up
                search(board, word, visited, i+1, j, wordLen+1) || // search down
                search(board, word, visited, i, j-1, wordLen+1) || // search left
                search(board, word, visited, i, j+1, wordLen+1);   // search right
        visited[i][j] = false;
        return result;

    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEEF";
        System.out.println(exist(board, word));
    }
}
