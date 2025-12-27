class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        mx=0
        minp=float('inf')
        for p in prices:
            if p<minp:
                minp=p
            elif p-minp >mx:
                mx=p-minp
        return mx
        