class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        i = 0
        while i < len(nums):
            val = nums[i]-1
            if val < len(nums) and nums[i] != nums[val]:
                nums[i], nums[val] = nums[val], nums[i]
            else:
                i += 1
        for i in range(len(nums)):
            if nums[i] != i+1:
                return nums[i]
        return len(nums)
            
    
