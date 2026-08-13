class Solution {
    int[] pre, suf, best;
    char[] lc, rc, s;

    void build(int p, int l, int r) {
        if (l == r) {
            pre[p] = suf[p] = best[p] = 1;
            lc[p] = rc[p] = s[l];
            return;
        }

        int m = (l + r) / 2;
        build(p * 2, l, m);
        build(p * 2 + 1, m + 1, r);
        merge(p);
    }

    void merge(int p) {
        int L = p * 2, R = p * 2 + 1;

        lc[p] = lc[L];
        rc[p] = rc[R];

        pre[p] = pre[L];
        suf[p] = suf[R];
        best[p] = Math.max(best[L], best[R]);

        if (rc[L] == lc[R]) {
            best[p] = Math.max(best[p], suf[L] + pre[R]);

            // Entire left segment is the same character
            if (pre[L] == size(L))
                pre[p] = pre[L] + pre[R];

            // Entire right segment is the same character
            if (suf[R] == size(R))
                suf[p] = suf[R] + suf[L];
        }
    }

    // Number of elements represented by this node
    int size(int p) {
        // Not directly available, so calculate using stored values
        // This method is replaced by len[] below.
        return len[p];
    }

    int[] len;

    void update(int p, int l, int r, int idx, char c) {
        if (l == r) {
            s[l] = c;
            lc[p] = rc[p] = c;
            pre[p] = suf[p] = best[p] = 1;
            return;
        }

        int m = (l + r) / 2;

        if (idx <= m)
            update(p * 2, l, m, idx, c);
        else
            update(p * 2 + 1, m + 1, r, idx, c);

        merge(p);
    }

    public int[] longestRepeating(String str, String queryCharacters,
                                  int[] queryIndices) {
        s = str.toCharArray();

        int n = s.length;
        int k = queryIndices.length;

        pre = new int[4 * n];
        suf = new int[4 * n];
        best = new int[4 * n];
        lc = new char[4 * n];
        rc = new char[4 * n];
        len = new int[4 * n];

        initLen(1, 0, n - 1);
        build(1, 0, n - 1);

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            update(1, 0, n - 1,
                   queryIndices[i], queryCharacters.charAt(i));

            ans[i] = best[1];
        }

        return ans;
    }

    void initLen(int p, int l, int r) {
        len[p] = r - l + 1;

        if (l == r) return;

        int m = (l + r) / 2;
        initLen(p * 2, l, m);
        initLen(p * 2 + 1, m + 1, r);
    }
}