class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[] suffixSum = new int[n + 1];
        
        // Compute suffix sums for quick range totals
        for (int i = n - 1; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }
        
        // Memoization table
        Integer[][] memo = new Integer[n][n + 1];
        
        return dfs(0, 1, piles, suffixSum, memo);
    }
    
    private int dfs(int i, int M, int[] piles, int[] suffixSum, Integer[][] memo) {
        int n = piles.length;
        if (i >= n) return 0;
        if (2 * M >= n - i) return suffixSum[i]; // take all remaining
        
        if (memo[i][M] != null) return memo[i][M];
        
        int best = 0;
        // Try taking x piles (1 ≤ x ≤ 2M)
        for (int x = 1; x <= 2 * M; x++) {
            // Opponent gets dfs(i + x, max(M, x))
            best = Math.max(best, suffixSum[i] - dfs(i + x, Math.max(M, x), piles, suffixSum, memo));
        }
        
        memo[i][M] = best;
        return best;
    }
}
