class Solution {
    private static final int MOD = 1_000_000_007;

    public int numberOfSets(int n, int k) {
        Integer[][][] mem = new Integer[n][k + 1][2];
        return dfs(0, k, false, n, mem);
    }

    private int dfs(int i, int k, boolean drawing, int n, Integer[][][] mem) {
        if (k == 0) return 1;   // Successfully placed all segments
        if (i == n) return 0;   // Reached end without finishing
        if (mem[i][k][drawing ? 1 : 0] != null) 
            return mem[i][k][drawing ? 1 : 0];

        int ans;
        if (drawing) {
            // Option 1: Continue drawing
            // Option 2: Stop segment here, reduce k
            ans = (dfs(i + 1, k, true, n, mem) + dfs(i, k - 1, false, n, mem)) % MOD;
        } else {
            // Option 1: Skip this point
            // Option 2: Start new segment here
            ans = (dfs(i + 1, k, false, n, mem) + dfs(i + 1, k, true, n, mem)) % MOD;
        }

        return mem[i][k][drawing ? 1 : 0] = ans;
    }
}
