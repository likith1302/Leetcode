class Solution {
    public boolean is_safe(char[][] board, int row, int col, int num) {
        char ch = (char)(num + '0');
        
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch) return false; // column check
            if (board[row][i] == ch) return false; // row check
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == ch) return false;
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == 9) return true;

        int nrow = row;
        int ncol = col + 1;
        if (ncol == 9) {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        }

        for (int i = 1; i <= 9; i++) {
            if (is_safe(board, row, col, i)) {
                board[row][col] = (char)(i + '0');
                if (helper(board, nrow, ncol)) {
                    return true;
                }
                board[row][col] = '.'; // backtrack
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}

