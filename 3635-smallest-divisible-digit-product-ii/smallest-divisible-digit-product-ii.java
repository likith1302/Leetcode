import java.util.*;

class Solution {
    private static final int[][] FACTOR = {
            {0,0,0,0}, //0
            {0,0,0,0}, //1
            {1,0,0,0}, //2
            {0,1,0,0}, //3
            {2,0,0,0}, //4
            {0,0,1,0}, //5
            {1,1,0,0}, //6
            {0,0,0,1}, //7
            {3,0,0,0}, //8
            {0,2,0,0}  //9
    };

    public String smallestNumber(String num, long t) {
        int[] need = factorize(t);
        if (need == null) return "-1";

        int[] total = new int[4];
        for (char c : num.toCharArray()) {
            int d = c - '0';
            if (d == 0) continue;
            add(total, FACTOR[d]);
        }

        int firstZero = num.indexOf('0');
        if (firstZero == -1 && contains(total, need))
            return num;

        if (firstZero == -1) firstZero = num.length();

        int[] prefix = total.clone();

        for (int i = num.length() - 1; i >= 0; i--) {
            int d = num.charAt(i) - '0';
            sub(prefix, FACTOR[d]);

            int remain = num.length() - i - 1;

            if (i > firstZero) continue;

            for (int nd = d + 1; nd <= 9; nd++) {
                if (nd == 0) continue;

                int[] req = need.clone();
                sub(req, prefix);
                sub(req, FACTOR[nd]);

                int[] digits = compress(req);
                int cnt = count(digits);

                if (cnt <= remain) {
                    StringBuilder ans = new StringBuilder();
                    ans.append(num, 0, i);
                    ans.append((char) ('0' + nd));
                    for (int k = 0; k < remain - cnt; k++)
                        ans.append('1');
                    appendDigits(ans, digits);
                    return ans.toString();
                }
            }
        }

        int[] digits = compress(need);
        int cnt = count(digits);

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < num.length() + 1 - cnt; i++)
            ans.append('1');
        appendDigits(ans, digits);

        return ans.toString();
    }

    private int[] factorize(long t) {
        int[] res = new int[4];
        int[] p = {2,3,5,7};
        for (int i = 0; i < 4; i++) {
            while (t % p[i] == 0) {
                res[i]++;
                t /= p[i];
            }
        }
        return t == 1 ? res : null;
    }

    private void add(int[] a, int[] b) {
        for (int i = 0; i < 4; i++) a[i] += b[i];
    }

    private void sub(int[] a, int[] b) {
        for (int i = 0; i < 4; i++)
            a[i] = Math.max(0, a[i] - b[i]);
    }

    private boolean contains(int[] have, int[] need) {
        for (int i = 0; i < 4; i++)
            if (have[i] < need[i]) return false;
        return true;
    }

    private int[] compress(int[] p) {
        int[] d = new int[10];

        d[8] = p[0] / 3;
        p[0] %= 3;

        d[9] = p[1] / 2;
        p[1] %= 2;

        d[4] = p[0] / 2;
        p[0] %= 2;

        if (p[0] == 1 && p[1] == 1) {
            d[6]++;
            p[0] = p[1] = 0;
        }

        if (p[1] == 1 && d[4] > 0) {
            d[4]--;
            d[6]++;
            p[1] = 0;
            p[0]++;
        }

        d[2] += p[0];
        d[3] += p[1];
        d[5] += p[2];
        d[7] += p[3];

        return d;
    }

    private int count(int[] d) {
        int s = 0;
        for (int i = 2; i <= 9; i++) s += d[i];
        return s;
    }

    private void appendDigits(StringBuilder sb, int[] d) {
        for (int i = 2; i <= 9; i++)
            while (d[i]-- > 0)
                sb.append((char) ('0' + i));
    }
}