import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int n = piles.length;
        for (int i = n - 2; i >= n / 3; i -= 2) {
            sum += piles[i];
        }
        return sum;
    }
}
