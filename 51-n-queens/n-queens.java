import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(0, board, result);
        return result;
    }

    private void backtrack(int col, char[][] board, List<List<String>> result) {
        if (col == board.length) {
            result.add(constructBoard(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                backtrack(col + 1, board, result);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    private boolean isSafe(int row, int col, char[][] board) {
        // Check left in the current row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') return false;
        }

        // Upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Lower-left diagonal
        for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private List<String> constructBoard(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }
}

