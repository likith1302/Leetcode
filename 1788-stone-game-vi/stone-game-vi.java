import java.util.*;

class Solution {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int n = aliceValues.length;
        int[][] stones = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            stones[i][0] = aliceValues[i] + bobValues[i]; // total value
            stones[i][1] = i; // index
        }
        
        Arrays.sort(stones, (a, b) -> b[0] - a[0]); // sort by total
        
        int alice = 0, bob = 0;
        for (int i = 0; i < n; i++) {
            int idx = stones[i][1];
            if (i % 2 == 0) alice += aliceValues[idx]; // Alice’s turn
            else bob += bobValues[idx]; // Bob’s turn
        }
        
        if (alice > bob) return 1;
        if (alice < bob) return -1;
        return 0;
    }
}
