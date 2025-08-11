class Solution:
    def resultingString(self, s: str) -> str:
        i=0
        while i<len(s)-1:
            r=ord(s[i])-ord(s[i+1])
            if abs(r)== 1 or abs(r)==25:
                s=s[:i]+s[i+2:]
                i=max(i-1,0)
            else:
                i+=1
        return s
            
