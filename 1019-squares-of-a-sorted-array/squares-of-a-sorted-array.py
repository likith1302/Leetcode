class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        l,r=0,len(nums)-1
        pos=len(nums)-1
        res=[0]*len(nums)
        while(l<=r):
            lef=nums[l]*nums[l]
            ret=nums[r]*nums[r]
            if(lef>ret):
                res[pos]=lef
                l+=1
            else:
                res[pos]=ret
                r-=1
            pos-=1
        return res
                
