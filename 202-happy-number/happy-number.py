class Solution:
    @staticmethod
    def next(num : int) -> int:
        s=0
        while num!=0:
            i=num%10
            s+=i**2
            num//=10
        return s
    def isHappy(self, n: int) -> bool:
        s,f=n,self.next(n)
        while f!=1 and s!=1:
         if f==s:
            return False
         s=self.next(s)
         f=self.next(self.next(f))
        return True


        