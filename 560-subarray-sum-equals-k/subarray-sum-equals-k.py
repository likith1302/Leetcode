class Solution:
    def subarraySum(self, nums, k):
        count = 0
        curr_sum = 0
        prefix_sum = {0: 1}

        for num in nums:
            curr_sum += num
            count += prefix_sum.get(curr_sum - k, 0)
            prefix_sum[curr_sum] = prefix_sum.get(curr_sum, 0) + 1

        return count