class Solution(object):
    def searchRange(self, nums, target):
        r=[]
        for i in range(len(nums)):
            if(nums[i]==target):
                r.append(i)
                break
        for i in range(len(nums)-1,-1,-1):
            if(nums[i]==target):
                r.append(i)
                break
        if not r:
            return -1,-1
        else:
            return r
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        