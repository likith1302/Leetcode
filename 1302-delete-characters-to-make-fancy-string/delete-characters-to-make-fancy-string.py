class Solution:
    def makeFancyString(self, s: str) -> str:
        r=""
        count=1
        for i in range(1,len(s)):
            if s[i]==s[i-1]:
                count+=1
            else: 
                count=1
            if count<3:
                r+=s[i]
        return s[0]+r