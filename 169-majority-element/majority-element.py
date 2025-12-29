class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        seen={}
        m=0
        indx=0
        for i in nums:
            seen[i]=seen.get(i,0)+1
            if m<seen[i]:
                m=seen[i]
                indx=i
        return indx
            

        