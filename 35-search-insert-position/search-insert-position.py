class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        for i in range(len(nums)):
            if target==nums[i]:
                return i
            else:
                if target<nums[i] and target>nums[i-1]:
                    return i
                if target >nums[len(nums)-1]:
                    return len(nums)
                if target<nums[0]:
                    return 0

            
                