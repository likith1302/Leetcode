class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        for ch in s:
            inx=t.find(ch)
            if(inx!=-1):
                t=t[:inx]+t[inx+1:]
        return t

        