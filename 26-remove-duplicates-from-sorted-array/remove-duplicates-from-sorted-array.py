class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
     unique = sorted(set(nums))       # Generate deduplicated and sorted list
     for i in range(len(unique)):
        nums[i] = unique[i]          # Modify in-place
     return len(unique)          # Return count only