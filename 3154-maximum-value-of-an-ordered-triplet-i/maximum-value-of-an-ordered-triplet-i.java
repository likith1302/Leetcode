class Solution {
    public long maximumTripletValue(int[] nums) {

        long maxI = nums[0];
        long maxDiff = Long.MIN_VALUE;
        long ans = 0;

        for (int k = 1; k < nums.length; k++) {

            ans = Math.max(ans, maxDiff * nums[k]);

            maxDiff = Math.max(maxDiff, maxI - nums[k]);

            maxI = Math.max(maxI, nums[k]);
        }

        return ans;
    }
}