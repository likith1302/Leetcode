class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
      r=0
      rs=[]
      digits.reverse()
      for i,dig in enumerate(digits):
            r+=dig*(10**i)
      r+=1
      st=str(r)
      for dig in st:
           n=int(dig)
           rs.append(n)
      return rs

        