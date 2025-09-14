class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        n=len(nums)
        result=[-1]*n
        stack=[]
        for i in range(2*n):
            cur=nums[i%n]
            while stack and cur > nums[stack[-1]]:
                result[stack.pop()]=cur
            if i <n:
                stack.append(i)
        return result
            

