from typing import List

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        i = 0
        while i < len(nums):
            val = nums[i]
            if val < len(nums) and nums[i] != nums[val]:
                nums[i], nums[val] = nums[val], nums[i]
            else:
                i += 1
        for i in range(len(nums)):
            if nums[i] != i:
                return i
        return len(nums)
            