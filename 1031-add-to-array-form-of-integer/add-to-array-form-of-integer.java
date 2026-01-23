class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> r = new ArrayList<>();
        int i = num.length - 1;
        int carry = 0;

        while (i >= 0 || k > 0 || carry > 0) {
            int x = (i >= 0) ? num[i] : 0;
            int y = k % 10;
            k /= 10;

            int sum = x + y + carry;
            carry = sum / 10;
            r.add(0, sum % 10);

            i--;
        }

        return r;
    }
}