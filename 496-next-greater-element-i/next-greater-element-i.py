class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result={}
        stack=[]
        for num in nums2:
            while stack and num > stack[-1]:
                prev=stack.pop()
                result[prev]=num
            stack.append(num)
        for num in stack:
            result[num]=-1
        return [result[num] for num in nums1]
            
