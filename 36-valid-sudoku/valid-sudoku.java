class Solution {
    public boolean is_safe(char[][] board, int row, int col, int num) {
        char ch = (char)(num + '0');

        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == ch) return false; // column check
            if (i != col && board[row][i] == ch) return false; // row check
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {//check grid
            for (int j = sc; j < sc + 3; j++) {
                if ((i != row || j != col) && board[i][j] == ch) return false;
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    int num = board[row][col] - '0';
                    if (!is_safe(board, row, col, num)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
