class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1_000_000_007;
        int n = s.length();
        long[] dp = new long[n + 1];
        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);

        dp[0] = 1; // empty subsequence

        for (int i = 1; i <= n; i++) {
            int c = s.charAt(i - 1) - 'a';
            dp[i] = (dp[i - 1] * 2) % MOD;

            if (lastSeen[c] != -1) {
                dp[i] = (dp[i] - dp[lastSeen[c] - 1] + MOD) % MOD;
            }
            lastSeen[c] = i;
        }

        return (int)((dp[n] - 1 + MOD) % MOD); // exclude empty subsequence
    }
}
