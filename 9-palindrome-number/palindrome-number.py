class Solution:
    def isPalindrome(self, x: int) -> bool:
        if(x<0):
            return False
        org=x
        rev=0
        while(x!=0):
            rev=rev*10+(x%10)
            x//=10
        if rev==org:
            return True
        else:
            return False