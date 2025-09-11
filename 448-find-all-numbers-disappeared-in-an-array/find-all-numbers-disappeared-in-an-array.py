class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        i=0
        while i<len(nums):
            val=nums[i] -1
            if i<len(nums) and nums[i]!=nums[val]:
                nums[i],nums[val]=nums[val],nums[i]
            else:
                i+=1
        result=[]
        for i in range(len(nums)):
            if i+1 !=nums[i]:
                result.append(i+1)
        return result

