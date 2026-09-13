class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        int n = A.length;
        int maxOverlap = 0;

        // Try all possible shifts
        for (int dx = -n + 1; dx < n; dx++) {
            for (int dy = -n + 1; dy < n; dy++) {
                maxOverlap = Math.max(maxOverlap, overlap(A, B, dx, dy));
            }
        }
        return maxOverlap;
    }

    private int overlap(int[][] A, int[][] B, int dx, int dy) {
        int n = A.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = i + dx;
                int y = j + dy;
                if (x >= 0 && x < n && y >= 0 && y < n) {
                    if (A[i][j] == 1 && B[x][y] == 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
