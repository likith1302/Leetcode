import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] r = new String[n];
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> score[b] - score[a]);

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                r[indices[i]] = "Gold Medal";
            } else if (i == 1) {
                r[indices[i]] = "Silver Medal";
            } else if (i == 2) {
                r[indices[i]] = "Bronze Medal";
            } else {
                r[indices[i]] = String.valueOf(i + 1);
            }
        }

        return r;
    }
}